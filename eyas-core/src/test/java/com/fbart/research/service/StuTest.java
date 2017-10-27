package com.fbart.research.service;

import com.fbart.research.core.infrastructure.Stu;
import com.fbart.research.core.infrastructure.mapper.StuMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {
        "classpath:eyas-core.xml"
})
public class StuTest {
    @Autowired
    private StuMapper stuMapper;

    @Test
    public void test() {
        Integer stuId = 1;
        Stu stu = stuMapper.selectById(stuId);

        System.out.println(stu.toString());
    }
}
