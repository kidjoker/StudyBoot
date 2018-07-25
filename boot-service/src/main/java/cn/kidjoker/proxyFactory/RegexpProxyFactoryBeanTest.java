package cn.kidjoker.proxyFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RegexpProxyFactoryBeanTest {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/config/proxyFactoryBean-regexp.xml");
        ChromeBrowser browser = (ChromeBrowser) ctx.getBean("browserProxy");
        browser.seeMovie("sun shine");
    }

}
