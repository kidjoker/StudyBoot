package cn.kidjoker.service.impl;

import cn.kidjoker.service.IDemoSingletonService;
import org.springframework.stereotype.Service;

@Service
public class DemoSingletonService implements IDemoSingletonService {

    @Override
    public void sayWord() {
        System.out.print("hahaha");
    }

}
