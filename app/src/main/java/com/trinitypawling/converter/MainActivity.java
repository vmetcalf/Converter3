package com.trinitypawling.converter;

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
    public void calculate(View v) {
        EditText inputField = (EditText) findViewById(R.id.inputField);
        //I changed TextView into EditText inside xml
        TextView outputField = (TextView) findViewById(R.id.outField);
        String inputValue = inputField.getText().toString();
        outputField.setText(inputValue);
    }

}