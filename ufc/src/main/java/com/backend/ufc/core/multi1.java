package com.backend.ufc.core;

class sthread1 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread());
            System.out.println("second thread");            //executed by main thread the only single thread
        }                            // all statements executed in a row
    }
}


public class multi1 {
    public static void main(String[] args) {
        sthread s1 = new sthread();
        s1.run();                        //->no child thread created
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread());
            //act as a normal method call
            System.out.println("main thread");
        }

    }
}