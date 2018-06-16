package cn.kidjoker.annotation;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public void outputResult() {
        System.out.println("从组合注解配置也可以获得对应的bean");
    }

}
