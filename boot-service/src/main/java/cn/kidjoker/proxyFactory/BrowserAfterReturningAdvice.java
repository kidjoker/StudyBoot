package cn.kidjoker.proxyFactory;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class BrowserAfterReturningAdvice implements AfterReturningAdvice {


    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        decrypt();
    }

    private void decrypt() {
        System.out.println("decrypt ...");
    }
}
