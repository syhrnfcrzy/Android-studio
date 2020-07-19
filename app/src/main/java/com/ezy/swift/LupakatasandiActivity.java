package com.ezy.swift;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.view.View;

public class LupakatasandiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupakatasandi);

    }

    public void Back(View view) {
        startActivity(new Intent(LupakatasandiActivity.this, LoginActivity.class));
    }
}