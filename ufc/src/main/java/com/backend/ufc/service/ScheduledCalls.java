package com.backend.ufc.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@EnableScheduling
public class ScheduledCalls {
    //    @Scheduled(fixedDelay = 1000)
//    public void scheduleFixedDelayTask() {
//        System.out.println(
//                "Fixed delay task - " + System.currentTimeMillis() / 1000);
//    }
//    @Scheduled(fixedDelay = 1000, initialDelay = 1000)
//    public void scheduleFixedRateWithInitialDelayTask() {
//
//        long now = System.currentTimeMillis() / 1000;
//        System.out.println(
//                "Fixed rate task with one second initial delay - " + now);
//    }
//    @Async
//    @Scheduled(fixedRate = 5000)
//    public void scheduleFixedRateTaskAsync() throws InterruptedException {
//        String temp= String.valueOf(System.currentTimeMillis() / 1000);
//        System.out.println("++++++++++++++="+temp);
//        System.out.println(
//                "Fixed rate task async - " + System.currentTimeMillis() / 1000);
//        Thread.sleep(6000);
//        System.out.println("------->"+temp);
//    }
}
