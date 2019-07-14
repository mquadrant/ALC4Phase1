package com.gigaconsults.alc4_phase1;

import android.content.Context;
import android.content.DialogInterface;
import android.net.http.SslError;
import android.support.v7.app.AlertDialog;
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
//        handler.proceed();
        // Ignore SSL certificate errors
        final AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage("SSL Error");
        builder.setPositiveButton("continue", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                handler.proceed();
            }
        });
        builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override

            public void onClick(DialogInterface dialog, int which) {
                handler.cancel();
            }
        });
        final AlertDialog dialog = builder.create();
        dialog.show();
    }
}