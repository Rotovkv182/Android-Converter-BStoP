package com.example.convertbookssizetolists;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void OnSummBTNClick(View view) { //метод кнопки
        try {
            EditText p = findViewById(R.id.num);
            String strpages = p.getText().toString();
            int pages = Integer.parseInt(strpages);//страницы
            Double k = 0.1155; //коэф перевода
            Double res = pages * k;

            Intent intent = new Intent(this, SecAct.class);//отправка в интент
            intent.putExtra("result", res);
            startActivity(intent);
        }
        catch (NumberFormatException n) { // обработка пустого поля или ввод дробного числа (вывод сообщения, если данные не корректны)
            Toast toast = Toast.makeText(getApplicationContext(),"Wrong Value Format or Empty",Toast.LENGTH_LONG);
            toast.show();
        }

    }
}

