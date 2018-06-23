package cn.kidjoker.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.Map;

@Component
public class RoutingBeanPostProcessor implements BeanPostProcessor {

    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String s) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String s) throws BeansException {

        Class clazz = bean.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for(Field field : fields) {

            // 判断注入的属性类是否有RoutingInjected注解,进行代码版本分流控制
            if(field.isAnnotationPresent(RoutingInjected.class)) {
                if(!field.getType().isInterface()) {
                    throw new BeanCreationException("RoutingInjected field must be declared as an interface: " + field.getName()
                        + " @class " + clazz.getName());
                }

                try {
                    handleRoutingInjected(field, bean, field.getType());
                } catch (IllegalAccessException ex) {
                    throw new BeanCreationException("Exception thrown when handleAutowiredRouting", ex);
                }
            }
        }

        return bean;
    }

    private void handleRoutingInjected(Field field, Object bean, Class type) throws IllegalAccessException {

        // 获取所有IOC容器中实现了对应接口的类, 使用Map作为后补队列
        Map<String, Object> candidates = this.applicationContext.getBeansOfType(type);
        field.setAccessible(true);
        if(candidates.size() == 1) {
            field.set(bean, candidates.values().iterator().next());
        }
        else if(candidates.size() == 2) {
            Object proxy = RoutingBeanProxyFactory.createProxy(type, candidates);
            field.set(bean, proxy);
        }
        else {
            throw new IllegalArgumentException("Find more than 2 beans for type: " + type);
        }


    }
}
