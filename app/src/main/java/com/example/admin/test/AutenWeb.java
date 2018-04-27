package com.example.admin.test;


import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;


import java.util.Objects;

import static android.content.ContentValues.TAG;

class AutenWeb extends WebViewClient{

    Context context;

    AutenWeb(Context context){
        this.context = context;
    }

    @SuppressWarnings("deprecation")
    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, String url)
    {
        return shouldOverrideUrlLoading(url);
    }

    @TargetApi(Build.VERSION_CODES.N)
    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest request)
    {
        Uri uri = request.getUrl();
        return shouldOverrideUrlLoading(uri.toString());
    }

    private boolean shouldOverrideUrlLoading(final String url)
    {
        Log.i(TAG, "shouldOverrideUrlLoading() URL : " + url);

//
//        if (url.matches(".*access_token=.*")) {
//            Intent intent = new Intent(context, Next.class);
//            intent.putExtra("url", url);
//            context.startActivity(intent);
//        }

        return false;
    }
}
