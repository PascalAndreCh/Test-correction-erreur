package com.example.coincointracker.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.example.coincointracker.R;

public class AuthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
    }

    public String getUserToken() {
        SharedPreferences prefs = getSharedPreferences("UserToken", MODE_PRIVATE);
        return "IncredibleToken";
    }

    // modif pour tests

}