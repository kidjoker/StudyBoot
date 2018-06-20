package cn.kidjoker.beanPostProcessor;

import java.sql.SQLOutput;

public class HelloServiceV1Impl implements HelloService {

    @Override
    public void sayHello() {
        System.out.println("say Hello from v1");
    }

    @Override
    public void sayHi() {
        System.out.println("say Hi from v1");
    }

}
