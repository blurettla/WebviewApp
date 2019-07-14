package com.kerno.webviewapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

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
                        actionBar.setTitle("My Profile");
                    }
                //Code to create a circle profile picture on the page
                ImageView imageView = findViewById(R.id.img_profile_pic);
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.manchesterutd);
                RoundedBitmapDrawable roundedBitmapDrawable = RoundedBitmapDrawableFactory.create(getResources(), bitmap);
                roundedBitmapDrawable.setCircular(true);
                imageView.setImageDrawable(roundedBitmapDrawable);
            }
    }
