package com.example.convertbookssizetolists;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class SecAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);//инициализация textview
        textView.setTextSize(26);
        textView.setPadding(55, 110, 55, 55);
        Bundle arguments = getIntent().getExtras();

        if (arguments!=null) {
            Double a = arguments.getDouble("result"); //получаем рузкльтат
            String formattedDouble = new DecimalFormat("#0.00").format(a); //форматируем в 1,11
            String result = String.valueOf(formattedDouble);

            textView.setText(result + " Печатных листов (А4)");//вывод
        }
        setContentView(textView);
    }
}