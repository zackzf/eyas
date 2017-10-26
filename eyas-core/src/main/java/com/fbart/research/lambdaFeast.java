package com.fbart.research;

import java.util.Arrays;

/**
 * Created by wangzhengfa on 2017/7/28.
 */
public class lambdaFeast {
        public static void main(String[] args) {
//            EnumFeast.Type myType=EnumFeast.Type.TYPEB;

//            EnumFeast.Type myType = EnumFeast.Type.valueOf("TYPEA");
//            handle(myType);

            try {
                EnumFeast.Type type = EnumFeast.Type.getType(1);
                System.out.println(type.getName());
            } catch (Exception e) {
                e.printStackTrace();
            }


//        Arrays.asList("a","b","c","d").forEach(p -> {
//            System.out.println(p);
//            System.out.println("==");
//        });

//        Arrays.asList( "a", "b", "d" ).forEach( e -> System.out.println( e ) );
    }

    public static void handle(EnumFeast.Type type) {
        System.out.println("类型信息,枚举名："+type.name()+"，类型号："+type.getNum()+",类型名："+type.getName());
    }
}
