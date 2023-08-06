package com.backend.ufc.core;

class sthread3 extends Thread {


}


public class multi3 {
    public static void main(String[] args) {
        sthread3 s1 = new sthread3();
        s1.start();                        //child thread created
        //runs and compiles succesfuly
// but not prefferrd because there is no code for the thread to be executed empty method for super class thread is executed


    }
}