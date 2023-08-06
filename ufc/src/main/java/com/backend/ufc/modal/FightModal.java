package com.backend.ufc.modal;

import lombok.Data;

import java.util.ArrayList;

@Data
public class FightModal {
    public boolean isMainEvent;
    public boolean isCoMainEvent;
    public int cardPosition=-1;
    public ArrayList<Integer> fighterIds;
    public int eventId;
    public String eventName;
    public ArrayList<CardModal> allFights;
    public boolean isCompleteCard;
}
