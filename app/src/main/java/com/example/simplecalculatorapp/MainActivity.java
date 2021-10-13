package com.example.simplecalculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextFirstValue =findViewById(R.id.first_number);
        EditText editTextSecondValue =findViewById(R.id.second_number);
        Button button =findViewById(R.id.btn_add);
        Button button1 =findViewById(R.id.btn_minus);
        TextView textViewSolution=findViewById(R.id.txt_solution);

        //add 2 number
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstValue=editTextFirstValue.getText().toString();
                String secondValue=editTextSecondValue.getText().toString();
                int solution=Integer.valueOf(firstValue)+Integer.valueOf(secondValue);
                textViewSolution.setText(String.valueOf(solution));
            }
        });

        //minus 2 number
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstValue=editTextFirstValue.getText().toString();
                String secondValue=editTextSecondValue.getText().toString();
                int result;
                if(Integer.valueOf(firstValue) > Integer.valueOf(secondValue)){
                    result=Integer.valueOf(firstValue)-Integer.valueOf(secondValue);
                }
                else
                    result=Integer.valueOf(secondValue)-Integer.valueOf(firstValue);
                textViewSolution.setText(String.valueOf(result));
            }
        });

    }
}