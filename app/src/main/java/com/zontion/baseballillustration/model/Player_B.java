package com.zontion.baseballillustration.model;

import com.zontion.baseballillustration.model.CardInfo.*;

public class Player_B {
    //共通
    private CardColor cardColor = CardColor.BLUE;   //卡片顏色
    private int year = 0;   //年份
    private TeamInfo teamInfo;   //隊伍
    private String name = "";   //名字
    private DefencePlace_B[] defencePlace = {DefencePlace_B.C};   //守備位子 如果有雙守備位子就兩個物件
    private LevelType_B levelType = LevelType_B.SP;   //升級類型
    private Pose_B pose = Pose_B.RIGHT;   //左右打(投)
    private boolean specailPose = false;   //專屬特殊動作

    //素質
    private int strength = 0;   //力量
    private int punch = 0;   //打擊
    private int speed = 0;   //速度
    private int pass = 0;   //傳球
    private int defence = 0;   //守備

    public Player_B(CardColor cardColor, int year, TeamInfo teamIfon, String name, DefencePlace_B[] defencePlace, LevelType_B levelType,
                    Pose_B pose, boolean specailPose, int str, int punch, int speed, int pass, int defence) {
        this.cardColor = cardColor;
        this.year = year;
        this.teamInfo = teamIfon;
        this.name = name;
        this.defencePlace = defencePlace;
        this.levelType = levelType;
        this.pose = pose;
        this.specailPose = specailPose;
        this.strength = strength;
        this.punch = punch;
        this.speed = speed;
        this.pass = pass;
        this.defence = defence;
    }

    public CardColor getCardColor() {
        return cardColor;
    }

    public void setCardColor(CardColor cardColor) {
        this.cardColor = cardColor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public TeamInfo getTeamInfo() {
        return teamInfo;
    }

    public void setTeamInfo(TeamInfo teamInfo) {
        this.teamInfo = teamInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DefencePlace_B[] getDefencePlace() {
        return defencePlace;
    }

    public void setDefencePlace(DefencePlace_B[] defencePlace) {
        this.defencePlace = defencePlace;
    }

    public LevelType_B getLevelType() {
        return levelType;
    }

    public void setLevelType(LevelType_B levelType) {
        this.levelType = levelType;
    }

    public Pose_B getPose() {
        return pose;
    }

    public void setPose(Pose_B pose) {
        this.pose = pose;
    }

    public boolean isSpecailPose() {
        return specailPose;
    }

    public void setSpecailPose(boolean specailPose) {
        this.specailPose = specailPose;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int str) {
        this.strength = strength;
    }

    public int getPunch() {
        return punch;
    }

    public void setPunch(int punch) {
        this.punch = punch;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }
}
