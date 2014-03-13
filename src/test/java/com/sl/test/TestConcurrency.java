package com.sl.test;

/**
 * 类描述。
 * <p/>
 * <br>==========================
 * <br> 公司：优视科技
 * <br> 开发：sunli
 * <br> 版本：1.0
 * <br> 创建时间：2014-1-21
 * <br>==========================
 */
public class TestConcurrency {

    public static void main(String[] args) throws InterruptedException {
        Domain d = new Domain();
//        while (true) {
//
//        }
        ChangeA a = new ChangeA(d);
        for (int i = 0;i<5;i++){
            ChangeB b=new ChangeB(d);
            b.start();
            Thread.sleep(1000);
        }

        a.start();

        for (int i = 0;i<20;i++){
            ChangeB b=new ChangeB(d);
            b.start();
            Thread.sleep(1000);
        }
    }

}

class Domain {
    int x;
    volatile int y;
}


class ChangeB extends Thread {

    private Domain domain;

    public ChangeB(Domain d) {
        domain = d;
    }
    @Override
    public void run() {
        System.out.println("Thread=" + Thread.currentThread() + ",x=" + domain.x);
    }
}

class ChangeA extends Thread {
    private Domain domain;

    public ChangeA(Domain d) {
        domain = d;
    }

    @Override
    public void run() {
        domain.x = 2;
//        System.out.println("Thread=" + Thread.currentThread() + ",x=" + domain.x);
        System.out.println("ca");
    }
}