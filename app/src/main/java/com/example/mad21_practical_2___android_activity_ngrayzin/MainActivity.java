package com.example.mad21_practical_2___android_activity_ngrayzin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


import java.util.EventListener;


public class MainActivity extends AppCompatActivity {

    User user = new User("rz", "desc", 1, false);




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent mIntent = getIntent();
        int intValue = mIntent.getIntExtra("Random", 0);
        TextView tv1 = (TextView)findViewById(R.id.textView);
        tv1.setText(user.name + " " + intValue);

    }

    /*TextView tv1 = (TextView)findViewById(R.id.textView);
    tv1.setText(message);*/



    public void followfunction(View view)
    {
        user.followed = !user.followed;
        Button button = (Button)findViewById(R.id.button2);
        button.setText(user.followed ? "UNFOLLOW": "FOLLOW");
        Toast.makeText(this, user.followed ?"Followed" : "Unfollowed", Toast.LENGTH_SHORT).show();

    }


}