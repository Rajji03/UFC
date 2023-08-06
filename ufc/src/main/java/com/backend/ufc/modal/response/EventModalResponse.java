package com.backend.ufc.modal.response;

import lombok.Data;

import java.util.ArrayList;

@Data
public class EventModalResponse {
    private String eventName;
    private String eventId;
    private ArrayList<FightCardResponse> fighterResponseList;
}
