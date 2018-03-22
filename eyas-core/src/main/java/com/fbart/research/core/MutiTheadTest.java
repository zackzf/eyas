package com.fbart.research.core;

public class MutiTheadTest {
    Runnable r1 = new Runnable() {

        @Override
        public void run() {
            long l1 = System.currentTimeMillis();
            long l2;
            Thread.currentThread().setName("我的线程1");
            try {
                Thread.sleep(1000L * 30);
            } catch (InterruptedException e) {
                l2 = System.currentTimeMillis();
                System.out.println(Thread.currentThread().getName() + "被中断，执行时间：" + (l2 - l1));
            }
            System.out.println(Thread.currentThread().getName() + "执行结束。");
        }
    };

    Runnable r2 = new Runnable() {

        @Override
        public void run() {
            long l1 = System.currentTimeMillis();
            long l2;
            Thread.currentThread().setName("我的线程2");
            try {
                Thread.sleep(1000L * 5);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "被中断。");
            }
            l2 = System.currentTimeMillis();
            System.out.println(Thread.currentThread().getName() + "执行结束，执行时间：" + (l2 - l1));
        }
    };

    public static void main(String[] args) {
        MutiTheadTest mutiTheadTest = new MutiTheadTest();
        Thread t1 = new Thread(mutiTheadTest.r1);
        t1.start();
        Thread t2 = new Thread(mutiTheadTest.r2);
        t2.start();
        try {
            Thread.sleep(1000L * 3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.interrupt();
    }
}
