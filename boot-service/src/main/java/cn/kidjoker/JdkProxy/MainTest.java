package cn.kidjoker.JdkProxy;

public class MainTest {

    public static void main(String[] args) {
        CallOut callOut = new DynamicJdkCallOut(new TestOneCallOut()).getProxy();

        callOut.callOut();
    }
}
