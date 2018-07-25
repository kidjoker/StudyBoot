package cn.kidjoker.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibCalloutProxy implements MethodInterceptor {

    private static CglibCalloutProxy proxy = new CglibCalloutProxy();

    private CglibCalloutProxy() {}

    public static CglibCalloutProxy getInstance() {
        return proxy;
    }

    public <T> T getProxy(Class<T> clazz) {
        return (T) Enhancer.create(clazz, this);
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        System.out.println("before");
        methodProxy.invokeSuper(o, args);
        System.out.println("after");
        return null;
    }
}
