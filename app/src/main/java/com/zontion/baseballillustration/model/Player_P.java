package com.zontion.baseballillustration.model;

import com.zontion.baseballillustration.model.CardInfo.*;

public class Player_P {
    //共通
    private CardColor cardColor = CardColor.BLUE;   //卡片顏色
    private int year = 0;   //年份
    private TeamInfo teamInfo;   //隊伍
    private String name = "";   //名字
    private DefencePlace_P[] defencePlace = {DefencePlace_P.SP};   //守備位子 如果有雙守備位子就兩個物件
    private LevelType_P levelType = LevelType_P.TYPE_A;   //升級類型
    private Pose_P pose = Pose_P.RIGHT;   //左右打(投)
    private boolean specailPose = false;   //專屬特殊動作

    //素質
    private int health = 0;   //體力
    private int control = 0;   //控球
    private KeyA keyA;
    private KeyC keyC;
    private KeyD keyD;
    private KeyF keyF;
    private KeyS keyS;
    private KeyW keyW;
    private KeyX keyX;
    private KeyZ keyZ;

    public Player_P(CardColor cardColor, int year, TeamInfo teamIfon, String name, DefencePlace_P[] defencePlace, LevelType_P levelType,
                    Pose_P pose, boolean specailPose, int health, int control, KeyA keyA, KeyC keyC,
                    KeyD keyD, KeyF keyF, KeyS keyS, KeyW keyW, KeyX keyX, KeyZ keyZ) {
        this.cardColor = cardColor;
        this.year = year;
        this.teamInfo = teamIfon;
        this.name = name;
        this.defencePlace = defencePlace;
        this.levelType = levelType;
        this.pose = pose;
        this.specailPose = specailPose;

        this.health = health;
        this.control = control;
        this.keyA = keyA;
        this.keyC = keyC;
        this.keyD = keyD;
        this.keyF = keyF;
        this.keyS = keyS;
        this.keyW = keyW;
        this.keyX = keyX;
        this.keyZ = keyZ;
    }

    public class KeyA {
        private Ball_A ball_a;
        private int value;

        public KeyA(Ball_A ball_a, int value) {
            this.ball_a = ball_a;
            this.value = value;
        }
    }

    public enum Ball_A {
        NORMAL_CURVE("曲球"),
        KNUCKLE_CURVE("彈指曲球");

        private String name = "";

        private Ball_A(String name) {
            this.name = name;
        }
    }

    public class KeyC {
        private Ball_C ball_c;
        private int value;

        public KeyC(Ball_C ball_c, int value) {
            this.ball_c = ball_c;
            this.value = value;
        }
    }

    public enum Ball_C {
        V_TwoSeam("V-二縫"),
        H_TwoSeam("H-二縫"),
        SCREW("螺旋球");

        private String name = "";

        private Ball_C(String name) {
            this.name = name;
        }
    }

    public class KeyD {
        private Ball_D ball_d;
        private int value;

        public KeyD(Ball_D ball_d, int value) {
            this.ball_d = ball_d;
            this.value = value;
        }
    }

    public enum Ball_D {
        SLIDER("滑球"),
        V_SLIDER("V-滑球");

        private String name = "";

        private Ball_D(String name) {
            this.name = name;
        }
    }

    public class KeyF {
        private Ball_F ball_f;
        private int value;

        public KeyF(Ball_F ball_f, int value) {
            this.ball_f = ball_f;
            this.value = value;
        }
    }

    public enum Ball_F {
        SLURVE("滑曲球");

        private String name = "";

        private Ball_F(String name) {
            this.name = name;
        }
    }

    public class KeyS {
        private Ball_S ball_s;
        private int value;

        public KeyS(Ball_S ball_s, int value) {
            this.ball_s = ball_s;
            this.value = value;
        }
    }

    public enum Ball_S {
        FAST("四縫線"),
        R_FAST("R-快速球");

        private String name = "";

        private Ball_S(String name) {
            this.name = name;
        }
    }

    public class KeyW {
        private Ball_W ball_w;
        private int value;

        public KeyW(Ball_W ball_w, int value) {
            this.ball_w = ball_w;
            this.value = value;
        }
    }

    public enum Ball_W {
        CHANGE("變速球"),
        C_CHANGE("C-變速球"),
        PALM("掌心球");

        private String name = "";

        private Ball_W(String name) {
            this.name = name;
        }
    }

    public class KeyX {
        private Ball_X ball_x;
        private int value;

        public KeyX(Ball_X ball_x, int value) {
            this.ball_x = ball_x;
            this.value = value;
        }
    }

    public enum Ball_X {
        FORK("指叉球"),
        FASTFORK("快速指叉球"),
        SNIKER("伸卡球");

        private String name = "";

        private Ball_X(String name) {
            this.name = name;
        }
    }

    public class KeyZ {
        private Ball_Z ball_z;
        private int value;

        public KeyZ(Ball_Z ball_z, int value) {
            this.ball_z = ball_z;
            this.value = value;
        }
    }

    public enum Ball_Z {
        CUTTER("切球"),
        BUTTERFLY("蝴蝶球");

        private String name = "";

        private Ball_Z(String name) {
            this.name = name;
        }
    }
}
