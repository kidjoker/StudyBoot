package cn.kidjoker.JdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicJdkHandler implements InvocationHandler {

    private CallOut callout;

    public DynamicJdkHandler(CallOut callOut) {
        this.callout = callOut;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置处理");
        method.invoke(callout, args);
        System.out.println("后置处理");
        return null;
    }
}
