package com.zontion.baseballillustration.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    private final static int DBVersion = 1; //<-- 版本
    private final static String DBName = "Baseball.db"; //<-- db name
    private final static String tableName = "Charactor"; //<-- table name

    public DBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DBName, null, DBVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        final String SQL = "CREATE TABLE IF NOT EXISTS " + tableName + "( " +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "charactor VARCHAR(20), " +
                "color VARCHAR(10), " +
                "year INTEGER DEFAULT 0 , " +
                "team VARCHAR(30), " +
                "name VARCHAR(50), " +
                "defence_place VARCHAR(5), " +
                "level_type VARCHAR(20), " +
                "pose VARCHAR(50), " +
                "specail_pose INTEGER DEFAULT 0, " +     //0>false 1>true
                "strength INTEGER DEFAULT 0, " +
                "punch INTEGER DEFAULT 0, " +
                "speed INTEGER DEFAULT 0, " +
                "pass INTEGER DEFAULT 0, " +
                "defence INTEGER DEFAULT 0, " +
                "health INTEGER DEFAULT 0, " +
                "control INTEGER DEFAULT 0, " +
                "fast INTEGER DEFAULT 0, " +
                "key_A_name VARCHAR(50), " +     //球種中文名稱
                "key_A_value INTEGER DEFAULT 0, " +     //球種素質
                "key_C_name VARCHAR(50), " +
                "key_C_value INTEGER DEFAULT 0, " +
                "key_D_name VARCHAR(50), " +
                "key_D_value INTEGER DEFAULT 0, " +
                "key_F_name VARCHAR(50), " +
                "key_F_value INTEGER DEFAULT 0, " +
                "key_S_name VARCHAR(50), " +
                "key_S_value INTEGER DEFAULT 0, " +
                "key_W_name VARCHAR(50), " +
                "key_W_value INTEGER DEFAULT 0, " +
                "key_X_name VARCHAR(50), " +
                "key_X_value INTEGER DEFAULT 0, " +
                "key_Z_name VARCHAR(50), " +
                "key_Z_value INTEGER DEFAULT 0 " +
                ");";
        db.execSQL(SQL);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        final String SQL = "DROP TABLE " + tableName;
        db.execSQL(SQL);
    }
}
