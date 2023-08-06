package com.backend.ufc.core;

class sthread6 extends Thread {

    public void run() {
        System.out.println("run called by child thread");
    }


}


public class multi6 {
    public static void main(String[] args) {
        sthread6 s1 = new sthread6();
        s1.start();
        System.out.println("hello in main");                //cannot restart a thread in java RE Exception

//s1.start();
    }
}