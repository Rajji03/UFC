//package com.backend.ufc.core;//defining  thread through Runnable interface
//
//class mr implements Runnable {
//    public void run() {
//        for (int i = 0; i < 10; i++) {    //not executed
//            System.out.println("child thread");
//        }
//    }
//}
//
//
//public class multi9 {
//    public static void main(String[] args) {
//        mr r = new mr();
//        Thread t = new Thread();            //no new thread created
//        t.start();                //run method of thread class executed with main body
//        for (int i = 0; i < 10; i++)            //executed by main thread
//        {
//            System.out.println("main thread");
//        }
//
//
//    }
//}