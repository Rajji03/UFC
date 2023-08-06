package com.backend.ufc.controller;

import com.backend.ufc.entity.Events;
import com.backend.ufc.exception.ProductNotfoundException;
import com.backend.ufc.modal.EventModal;
import com.backend.ufc.modal.FightModal;
import com.backend.ufc.modal.UserPojo;
import com.backend.ufc.service.UserService;
import com.backend.ufc.util.ObjectParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ufc/api/backend")
public class UserController {

    @Autowired
    UserService userService;

//    @PostMapping("/register")
//    public String register(@RequestBody UserPojo userPojo) {
//        return userService.register(userPojo);
//    }

    @PostMapping("/register2")
    public String register2(@RequestBody String requestBody) throws Exception, ProductNotfoundException {
        UserPojo userPojo = ObjectParser.JsonToJavaObject(requestBody, UserPojo.class);
        if (userPojo == null) {
            throw new Exception("error my");
        }
        String response = userService.register(userPojo);
        return response;
    }

    @PostMapping("/insertFighter")
    public String insertFighter(@RequestBody String requestBody) throws Exception, ProductNotfoundException {
        UserPojo userPojo = ObjectParser.JsonToJavaObject(requestBody, UserPojo.class);
        if (userPojo == null) {
            throw new Exception("error my");
        }
        String response = userService.insertFighter(userPojo);
        return response;
    }

    @PostMapping("/insertFighterRecord")
    public String insertFighterRecord(@RequestBody String requestBody) throws Exception, ProductNotfoundException {
        ObjectParser objectParser = new ObjectParser();
        UserPojo userPojo = ObjectParser.JsonToJavaObject(requestBody, UserPojo.class);
        if (userPojo == null) {
            throw new Exception("error my");
        }
        String response = userService.insertFighterRecords(userPojo);
        return response;
    }

    @PostMapping("/createEvent")
    public String createEvent(@RequestBody String requestBody) throws Exception, ProductNotfoundException {
        ObjectParser objectParser = new ObjectParser();
        EventModal eventModal = ObjectParser.JsonToJavaObject(requestBody, EventModal.class);
        if (eventModal == null) {
            throw new Exception("error my");
        }
        return userService.createEvent(eventModal);
    }

    @PostMapping("/addFight")
    public String addFightInEvent(@RequestBody String requestBody) throws Exception, ProductNotfoundException {
        ObjectParser objectParser = new ObjectParser();
        FightModal fightModal = ObjectParser.JsonToJavaObject(requestBody, FightModal.class);
        if (fightModal == null) {
            throw new Exception("error my");
        }
        return userService.addFightInEvent(fightModal);
    }

    @PostMapping("/addFights")
    public String addFightsInEvent(@RequestBody String requestBody) throws Exception, ProductNotfoundException {
        ObjectParser objectParser = new ObjectParser();
        FightModal fightModal = ObjectParser.JsonToJavaObject(requestBody, FightModal.class);
        if (fightModal == null) {
            throw new Exception("error my");
        }
        return userService.addFightsInEvent(fightModal);
    }

    @PostMapping("/getEvent")
    public Events getEvent(@RequestBody  EventModal eventModal) {
        System.out.println("!!!!!!!!!!!!!!");
        Events events= userService.getEvent(eventModal.getEventName());
        return events;
    }
}
