package com.fbart.research.core.io.utils;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Calculator {

    private final static ScriptEngine jse = new ScriptEngineManager().getEngineByName("JavaScript");
    public static Object cal(String expression) throws ScriptException {
        return jse.eval(expression);
    }

    public static String cal2(String expression) {
        String operators[] = {"+","-","*","/"};
        String op = "";
        for (String operator : operators) {
            if (expression.contains(operator)) {
                op = operator;
            }
        }
        int index = expression.indexOf(op);
        String first = expression.substring(0, index);
        String second = expression.substring(index + 1, expression.length());
        switch (op) {
            case "+":
                return String.valueOf(Integer.valueOf(first) + Integer.valueOf(second));
            case "-":
                return String.valueOf(Integer.valueOf(first) - Integer.valueOf(second));
            case "*":
                return String.valueOf(Integer.valueOf(first) * Integer.valueOf(second));
            case "/":
                return String.valueOf(Integer.valueOf(first) / Integer.valueOf(second));
            default:
                throw new RuntimeException("表达式有误！");
        }
    }
}
