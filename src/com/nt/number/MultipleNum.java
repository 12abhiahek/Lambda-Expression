package com.nt.number;

public class MultipleNum {
    public static void main(String [] args)throws Exception{
    Runnable number=()-> {
        for(int i = 0; i <= 10; i++) {
            System.out.println("number are:"+i*5);
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }finally{
                    System.out.println("This block is executed always");
                }

        }
    };
    Thread t=new Thread(number);
    t.isDaemon();
    t.start();
    t.setName("abhi");
    }

}
