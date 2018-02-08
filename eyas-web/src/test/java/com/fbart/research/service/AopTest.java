package com.fbart.research.service;

import com.fbart.research.web.service.AspectTestService;
import org.aspectj.lang.annotation.Aspect;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:eyas.xml"})
public class AopTest {
    @Autowired
    private AspectTestService aspectTestService;

    @Test
    public void test01() {
        aspectTestService.test("xiaoming","欢迎你");
    }
}
