package com.backend.ufc.core;//defining  thread through Runnable interface

class mr implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {    // not executed
            System.out.println("child thread");
        }
    }
}


public class multi10 {
    public static void main(String[] args) {
        mr r = new mr();
        Thread t = new Thread(r);            //no new thread created
        t.start();                //run method of thread class executed with main body
        t.run();                //no new thread created threead class run will be called as a normal method
        for (int i = 0; i < 10; i++)            //executed by main thread
        {
            System.out.println("main thread");
        }
    }
}