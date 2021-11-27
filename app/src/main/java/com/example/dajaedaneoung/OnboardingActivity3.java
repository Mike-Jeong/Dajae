package com.example.dajaedaneoung;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class OnboardingActivity3 extends AppCompatActivity {
    ImageView backward;
    Button nextbtn;
    Button i1;
    Button i2;
    Button i3;
    int chose = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding3);
        backward = (ImageView) findViewById(R.id.back4);
        nextbtn = (Button) findViewById(R.id.o3next);
        i1 = (Button) findViewById(R.id.o3t1);
        i2 = (Button) findViewById(R.id.o3t2);
        i3 = (Button) findViewById(R.id.o3t3);

        backward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();

            }
        });

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               chose += 1;
               i1.setBackgroundResource(R.drawable.edge);
            }
        });

        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                chose += 1;
                i2.setBackgroundResource(R.drawable.edge);
            }
        });

        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                chose += 1;
                i3.setBackgroundResource(R.drawable.edge);
                nextbtn.setBackgroundTintList(getResources().getColorStateList(R.color.appmain));
            }
        });


        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (chose >= 3)
                {
                    Intent intent = new Intent(getApplicationContext(), OnboardingActivity4.class);
                    startActivity(intent);
                }

            }
        });
    }

}