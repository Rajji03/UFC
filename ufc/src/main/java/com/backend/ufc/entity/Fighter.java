package com.backend.ufc.entity;

//import lombok.Data;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Fighter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String email;
    private String password;
    private String username;
    private String fighterName;
    private String aliasName;
    private String city;
    private String country;
    private String gymName;
    private int totalFights;
    private int wonFights=0;
    private int lostFights=0;
    private int no_contest=0;
    @OneToMany(fetch = FetchType.LAZY,mappedBy="fighters",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FighterRecords> fighterRecordsList;

    public Fighter() {
    }

    public Fighter(Integer id, String email, String password, String username, String fighterName, String aliasName, String city, String country, String gymName, int totalFights, int wonFights, int lostFights, int no_contest, List<FighterRecords> fighterRecordsList) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.username = username;
        this.fighterName = fighterName;
        this.aliasName = aliasName;
        this.city = city;
        this.country = country;
        this.gymName = gymName;
        this.totalFights = totalFights;
        this.wonFights = wonFights;
        this.lostFights = lostFights;
        this.no_contest = no_contest;
        this.fighterRecordsList = fighterRecordsList;
    }

//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public void setFighterName(String fighterName) {
//        this.fighterName = fighterName;
//    }
//
//    public void setAliasName(String aliasName) {
//        this.aliasName = aliasName;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public void setCountry(String country) {
//        this.country = country;
//    }
//
//    public void setGymName(String gymName) {
//        this.gymName = gymName;
//    }
//
//    public void setTotalFights(int totalFights) {
//        this.totalFights = totalFights;
//    }
//
//    public void setWonFights(int wonFights) {
//        this.wonFights = wonFights;
//    }
//
//    public void setLostFights(int lostFights) {
//        this.lostFights = lostFights;
//    }
//
//    public void setNo_contest(int no_contest) {
//        this.no_contest = no_contest;
//    }
//
//    public void setFighterRecordsList(List<FighterRecords> fighterRecordsList) {
//        this.fighterRecordsList = fighterRecordsList;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public String getFighterName() {
//        return fighterName;
//    }
//
//    public String getAliasName() {
//        return aliasName;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public String getGymName() {
//        return gymName;
//    }
//
//    public int getTotalFights() {
//        return totalFights;
//    }
//
//    public int getWonFights() {
//        return wonFights;
//    }
//
//    public int getLostFights() {
//        return lostFights;
//    }
//
//    public int getNo_contest() {
//        return no_contest;
//    }
//
//    public List<FighterRecords> getFighterRecordsList() {
//        return fighterRecordsList;
//    }
}
