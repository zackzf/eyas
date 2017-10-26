package com.fbart.research;

import java.lang.reflect.Proxy;

/**
 * Hello world!
 *
 */
public class App 
{
    private Door door;
    public static void main( String[] args )
    {
//        StuService stuService = new StuServiceImpl();
//        StuServiceInvocationHandler stuServiceInvocationHandler = new StuServiceInvocationHandler(stuService);
//        StuService proxy = (StuService) Proxy.newProxyInstance(stuService.getClass().getClassLoader(), stuService.getClass().getInterfaces(), stuServiceInvocationHandler);
//        String res = proxy.removeStu(11);
//        System.out.println("res="+res);

        Door door
                = new Door();
        door.dNum = 222;
        door.dName = "d222";
        System.out.println(door.toString());
    }
}
