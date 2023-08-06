package com.backend.ufc.modal;

import com.backend.ufc.entity.Fighter;
import com.backend.ufc.entity.FighterRecords;

import javax.persistence.*;
import java.util.List;

public class UserPojo {
    private Integer id;
    private String fighterIds;
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
    private Integer fighterAgainstId;
    private int won=0;
    private Fighter fighter;

    public UserPojo(Integer id, String email, String password, String username, String fighterName, String aliasName, String city, String country, String gymName, int totalFights, int wonFights, int lostFights, int no_contest, Integer fighterAgainstId, int won, Fighter fighter) {
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
        this.fighterAgainstId = fighterAgainstId;
        this.won = won;
        this.fighter = fighter;
    }

    public UserPojo() {
    }

    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String getFighterName() {
        return fighterName;
    }

    public String getAliasName() {
        return aliasName;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getGymName() {
        return gymName;
    }

    public int getTotalFights() {
        return totalFights;
    }

    public void setFighterIds(String fighterIds) {
        this.fighterIds = fighterIds;
    }

    public String getFighterIds() {
        return fighterIds;
    }

    public int getWonFights() {
        return wonFights;
    }

    public int getLostFights() {
        return lostFights;
    }

    public int getNo_contest() {
        return no_contest;
    }

    public Integer getFighterAgainstId() {
        return fighterAgainstId;
    }

    public int getWon() {
        return won;
    }

    public Fighter getFighter() {
        return fighter;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFighterName(String fighterName) {
        this.fighterName = fighterName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setGymName(String gymName) {
        this.gymName = gymName;
    }

    public void setTotalFights(int totalFights) {
        this.totalFights = totalFights;
    }

    public void setWonFights(int wonFights) {
        this.wonFights = wonFights;
    }

    public void setLostFights(int lostFights) {
        this.lostFights = lostFights;
    }

    public void setNo_contest(int no_contest) {
        this.no_contest = no_contest;
    }

    public void setFighterAgainstId(Integer fighterAgainstId) {
        this.fighterAgainstId = fighterAgainstId;
    }

    public void setWon(int won) {
        this.won = won;
    }

    public void setFighter(Fighter fighter) {
        this.fighter = fighter;
    }
}
