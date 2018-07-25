package cn.kidjoker.boot.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserAction {

    @RequestMapping("/test/index")
    public void test() {
        System.out.println("123");
    }
}
