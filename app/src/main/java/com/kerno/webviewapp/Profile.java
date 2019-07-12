package com.kerno.webviewapp;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class Profile extends AppCompatActivity
    {
        @Override
        protected void onCreate(Bundle savedInstanceState)
            {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_profile);

                ActionBar actionBar = getSupportActionBar();
                if (actionBar != null)
                    {
                        actionBar.setTitle("My profile");
                    }
            }
    }
