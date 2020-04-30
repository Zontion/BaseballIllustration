package com.zontion.baseballillustration.model;

import com.zontion.baseballillustration.model.TeamInfo.*;

public class TeamBonusValue {
    public League league = League.CPBL;
    public int year = 0;
    public String name = "";
    public int strength = 0;
    public int punch = 0;
    public int speed = 0;
    public int pass = 0;
    public int defence = 0;
    public int control = 0;
    public int fast = 0;
    public int breaking = 0;

    public void setValue(int strength, int punch, int speed, int pass, int defence,
                         int control, int fast, int breaking) {
        this.strength = strength;
        this.punch = punch;
        this.speed = speed;
        this.pass = pass;
        this.defence = defence;
        this.control = control;
        this.fast = fast;
        this.breaking = breaking;
    }
}