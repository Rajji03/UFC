//package com.backend.ufc.controller;
//
//import com.backend.ufc.modal.Message;
//import com.backend.ufc.modal.OutputMessage;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.messaging.handler.annotation.MessageMapping;
//import org.springframework.messaging.handler.annotation.SendTo;
//import org.springframework.messaging.simp.SimpMessagingTemplate;
//import org.springframework.web.bind.annotation.*;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//@RestController
//@RequestMapping("ufc/api/websocket")
//public class WebSocketController {
//
////    @MessageMapping("/chat")
////    @SendTo("/topic/messages")
////    @RequestMapping(value="/chat",method= RequestMethod.POST)
////    public OutputMessage send(@RequestBody Message message) throws Exception {
////        String time = new SimpleDateFormat("HH:mm").format(new Date());
////        return new OutputMessage(message.getFrom(), message.getText(), time);
////    }
//    @GetMapping("/test")
//    public String testApi(){
//        return "test success";
//    }
//    @Autowired
//    private SimpMessagingTemplate template;
//
//
//
//
//    @RequestMapping(value="/chat", method=RequestMethod.POST)
//    public String greeting(@RequestBody Message message) throws Exception {
//        String time = new SimpleDateFormat("HH:mm").format(new Date());
//
//        this.template.convertAndSend("/topic/messages",new OutputMessage(message.getFrom(), message.getText(), time) );
//        return "hello";
//    }
//
//}
