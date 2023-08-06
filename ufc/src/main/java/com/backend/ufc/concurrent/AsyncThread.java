package com.backend.ufc.concurrent;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class AsyncThread {
    final static List<String> finalOutPutOfBothCall= new ArrayList<>();
    public static void main(String[] args) {
        CompletableFuture<List<String>> completableFuture = CompletableFuture.supplyAsync(() -> {
            return m1("rajat");
        });
        CompletableFuture<List<String>> completableFuture2 = CompletableFuture.supplyAsync(() -> m2("nancy"));
        final List<String> finalOutPutOfBothCall= new ArrayList<>();
//        final CompletableFuture<Void> allCompleted = CompletableFuture.allOf(completableFuture, completableFuture2);
        CompletableFuture.allOf(completableFuture, completableFuture2).join();
//        allCompleted.thenRun(() -> {
//            // whatever you want to do
//            List<String> m1List=null;
//            List<String> m2List=null;
//            try {
//                m1List= completableFuture.get();
//                m2List= completableFuture.get();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            } catch (ExecutionException e) {
//                e.printStackTrace();
//            }
//           finalOutPutOfBothCall.addAll(m1List);
//           finalOutPutOfBothCall.addAll(m2List);
//           System.out.println(finalOutPutOfBothCall);
//        });
        List<String> m1List=null;
        List<String> m2List=null;
        try {
            m1List= completableFuture.get();
            m2List= completableFuture.get();
            finalOutPutOfBothCall.addAll(m1List);
            finalOutPutOfBothCall.addAll(m2List);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println(finalOutPutOfBothCall);
//        combineThreadCall();

    }
    public static List<String> m1(String val)  {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("m1 inside");
        return Arrays.asList("m1 called");
    }
    public static List<String> m2(String val){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("m2 inside");
        return Arrays.asList("m2 called");
    }
    public static void combineThreadCall(){

        Thread newThread = new Thread(() -> {
            List<String>r1= m1("rajat");
            finalOutPutOfBothCall.addAll(r1);
        });
        Thread newThread2 = new Thread(() -> {
            List<String>r2= m2("nancy");
            System.out.println(r2);
            System.out.println("----");
            finalOutPutOfBothCall.addAll(r2);

        });
        System.out.println();
        newThread.start();
        newThread2.start();
        try {
            newThread.join();
            newThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (!newThread.isAlive() && !newThread2.isAlive()) {
            // do things
            System.out.println("=====");
            break;
        }
        System.out.println(finalOutPutOfBothCall);
    }
}
