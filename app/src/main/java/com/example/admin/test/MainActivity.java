package com.example.admin.test;

import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity extends Activity {

//    String url = "https://oauth.vk.com/authorize?client_id=6445024&display=page&redirect_uri=https:" +
//            "//oauth.vk.com/blank.html&scope=+4098&response_type=token&v=5.74&state=123456";

    String url = "http://www.растимгражданина.рф/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        WebView webView = findViewById(R.id.webView);
        webView.loadUrl(url);
        webView.setVisibility(View.INVISIBLE);
        webView.setWebViewClient(new WebViewClient() {

            public void onPageFinished(WebView view, String url)
            {
                webView.loadUrl(url);
            }
        });


        WebView webView2 = findViewById(R.id.webView2);
        webView2.loadUrl(url);
        webView2.setVisibility(View.INVISIBLE);
        webView2.setWebViewClient(new WebViewClient() {

            public void onPageFinished(WebView view, String url)
            {
                webView2.loadUrl(url);
            }
        });


        WebView webView3 = findViewById(R.id.webView3);
        webView3.loadUrl(url);
        webView3.setVisibility(View.INVISIBLE);
        webView3.setWebViewClient(new WebViewClient() {

            public void onPageFinished(WebView view, String url)
            {
                webView3.loadUrl(url);
            }
        });


        WebView webView4 = findViewById(R.id.webView4);
        webView4.loadUrl(url);
        webView4.setVisibility(View.INVISIBLE);
        webView4.setWebViewClient(new WebViewClient() {

            public void onPageFinished(WebView view, String url)
            {
                webView4.loadUrl(url);
            }
        });



        WebView webView5 = findViewById(R.id.webView5);
        webView5.loadUrl(url);
        webView5.setVisibility(View.INVISIBLE);
        webView5.setWebViewClient(new WebViewClient() {

            public void onPageFinished(WebView view, String url)
            {
                webView5.loadUrl(url);
            }
        });



        WebView webView6 = findViewById(R.id.webView6);
        webView6.loadUrl(url);
        webView6.setVisibility(View.INVISIBLE);
        webView6.setWebViewClient(new WebViewClient() {

            public void onPageFinished(WebView view, String url)
            {
                webView6.loadUrl(url);
            }
        });



        WebView webView7 = findViewById(R.id.webView7);
        webView7.loadUrl(url);
        webView7.setVisibility(View.INVISIBLE);
        webView7.setWebViewClient(new WebViewClient() {

            public void onPageFinished(WebView view, String url)
            {
                webView7.loadUrl(url);
            }
        });



        WebView webView8 = findViewById(R.id.webView8);
        webView8.loadUrl(url);
        webView8.setVisibility(View.INVISIBLE);
        webView8.setWebViewClient(new WebViewClient() {

            public void onPageFinished(WebView view, String url)
            {
                webView8.loadUrl(url);
            }
        });



        WebView webView9 = findViewById(R.id.webView9);
        webView9.loadUrl(url);
        webView9.setVisibility(View.INVISIBLE);
        webView9.setWebViewClient(new WebViewClient() {

            public void onPageFinished(WebView view, String url)
            {
                webView9.loadUrl(url);
            }
        });



        WebView webView10 = findViewById(R.id.webView10);
        webView10.loadUrl(url);
        webView10.setVisibility(View.INVISIBLE);
        webView10.setWebViewClient(new WebViewClient() {

            public void onPageFinished(WebView view, String url)
            {
                webView10.loadUrl(url);
            }
        });
    }
}



