package com.fbart.research.service;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wangzhengfa on 2017/8/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations= {
//        "classpath:applicationContext.xml"
//})
public interface CustomerService {
    String name = "fff";

    String genCustomerNo(Integer code);
}
