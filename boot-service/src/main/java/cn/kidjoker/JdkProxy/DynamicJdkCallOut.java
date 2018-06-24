package cn.kidjoker.JdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicJdkCallOut implements InvocationHandler {

    private CallOut callout;

    public DynamicJdkCallOut(CallOut callOut) {
        this.callout = callOut;
    }

    public CallOut getProxy() {
        return (CallOut) Proxy.newProxyInstance(callout.getClass().getClassLoader(), callout.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置处理");
        Object returnVal = method.invoke(proxy, args);
        System.out.println("后置处理");
        return returnVal;
    }
}
