package com.kerno.webviewapp;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class WebviewActivity extends AppCompatActivity
    {
        @SuppressLint("SetJavaScriptEnabled")
        @Override
        protected void onCreate(Bundle savedInstanceState)
            {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_webview);

                ActionBar actionBar = getSupportActionBar();
                if (actionBar != null)
                    {
                        actionBar.setTitle("About ALC");
                    }
                WebView webView = findViewById(R.id.andelaWebview);
                webView.setWebViewClient(new WebViewClient());
                WebSettings webSettings = webView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                webView.loadUrl(getString(R.string.andelaURL));
            }
    }
