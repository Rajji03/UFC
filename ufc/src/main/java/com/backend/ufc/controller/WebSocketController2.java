//package com.backend.ufc.controller;
//
//import com.backend.ufc.modal.Message;
//import com.backend.ufc.modal.OutputMessage;
//import org.springframework.messaging.handler.annotation.MessageMapping;
//import org.springframework.messaging.handler.annotation.SendTo;
//import org.springframework.stereotype.Controller;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//@Controller
////@RequestMapping("/api2")
//
//public class WebSocketController2 {
//    @MessageMapping("/chat")
//    @SendTo("/topic/messages")
//    public OutputMessage send(Message message) throws Exception {
//        String time = new SimpleDateFormat("HH:mm").format(new Date());
//        return new OutputMessage(message.getFrom(), message.getText(), time);
//    }
//
//}
