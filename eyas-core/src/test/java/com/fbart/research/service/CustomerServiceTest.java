package com.fbart.research.service;

import org.hamcrest.Matcher;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.jmock.syntax.ReceiverClause;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by wangzhengfa on 2017/8/11.
 */
public class CustomerServiceTest {
    private Mockery mockery = new JUnit4Mockery();
    private CustomerService customerService;

    @Before
    public void setUp() throws Exception {
        customerService = mockery.mock(CustomerService.class);
//        mockery.checking(new Expectations(){
//            {
//
//                exactly(1).of(customerService).genCustomerNo(111);
//                will(returnValue("code222"));
//            }
//        });

    }

    @Test
    public void testGenCustomerNo() throws Exception {
        String no = customerService.genCustomerNo(111);
        System.out.println("No:"+no);
    }
}
