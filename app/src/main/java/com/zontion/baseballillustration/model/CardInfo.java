package com.zontion.baseballillustration.model;

public class CardInfo {
    //角色
    public enum Charactor {
        BALLER, PITCHER
    }

    //卡片顏色
    public enum CardColor {
        BLUE, RED, PURPLE, BLACK
    }

    //守備位子(打)
    public enum DefencePlace_B {
        C, ONEB, TWOB, THREEB, SS, RF, CF, LF ,DH
    }

    //守備位子(投)
    public enum DefencePlace_P {
        SP, RP, CP
    }

    //升級類型(打)
    public enum LevelType_B {
        SS, SP, SD, PS, PP, PD,  //力速, 力傳, 力守, 打速, 打傳, 打守
    }

    //升級類型(投)
    public enum LevelType_P {
        TYPE_A, TYPE_C, TYPE_D, TYPE_F, TYPE_W, TYPE_X, TYPE_Z
    }

    //左右打
    public enum Pose_B {
        RIGHT, LEFT, DOUBLE
    }

    //左右投
    public enum Pose_P {
        RIGHT, LEFT
    }

    public enum Team {

    }
}
