package com.backend.ufc.entity;

//import lombok.Data;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class Events {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String eventName;
    private String MainEvent="";
    private String coMainEvent="";
    private int totalAttendance=0;
    private int maxSeats;
    private int vipAttendance=0;
    private int vipSeats=0;
//    prvate
    @OneToMany(fetch = FetchType.LAZY,mappedBy="event",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FightCard> fightCard;


}
