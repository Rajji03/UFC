package com.backend.ufc.service;

import com.backend.ufc.entity.*;
import com.backend.ufc.modal.EventModal;
import com.backend.ufc.modal.FightModal;
import com.backend.ufc.modal.UserPojo;
import com.backend.ufc.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class UserService {
    //    @Autowired
//    UserRepository userRepository;
    @Autowired
    private TempUserRepository tempUserRepository;
    @Autowired
    private FighterRepository fighterRepository;
    @Autowired
    private FighterRecordRepository fighterRecordRepository;

    @Autowired
    private FighterCardRepository fighterCardRepository;
    @Autowired
    private EventRepository eventRepository;

    public String register(UserPojo userPojo) {
        String response = "";
        try {
            if (userPojo.getEmail() == null || userPojo.getEmail().length() == 0)
                throw new Exception("invalid email credentials");
            TempUser tempUser = new TempUser();
            tempUser.setEmail(userPojo.getEmail());
            tempUser.setPassword(userPojo.getPassword());
            tempUserRepository.save(tempUser);
            System.out.println("saved");
//        tempUser.setUsername();
        } catch (Exception ex) {
            return ex.getLocalizedMessage();
        }

        return "done";
    }

    public String insertFighter(UserPojo userPojo) {
        Fighter fighter = new Fighter();
        fighter.setFighterName(userPojo.getFighterName());
        fighter.setCountry(userPojo.getCountry());
        fighter.setCity(userPojo.getCity());
        fighter.setEmail(userPojo.getEmail());
        fighter.setAliasName(userPojo.getAliasName());
        fighter.setPassword(userPojo.getPassword());
        fighter.setGymName(userPojo.getGymName());
        fighterRepository.save(fighter);
        return "done";
    }

    public String insertFighterRecords(UserPojo userPojo) {
        Fighter fighterToBeUpdate = fighterRepository.getReferenceById(userPojo.getId());
        FighterRecords fighterRecords = new FighterRecords();
        fighterRecords.setFighterAgainstId(userPojo.getFighterAgainstId());
        fighterRecords.setFighterName(fighterToBeUpdate.getFighterName());
        fighterRecords.setWon(userPojo.getWon());
        fighterRecords.setFighters(fighterToBeUpdate);
        fighterRecordRepository.save(fighterRecords);
//        fighterToBeUpdate
        return "done";
    }

    public String createEvent(EventModal eventModal) {
        Events events = new Events();
        events.setEventName(eventModal.getEventName());
        events.setCoMainEvent(eventModal.getCoMainEvent());
        events.setMainEvent(eventModal.getMainEvent());
        eventRepository.save(events);
        return "done";
    }

    public String addFightInEvent(FightModal fightModal) throws Exception {
        Optional<Events> eventsOptional = eventRepository.findByEventName(fightModal.eventName);
        if (!eventsOptional.isPresent()) {
            throw new Exception("please provide event name");
        }
        Events event = eventsOptional.get();

        if (fightModal.getCardPosition() == 2) {
            String comainEvent = getEvent(fightModal);
            event.setCoMainEvent(comainEvent);
        }
        if (fightModal.getCardPosition() == 1) {
            String mainEvent = getEvent(fightModal);
            event.setMainEvent(mainEvent);
        }
        FightCard fightCard = new FightCard();
        fightCard.setEvent(event);
        fightCard.setFighterIdOne(fightModal.getFighterIds().get(0));
        fightCard.setFighterIdTwo(fightModal.getFighterIds().get(1));
        fighterCardRepository.save(fightCard);
        return "done";
    }

    public String addFightsInEvent(FightModal fightModal) throws Exception {
        Optional<Events> eventsOptional = eventRepository.findByEventName(fightModal.eventName);
        if (!eventsOptional.isPresent()) {
            throw new Exception("please provide event name");
        }
        Events event = eventsOptional.get();
        if (!fightModal.isCompleteCard) {
            throw new Exception();
        }
        fightModal.getAllFights().stream().forEach(fight -> {
            FightCard fightCard = new FightCard();
            int cardPostion = fight.getCardPostiton();
            if (cardPostion == 2) {
                event.setCoMainEvent(getEvent(fight.fightIdOne, fight.fightIdTwo));
            }
            if (cardPostion == 1) {
                event.setMainEvent(getEvent(fight.fightIdOne, fight.fightIdTwo));
            }
            fightCard.setPostion(cardPostion);
            fightCard.setEvent(event);
            fightCard.setFighterIdOne(fight.fightIdOne);
            fightCard.setFighterIdTwo(fight.fightIdTwo);

            fighterCardRepository.save(fightCard);
        });

        return "done";
    }

    private String getEvent(FightModal fightModal) {
        return fightModal.getFighterIds().stream().map(ii -> fighterRepository.findById(ii)).map(jj -> jj.get().getFighterName()).collect(Collectors.joining(" vs "));
    }

    private String getEvent(int fightIdOne, int fightIdTwo) {
        return Stream.of(fightIdOne, fightIdTwo).map(ii -> fighterRepository.findById(ii)).map(jj -> jj.get().getFighterName()).collect(Collectors.joining(" vs "));
    }

    public Events getEvent(String eventName){
        System.out.println("!!!!!!");
       Events event= eventRepository.findByEventName(eventName).get();
        return event;
    }


}
