package com.example.calculatorinrelativelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonPoint;
    Button buttonAC;
    Button buttonBackspace;
    Button buttonPlus;
    Button buttonMinus;
    Button buttonMultiply;
    Button buttonDivide;
    Button buttonPercentage;
    Button buttonEquals;

    EditText screen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = findViewById(R.id._0button);
        button1 = findViewById(R.id._1button);
        button2 = findViewById(R.id._2button);
        button3 = findViewById(R.id._3button);
        button4 = findViewById(R.id._4button);
        button5 = findViewById(R.id._5button);
        button6 = findViewById(R.id._6button);
        button7 = findViewById(R.id._7button);
        button8 = findViewById(R.id._8button);
        button9 = findViewById(R.id._9button);
        buttonPoint = findViewById(R.id.decimal_button);
        buttonAC = findViewById(R.id.ac_button);
        buttonBackspace = findViewById(R.id.backspace_button);
        buttonPlus = findViewById(R.id.add);
        buttonMinus = findViewById(R.id.minus_button);
        buttonMultiply = findViewById(R.id.multiply);
        buttonDivide = findViewById(R.id.divide);
        buttonPercentage = findViewById(R.id.percentage_button);
        buttonEquals = findViewById(R.id.button_equals);
        screen = findViewById(R.id.calculator_text_box);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = screen.getText().toString() +"0";
                screen.setText(str);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = screen.getText().toString() +"1";
                screen.setText(str);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = screen.getText().toString() +"1";
                screen.setText(str);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = screen.getText().toString() +"2";
                screen.setText(str);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = screen.getText().toString() +"3";
                screen.setText(str);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = screen.getText().toString() +"4";
                screen.setText(str);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = screen.getText().toString() +"5";
                screen.setText(str);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = screen.getText().toString() +"6";
                screen.setText(str);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = screen.getText().toString() +"7";
                screen.setText(str);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = screen.getText().toString() +"8";
                screen.setText(str);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = screen.getText().toString() +"9";
                screen.setText(str);
            }
        });
        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = screen.getText().toString() +".";
                screen.setText(str);
            }
        });
        buttonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText("");
            }
        });
    }
}
