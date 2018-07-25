package cn.kidjoker.proxyFactory;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BrowserBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        encrypt();
    }

    private void encrypt() {
        System.out.println("encrypt ...");
    }

}
