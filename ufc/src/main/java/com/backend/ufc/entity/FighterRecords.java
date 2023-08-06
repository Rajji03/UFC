package com.backend.ufc.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
//import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class FighterRecords {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String fighterName;
    private Integer fighterAgainstId;
    private int won=0;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="fighter_id", nullable=false)
    private Fighter fighters;





}
