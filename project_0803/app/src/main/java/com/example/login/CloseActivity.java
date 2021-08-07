package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CloseActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn_close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_close);

        btn_close = (Button)findViewById(R.id.btn_close);
        btn_close.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        finish();
    }
}