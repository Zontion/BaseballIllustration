package com.zontion.baseballillustration.Tools;


import android.content.Context;

import com.zontion.baseballillustration.R;
import com.zontion.baseballillustration.model.CardInfo.*;


public class Tools {
    public static String getStringByLevelType_B(Context context, LevelType_B levelType) {
        switch (levelType) {
            case SS:
                return context.getResources().getString(R.string.baseball_leveltype_ss);
            case SP:
                return context.getResources().getString(R.string.baseball_leveltype_sp);
            case SD:
                return context.getResources().getString(R.string.baseball_leveltype_sd);
            case PS:
                return context.getResources().getString(R.string.baseball_leveltype_ps);
            case PP:
                return context.getResources().getString(R.string.baseball_leveltype_pp);
            case PD:
                return context.getResources().getString(R.string.baseball_leveltype_pd);
            default:
                return "";
        }
    }

    public static String getStringByLevelType_P(Context context, LevelType_P levelType) {
        switch (levelType) {
            case TYPE_A:
                return context.getResources().getString(R.string.baseball_leveltype_ss);
            case TYPE_C:
                return context.getResources().getString(R.string.baseball_leveltype_sp);
            case TYPE_D:
                return context.getResources().getString(R.string.baseball_leveltype_sd);
            case TYPE_F:
                return context.getResources().getString(R.string.baseball_leveltype_ps);
            case TYPE_W:
                return context.getResources().getString(R.string.baseball_leveltype_pp);
            case TYPE_X:
                return context.getResources().getString(R.string.baseball_leveltype_pd);
            case TYPE_Z:
                return context.getResources().getString(R.string.baseball_leveltype_pd);
            default:
                return "";
        }
    }

    public static int getColorByNumber(Context context, int number) {
        if (number > 100) {
            return context.getResources().getColor(R.color.color_gold);
        } else if (number > 90) {
            return context.getResources().getColor(R.color.color_red);
        } else if (number > 80) {
            return context.getResources().getColor(R.color.color_orange);
        } else {
            return context.getResources().getColor(R.color.color_white);
        }
    }
}
