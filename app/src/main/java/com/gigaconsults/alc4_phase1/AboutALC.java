package com.gigaconsults.alc4_phase1;

import android.os.Build;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutALC extends AppCompatActivity {
    private WebView webView;
    private WebSettings webSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);


        webView = findViewById(R.id.alc_web_view);
        webView.setWebViewClient(new WvClient(this));

        webView.loadUrl("https://andela.com/alc/");
        webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);


    }
}
