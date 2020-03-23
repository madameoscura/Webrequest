package com.example.webrequest.gui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import com.example.webrequest.R;
import com.example.webrequest.logic.MainActivityListener;

public class MainActivity extends AppCompatActivity {

    MainActivityListener mainActivityListener;
    public Button btnSendRequest;
    public TextView txtOutput;
    public WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        btnSendRequest = findViewById(R.id.btnSendRequest);
        txtOutput = findViewById(R.id.txtOutput);
        webView = findViewById(R.id.webView);

        mainActivityListener = new MainActivityListener(this);

        btnSendRequest.setOnClickListener(mainActivityListener);
    }
}
