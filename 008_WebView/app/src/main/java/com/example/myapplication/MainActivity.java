package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    WebView wv1, wv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimla();
        goster();
        htmlGoster();
    }

    public void tanimla(){
        wv1 = (WebView) findViewById(R.id.webView1);
        wv2 = (WebView) findViewById(R.id.webView2);
    }

    public void goster(){
        wv1.loadUrl("https://www.google.com/");
        wv1.getSettings().setJavaScriptEnabled(true);   // Web sitesindeki javascript kodlarının çalıştırılmasını sağlar.
        // Diğer izinler için "AndroidManifest.xml" dosyasına bak.
    }

    public void htmlGoster(){
        String htmlKod = "<html>" +
                "<head>WebView HTML Örneği</head>" +
                "<body><h1>HTML Örneği</h1></body>" +
                "</html>";
        wv2.loadData(htmlKod, "text/html", "UTF-8");
    }
}