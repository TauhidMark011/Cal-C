package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {

    TextView Result;
    EditText number1, number2;
    Button Add, Subtract, Multiply, Divide;

    float result_num;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Result = (TextView) findViewById(R.id.Result);
        number1 = (EditText) findViewById(R.id.number1);
        number2 = (EditText) findViewById(R.id.number2);
        Add = (Button) findViewById(R.id.Add);
        Subtract = (Button) findViewById(R.id.Subtract);
        Multiply = (Button) findViewById(R.id.Multiply);
        Divide = (Button) findViewById(R.id.Divide);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());
                result_num = num1 + num2;
                Result.setText(String.valueOf(result_num));
            }
        });
        Subtract.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());
                result_num = num1 - num2;
                Result.setText(String.valueOf(result_num));
            }
        }));
        Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());
                result_num = num1 * num2;
                Result.setText(String.valueOf(result_num));
            }
        });
        Divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());
                result_num = num1 / num2;
                Result.setText(String.valueOf(result_num));
            }
        });

    }
}