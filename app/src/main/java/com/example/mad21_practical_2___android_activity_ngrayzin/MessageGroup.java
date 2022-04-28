package com.example.mad21_practical_2___android_activity_ngrayzin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MessageGroup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_group);

        Button group1btn = findViewById(R.id.button3);
        Button group2btn = findViewById(R.id.button4);

    }
}