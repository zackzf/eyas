package com.fbart.research.web.service;

import org.springframework.stereotype.Service;

@Service
public class AspectTestService {
    public void test(String name, String welcome) {
        System.out.println("Hello," + name + "," + welcome);
    }
}
