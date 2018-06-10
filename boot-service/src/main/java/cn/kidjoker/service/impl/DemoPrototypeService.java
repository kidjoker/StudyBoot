package cn.kidjoker.service.impl;

import cn.kidjoker.service.IDemoPrototypeService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class DemoPrototypeService implements IDemoPrototypeService {

    @Override
    public void sayWord() {
        System.out.print("hehehe");
    }
}
