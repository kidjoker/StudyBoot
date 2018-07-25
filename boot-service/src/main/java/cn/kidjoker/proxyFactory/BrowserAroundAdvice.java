package cn.kidjoker.proxyFactory;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class BrowserAroundAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        encrypt();
        Object retVal = methodInvocation.proceed();
        decrypt();
        return retVal;
    }

    private void encrypt() {
        System.out.println("encrypt ...");
    }

    private void decrypt() {
        System.out.println("decrypt ...");
    }
}
