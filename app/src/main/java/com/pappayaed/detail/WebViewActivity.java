package com.pappayaed.detail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.pappayaed.R;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        WebView webView = (WebView) findViewById(R.id.webview);

        webView.getSettings().getJavaScriptEnabled();
        webView.loadUrl("http://cashkaro.com/stores/bigbasket");
    }
}
