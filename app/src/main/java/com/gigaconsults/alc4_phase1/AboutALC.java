package com.gigaconsults.alc4_phase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class AboutALC extends AppCompatActivity {
    private WebView webView;
    private WebSettings webSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
        setTitle(getResources().getText(R.string.about_alc_title));


        webView = findViewById(R.id.alc_web_view);
        webView.setWebViewClient(new WvClient(this));

        webView.loadUrl("https://andela.com/alc/");
        webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);


    }
}
