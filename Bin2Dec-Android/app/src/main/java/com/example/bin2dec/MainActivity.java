package com.example.bin2dec;

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
    public int convert (String s) {
        int decimalNumber = 0;
        char[] c = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            decimalNumber = decimalNumber * 2 + (c[i] - '0');
        }
        return decimalNumber;
    }
    public void display(View view) {
        EditText editText = (EditText) findViewById(R.id.editTextTextBinaryNumber);
        String s = editText.getText().toString();
        int decimalNumber = this.convert(s);
        TextView textView = (TextView) findViewById(R.id.textViewDecimalNumber);
        textView.setText(String.valueOf(decimalNumber));
    }
}