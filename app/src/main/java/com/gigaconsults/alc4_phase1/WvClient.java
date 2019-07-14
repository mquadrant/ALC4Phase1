package com.gigaconsults.alc4_phase1;

import android.content.Context;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

class WvClient extends WebViewClient
{
    private Context context;

    public WvClient(Context context){
        this.context = context;
    }
    @Override
    public void onReceivedSslError(WebView view, final SslErrorHandler handler, SslError er) {
        handler.proceed();
        // Ignore SSL certificate errors
    }
}