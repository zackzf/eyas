package com.fbart.open;

import com.fbart.research.Home;

import java.math.BigDecimal;

/**
 * Created by wangzhengfa on 2017/8/11.
 */
public class TestApp {
    private Home home;

    public static void main(String[] args) {
        BigDecimal s = new BigDecimal("0.00000");
        int i = s.compareTo(new BigDecimal("0"));
        System.out.println("结果：" + i);
    }
}
