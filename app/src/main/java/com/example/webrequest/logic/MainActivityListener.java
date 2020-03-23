package com.example.webrequest.logic;

import android.view.View;

import com.example.webrequest.R;
import com.example.webrequest.gui.MainActivity;

public class MainActivityListener implements View.OnClickListener {

    private MainActivity mainActivity;

    public MainActivityListener(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnSendRequest) {
            mainActivity.webView.loadUrl("https://de.wikihow.com/In-Android-HTTP-POST-Requests-ausf%C3%BChren");

          //  String html = "<html><body><p>Hello World </p></body></html>";
          //  mainActivity.webView.loadData(html, "text/html", null);
        }
    }
}
