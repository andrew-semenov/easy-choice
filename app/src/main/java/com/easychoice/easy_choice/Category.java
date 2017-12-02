package com.easychoice.easy_choice;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class Category extends AppCompatActivity {

    final String LOG_TAG = "myLog";

    String[] categories = {"Телефоны", "Компьютеры", "Бытовая техника"};
//    String[] subCategoryMobile = {"Мобильные", "Стационарные", "Смартфоны"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        Button btn = findViewById(R.id.btnAdd);
    }

    class DBHelper extends SQLiteOpenHelper {
        public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
            super(context, name, factory, version);
        }

        @Override
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            Log.d(LOG_TAG, "---=== DB on create ===---");

            ContentValues cv = new ContentValues();
            sqLiteDatabase.execSQL("create table Category()");
        }

        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        }
    }
}
