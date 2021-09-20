package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickOperation(View view){
        Button op = (Button)view;
        String operator = op.getText().toString();
        EditText firstN = (EditText)findViewById(R.id.firstNumber);
        EditText secondN = (EditText)findViewById(R.id.secondNumber);
        Double firstNum = Double.parseDouble(firstN.getText().toString());
        Double secondNum = Double.parseDouble(secondN.getText().toString());
        Log.i("message", String.valueOf(firstNum)+" and "+secondNum);
        switch (operator){
            case "+": goToActivityResult(firstNum+secondNum);break;
            case "-": goToActivityResult(firstNum-secondNum);break;
            case "x": goToActivityResult(firstNum*secondNum);break;
            case "/": goToActivityResult(firstNum/secondNum);break;
        }
    }

    public void goToActivityResult(Double result){
        Intent intent = new Intent(this,CalcResult.class);
        intent.putExtra("result",String.valueOf(result));
        startActivity(intent);
    }
//    public void clickPlus(Double firstNum, Double secondNum){
//        calcResult.setText(String.valueOf(firstNum+secondNum));
//    }
//    public void clickMinus(Double firstNum, Double secondNum){
//        calcResult.setText(String.valueOf(firstNum-secondNum));
//    }
//    public void clickMult(Double firstNum, Double secondNum){
//        calcResult.setText(String.valueOf(firstNum*secondNum));
//    }
//    public void clickDiv(Double firstNum, Double secondNum){
//        calcResult.setText(String.valueOf(firstNum/secondNum));
//    }
}