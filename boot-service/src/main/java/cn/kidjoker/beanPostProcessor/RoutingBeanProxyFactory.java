package cn.kidjoker.beanPostProcessor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.lang.StringUtils;
import org.springframework.aop.framework.ProxyFactory;

import java.lang.reflect.Method;
import java.util.Map;

public class RoutingBeanProxyFactory {

    public static Object createProxy(Class targetClass, Map<String, Object> beans) {

        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setInterfaces(targetClass);
        proxyFactory.addAdvice(new VersionRoutingMethodIterceptor(targetClass, beans));
        return proxyFactory.getProxy();
    }

    static class VersionRoutingMethodIterceptor implements MethodInterceptor {

        private String classSwitch;
        private Object beanOfSwitchOn;
        private Object beanOfSwitchOff;

        public VersionRoutingMethodIterceptor(Class targetClass, Map<String, Object> beans) {

            String interfaceName = StringUtils.uncapitalize(targetClass.getSimpleName());
            if(targetClass.isAnnotationPresent(RoutingSwitch.class)) {
                this.classSwitch = ((RoutingSwitch) targetClass.getAnnotation(RoutingSwitch.class)).value();
            }
            this.beanOfSwitchOff = beans.get(this.buildBeanName(interfaceName,true));
            this.beanOfSwitchOn = beans.get(this.buildBeanName(interfaceName, false));

        }

        private String buildBeanName(String interfaceName, boolean isSwitchOn) {

            return interfaceName + (isSwitchOn ? "V1" : "V2");
        }

        @Override
        public Object invoke(MethodInvocation methodInvocation) throws Throwable {

            Method method = methodInvocation.getMethod();
            String  switchName = this.classSwitch;

            if(method.isAnnotationPresent(RoutingSwitch.class)) {
                switchName = method.getAnnotation(RoutingSwitch.class).value();
            }
            if(StringUtils.isBlank(switchName)) {
                throw new IllegalStateException("RoutingSwitch's value is blank, method: " + method.getName());
            }
            return methodInvocation.getMethod().invoke(getTargetBean (switchName), methodInvocation.getArguments());
        }

        public Object getTargetBean(String switchName) {

            boolean switchOn;
            if(switchName.equals ( "A" )) {
                switchOn = false;
            } else {
                switchOn = true;
            }
            return switchOn ? beanOfSwitchOn : beanOfSwitchOff;

        }

    }
}
