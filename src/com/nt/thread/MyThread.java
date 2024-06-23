package com.nt.thread;

import java.io.IOException;

public class MyThread {
    public static void main(String[] args) throws Exception {
        Runnable thread = () -> {
            for (int i = 0; i <= 10; i++) {
                System.out.println("vlaue of thread are:" + i);
                try {
                    Thread.sleep(1000);
                } catch(InterruptedException e) {
                    e.printStackTrace();

                }finally {
                    System.out.println("this block will always execute");
                }
            }

        };
        Thread thread1=new Thread(thread);
        thread1.setName("abhishek");
        thread1.getName();
        thread1.isDaemon();
        thread1.start();



    }
}