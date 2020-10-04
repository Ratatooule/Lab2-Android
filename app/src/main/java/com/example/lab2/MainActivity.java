package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendNumbers(View view) {
        EditText firstTextNumber = findViewById(R.id.firstNumber);
        EditText secondTextNumber = findViewById(R.id.secondNumber);

        int firstNumber = Integer.parseInt(firstTextNumber.getText().toString());
        int secondNumber = Integer.parseInt(secondTextNumber.getText().toString());
        int sum = firstNumber + secondNumber;

        TextView textView = findViewById(R.id.answer);
        textView.setText(String.valueOf(sum));

        Toast.makeText(MainActivity.this, Integer.toString(sum), Toast.LENGTH_SHORT).show();
    }
}