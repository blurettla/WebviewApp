package com.kerno.webviewapp;

import android.net.http.SslError;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class WebviewActivity extends AppCompatActivity
    {

        @Override
        protected void onCreate(Bundle savedInstanceState)
            {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_webview);

                ActionBar actionBar = getSupportActionBar();
                if (actionBar != null)
                    {
                        actionBar.setDisplayHomeAsUpEnabled(true);
                        actionBar.setTitle("About ALC");
                    }
                WebView webView = findViewById(R.id.andelaWebview);
                webView.setWebViewClient(new WebViewClient()
                    {
                        @Override
                        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error)
                            {
                                handler.proceed();
                            }
                    });
                WebSettings webSettings = webView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                webView.loadUrl(getString(R.string.andelaURL));
            }

        public boolean onOptionsItemSelected(MenuItem item)
            {
                switch (item.getItemId())
                    {
                        case android.R.id.home:
                            finish();
                            return true;
                    }
                return super.onOptionsItemSelected(item);
            }

        public boolean onCreateOptionsMenu(Menu menu)
            {
                return true;
            }

    }
