//package com.backend.ufc.core;//defining  thread through Runnable interface
//
//class mr implements Runnable {
//    public void run() {
//        for (int i = 0; i < 10; i++) {    //executed by child thread
//            System.out.println("child thread");
//        }
//    }
//}
//
//
//
//
//public class multi8 {
//    public static void main(String[] args) {
//        mr r = new mr();
//        Thread t = new Thread(r);
//        t.start();
//        for (int i = 0; i < 10; i++)            //executed by main thread
//        {
//            System.out.println("main thread");
//        }
//
//
//    }
//}