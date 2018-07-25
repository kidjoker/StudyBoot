package cn.kidjoker.JdkProxy;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkDynamicProxyTest {

    public static void main(String[] args) {

        CallOut callOut = new TestOneCallOut();
        DynamicJdkHandler JdkHandler = new DynamicJdkHandler(callOut);
        CallOut proxyInstance = (CallOut) Proxy.newProxyInstance(JdkHandler.getClass().getClassLoader(), new Class[]{ CallOut.class }, JdkHandler);

        System.out.println(proxyInstance instanceof Proxy);
        System.out.println(proxyInstance.getClass().toString());

        System.out.print("subject中的属性有：");
        Field[] fields = proxyInstance.getClass().getDeclaredFields();
        for(Field field : fields) {
            System.out.print(field.getName() + ", ");
        }

        Method[] methods = proxyInstance.getClass().getMethods();
        for(Method method : methods) {
            System.out.println(method.getName() + ", ");
        }
        //ProxyCallout.callOut();
    }
}