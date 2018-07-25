package cn.kidjoker.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibCallOutIntroductionProxy implements MethodInterceptor, Game {

    private static CglibCallOutIntroductionProxy proxy = new CglibCallOutIntroductionProxy();

    private CglibCallOutIntroductionProxy() {}

    public static CglibCallOutIntroductionProxy getInstance() {return proxy;}

    public <T> T getProxy(Class<T> clazz) {
        return (T) Enhancer.create(clazz, this);
    }

    @Override
    public void start() {

    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {



        return null;
    }
}
