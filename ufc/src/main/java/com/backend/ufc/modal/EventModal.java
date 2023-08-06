package com.backend.ufc.modal;

import lombok.Data;

@Data
public class EventModal {
    private String eventName="";
    private String MainEvent="";
    private String coMainEvent="";
    private int totalAttendance=0;
    private int maxSeats;
    private int vipAttendance=0;
    private int vipSeats=0;
}
