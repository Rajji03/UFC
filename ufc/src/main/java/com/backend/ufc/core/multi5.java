package com.backend.ufc.core;

class sthread5 extends Thread {

    public void run() {
        System.out.println("run");
    }

    public void start() {
        super.start();
        System.out.println("start ");
    }

}

public class multi5 {
    public static void main(String[] args) {
        sthread5 s1 = new sthread5();
        s1.start();
        System.out.println("main");
    }
}