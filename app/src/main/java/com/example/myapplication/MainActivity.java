package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void findSum(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);
        try {


            int num1 = Integer.parseInt((number1ET.getText().toString()));
            int num2 = Integer.parseInt((number2ET.getText().toString()));
            int sum = num1 + num2;

            numberSumTV.setText("" + sum);
        }
        catch(Exception e){
            numberSumTV.setText("ERROR");
        }
    }

    public void findDifference(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberDifferenceTV = findViewById(R.id.resultTV);

        try {
            int num1 = Integer.parseInt((number1ET.getText().toString()));
            int num2 = Integer.parseInt((number2ET.getText().toString()));
            int difference = num1 - num2;

            numberDifferenceTV.setText("" + difference);
        }
        catch(Exception e){
            numberDifferenceTV.setText("ERROR");
        }
    }

    public void findProduct(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberProductTV = findViewById(R.id.resultTV);

        try {
            int num1 = Integer.parseInt((number1ET.getText().toString()));
            int num2 = Integer.parseInt((number2ET.getText().toString()));
            int product = num1 * num2;

            numberProductTV.setText("" + product);
        }
        catch(Exception e){
            numberProductTV.setText("ERROR");
        }

    }

    public void findQuotient(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberQuotientTV = findViewById(R.id.resultTV);

        try {

            int num1 = Integer.parseInt((number1ET.getText().toString()));
            int num2 = Integer.parseInt((number2ET.getText().toString()));
            int quotient = num1 / num2;

            numberQuotientTV.setText("" + quotient);
        }
        catch(Exception e){
            numberQuotientTV.setText("ERROR");
        }
    }

//    public void changeColor(View view){
//
//    }

    public void findSquareRoot(View view){
        EditText number1ET = findViewById(R.id.num1ET);
        TextView numberRootTV = findViewById(R.id.resultTV);

        try {

            int num1 = Integer.parseInt((number1ET.getText().toString()));
            int root = (int) Math.sqrt(num1);

            numberRootTV.setText("" + root);
        }
        catch(Exception e){
            numberRootTV.setText("ERROR");
        }

    }

    //ideas: push out notification if they put in the wrong info, more fxns, change color of buttons, distance formula, etc., use gradient, different fonts.

}