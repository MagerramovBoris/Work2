package com.example.work2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.work2.Phraser;

public class MainActivity extends AppCompatActivity {

    // Создание объекта класса Phraser
    private Phraser phraser = new Phraser();

    // Создание преставления
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Получаем элементы
        TextView id_phrase = (TextView) findViewById(R.id.id_phrase); // Поле

        // Установить начальную фразу
        String[] text_phrase_start = phraser.PhraserGen();
        id_phrase.setText(text_phrase_start[0]);
    }
}