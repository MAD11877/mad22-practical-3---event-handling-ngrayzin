package com.example.mad21_practical_2___android_activity_ngrayzin;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ListActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        View btn = findViewById(R.id.imageView2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createalertdialog();
            }
        });


    }
    private void createalertdialog()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Profile");
        builder.setMessage("MADness");
        builder.setCancelable(true);
        builder.setPositiveButton(
                "VIEW", new
                        DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog, int id){
                                int nxt = (int) Math.round(Math.random() * 1000000);
                                Intent activityName = new Intent(ListActivity.this,MainActivity.class);
                                activityName.putExtra("Random", nxt);
                                startActivity(activityName);

                            }
                        });
        builder.setNegativeButton("CLOSE", new
                DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int id){
                        dialog.cancel();

                    }
                });
        AlertDialog alert11 = builder.create();
        alert11.show();
    }
}