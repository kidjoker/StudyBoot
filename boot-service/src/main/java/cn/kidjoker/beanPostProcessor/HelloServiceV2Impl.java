package cn.kidjoker.beanPostProcessor;

public class HelloServiceV2Impl implements HelloService {

    @Override
    public void sayHello() {
        System.out.println("say Hello from v2");
    }

    @Override
    public void sayHi() {
        System.out.println("say Hi from v2");
    }

}
