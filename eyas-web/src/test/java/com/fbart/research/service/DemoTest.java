package com.fbart.research.service;

import com.fbart.research.web.service.AspectTestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:eyas.xml"})
public class DemoTest {
    @Test
    public void test01() {
        System.out.println("test...");
    }
}
