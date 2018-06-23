package cn.kidjoker.beanPostProcessor;

import org.springframework.stereotype.Service;

@Service("helloServiceV2")
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
