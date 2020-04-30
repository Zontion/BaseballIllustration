package com.zontion.baseballillustration.model.mlb;

import com.zontion.baseballillustration.model.TeamBonusValue;

public class NYM extends TeamBonusValue {

    public NYM(int year) {
        this.year = year;

        switch(year) {
            case 0:
                setValue(5,5,6,2,4,2,2,2);
        }
    }
}
