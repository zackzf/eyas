package com.fbart.research;

/**
 * Created by wangzhengfa on 2017/7/25.
 */
public class StuServiceImpl implements StuService{
    public String showStu(Integer id){
        System.out.println("id="+id+",show");
        return "show Success";
    }
    public String removeStu(Integer id){
        System.out.println("id="+id+",remove");
        return "remove Success";
    }
}
