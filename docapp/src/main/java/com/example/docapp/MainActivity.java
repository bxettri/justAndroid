package com.example.docapp;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends WearableActivity {

    private TextView mTextView;
    private EditText username,password;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnLogin = findViewById(R.id.btnLogin);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        mTextView = (TextView) findViewById(R.id.text);


        // Enables Always-on
        setAmbientEnabled();
    }
}
