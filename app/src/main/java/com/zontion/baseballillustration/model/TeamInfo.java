package com.zontion.baseballillustration.model;

public class TeamInfo {
    private String league;
    private int year;
    private String name;
    private TeamBonusValue teamBonusValue;

    public enum League {
        CPBL,
        MLB
    }

    public enum CPBL {
        BROTHERS,
        COBRAS,
        DRAGONS,
        GUARDIANS,
        HAWKS,
        LIONS,
        MONKEYS,
        T_REXS,
        TIGERS,
        WHALES,
    }

    public enum MLB {
        ARI,     //亞利桑那響尾蛇
        ATL,     //亞特蘭大勇士
        BAL,     //巴爾的摩金鶯
        BOS,     //波士頓紅襪
        CHC,     //芝加哥小熊
        CIN,     //辛辛那提紅人
        CLE,     //克里夫蘭印地安人
        COL,     //科羅拉多洛磯
        CWS,     //芝加哥白襪
        DET,     //底特律老虎
        HOU,     //休士頓太空人
        KC,     //堪薩斯皇家
        LAA,     //洛杉磯天使
        LAD,     //洛杉磯道奇
        MIA,     //邁阿密馬林魚
        MIL,     //密爾瓦基釀酒人
        MIN,     //明尼蘇達雙城
        NYM,     //紐約大都會
        NYY,     //紐約洋基
        OAK,     //奧克蘭運動家
        PHI,     //費城費城人
        PIT,     //匹茲堡海盜
        SD,     //聖地亞哥教士
        SEA,     //西雅圖水手
        SF,     //舊金山巨人
        STL,     //聖路易紅雀
        TB,     //坦帕灣光芒
        TEX,     //德克薩斯遊騎兵
        TOR,     //多倫多藍鳥
        WSH,     //華盛頓國民
    }
}
