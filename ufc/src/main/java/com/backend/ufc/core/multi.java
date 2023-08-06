package com.backend.ufc.core;

class sthread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("second thread");            //executed by child thread
        }
    }
}


public class multi {
    public static void main(String[] args) {

        sthread s1 = new sthread();
        s1.start();                        //child thread created
        for (int i = 0; i < 10; i++) {                    //executed by main thread
            System.out.println("main thread");
        }

    }
}