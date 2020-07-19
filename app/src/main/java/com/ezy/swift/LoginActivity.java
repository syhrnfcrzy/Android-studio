package com.ezy.swift;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAuth = FirebaseAuth.getInstance();
        setContentView(R.layout.activity_login);
    }

    public void Daftar (View view) {
        startActivity(new Intent( LoginActivity.this,SignupActivity.class));
    }
    public void Lupakatasandi (View view) {
        startActivity(new Intent( LoginActivity.this,LupakatasandiActivity.class));
    }

}