package com.backend.ufc.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
//import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class FightCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private int fighterIdOne=-1;
    private int fighterIdTwo=-1;
    private int postion=-1;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="event_id", nullable=false)
    private Events event;
//    prvate
}
