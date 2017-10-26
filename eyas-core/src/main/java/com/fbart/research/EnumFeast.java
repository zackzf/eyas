package com.fbart.research;

/**
 * Created by wangzhengfa on 2017/7/31.
 */
public class EnumFeast {
    public enum Type{
        TYPEA(1,"typeA"),TYPEB(2,"typeB");
        private int num;
        private String name;

        private Type(int num, String name) {
            this.num = num;
            this.name = name;
        }

        public int getNum() {
            return num;
        }

        public String getName() {
            return name;
        }

        public  static Type getType(int num) throws Exception {
            Type[] types = Type.values();
            for (Type TYPE : types) {
                if (TYPE.getNum() == num) {
                    return TYPE;
                }
            }
            throw new Exception("No such Enum");
        }
    }
}
