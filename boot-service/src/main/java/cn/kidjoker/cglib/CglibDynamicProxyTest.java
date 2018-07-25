package cn.kidjoker.cglib;

import cn.kidjoker.JdkProxy.TestOneCallOut;

public class CglibDynamicProxyTest {

    public static void main(String[] args) {

        TestOneCallOut callout = CglibCalloutProxy.getInstance().getProxy(TestOneCallOut.class);

        callout.callOut();
        callout.listenToMusic();
    }
}
