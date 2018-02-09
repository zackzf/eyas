package com.fbart.research.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:eyas.xml"})
public class DemoTest {
    Logger log = LoggerFactory.getLogger(DemoTest.class);
    @Test
    public void test01() {
        log.info(getClass().getName());
        log.info("info...");
//        System.out.println("test...");
    }
}
