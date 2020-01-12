package com.example.zhao.faceregister.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.zhao.faceregister.R;

public class SecceedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secceed);
        TextView textView = (TextView)findViewById(R.id.succceed_text);
        textView.setText("解锁成功，进入主页");
    }
}
