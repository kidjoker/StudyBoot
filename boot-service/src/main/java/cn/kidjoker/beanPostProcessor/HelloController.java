package cn.kidjoker.beanPostProcessor;

import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

    @RoutingInjected
    private HelloService helloService;

    public void sayHello() {
        helloService.sayHello ();
    }

    public void sayHi() {
        helloService.sayHi ();
    }
}
