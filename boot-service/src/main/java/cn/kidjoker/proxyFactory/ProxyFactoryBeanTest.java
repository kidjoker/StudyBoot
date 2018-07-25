package cn.kidjoker.proxyFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProxyFactoryBeanTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/config/proxyFactoryBean.xml");
        Browser browser = (Browser) context.getBean("browserProxy");
        browser.visitInternet();
    }
}
