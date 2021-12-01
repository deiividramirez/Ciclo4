package com.myapplication.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MySQLiteHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "app_03_db.sqlite";
    private static final int DB_VERSION = 1;

    private static final String PEOPLE_TABLE_CREATE = "CREATE TABLE personas(_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                                                        "nombres TEXT, apellidos TEXT, direccion TEXT, telefono TEXT, " +
                                                        "fecha_nacimiento DATE, foto TEXT)";

    public MySQLiteHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(PEOPLE_TABLE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void insetData(String sentence){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL(sentence);
    }

}
