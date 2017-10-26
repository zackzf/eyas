package com.fbart.research;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by wangzhengfa on 2017/7/25.
 */
public class StuServiceInvocationHandler implements InvocationHandler{
    public StuService stuService;

    public StuServiceInvocationHandler(StuService stuService) {
        this.stuService = stuService;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        if(methodName.equals("showStu")){
            System.out.println("showStu from Proxy-1");
            Object res = method.invoke(stuService, args);
            System.out.println("showStu from Proxy-2");
            return res;
        }else {
            System.out.println("removeStu from Proxy-1");
            Object res = method.invoke(stuService, args);
            System.out.println("removeStu from Proxy-2");
            return res;
        }
    }
}
