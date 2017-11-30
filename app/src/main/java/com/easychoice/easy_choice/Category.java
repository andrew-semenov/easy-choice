package com.easychoice.easy_choice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Category extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        
        Button btn = FindViewById(R.layout.btnAdd);
    }
}
