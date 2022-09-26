package com.justanother.template.engine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Engine {

    @Autowired
    public Engine() {
        System.out.println("Engine created");
    }

    public void startEngine() {
        System.out.println("Engine started");
    }

}
