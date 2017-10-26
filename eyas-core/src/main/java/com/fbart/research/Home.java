package com.fbart.research;

import com.fbart.open.TestApp;

/**
 * Created by wangzhengfa on 2017/8/11.
 */
public class Home {
    public static void main(String[] args) {
        Door door = new Door();
        door.dName = "d123";
        door.dNum = 123;
        System.out.println(door.toString());
    }
}

class Door {
    public String dName;
    public Integer dNum;

    @Override
    public String toString() {
        return "Door{" +
                "dName='" + dName + '\'' +
                ", dNum=" + dNum +
                '}';
    }
}