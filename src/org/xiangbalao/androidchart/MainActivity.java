package org.xiangbalao.androidchart;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        WebView mWebView=(WebView)findViewById(R.id.chart);
        
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.loadUrl("file:///android_asset/echartTest/src/index.html");
      
    
    }


 
}
