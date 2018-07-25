package cn.kidjoker.proxyFactory;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.RegexpMethodPointcutAdvisor;

public class ProxyFactoryTest {

    public static void main(String[] args) {

        // 1. 创建代理工厂
        ProxyFactory factory = new ProxyFactory();

        // 2. 设置目标对象
        factory.setTarget(new ChromeBrowser());

        // 3. 设置代理实现接口
        factory.setInterfaces(new Class[]{Browser.class});

        // 4. 设置拦截规则
        RegexpMethodPointcutAdvisor advisor = new RegexpMethodPointcutAdvisor();
        advisor.setPatterns("cn.kidjoker.proxyFactory.ChromeBrowser.visitInternet","cn.kidjoker.proxyFactory.ChromeBrowser.listenToMusic");
        advisor.setAdvice(new BrowserAroundAdvice());

        // 5.添加环绕增强
        factory.addAdvisor(advisor);

        // 6.获取代理对象
        Browser browser = (Browser) factory.getProxy();

        browser.visitInternet();

        System.out.println("*********************************");

        browser.listenToMusic();
    }
}
