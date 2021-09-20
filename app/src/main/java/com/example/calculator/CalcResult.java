package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CalcResult extends AppCompatActivity {
    TextView calcResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_result);

        calcResult = (TextView) findViewById(R.id.calcResult);
        Intent intent = getIntent();
        String str = intent.getStringExtra("result");
        calcResult.setText(str);
    }
}