package com.example.dajaedaneoung;

import android.content.Intent;
import android.graphics.Color;
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

public class OnboardingActivity2 extends AppCompatActivity {

    ImageView backward;
    EditText editpass;
    ImageButton pdelete;
    Button nextbtn;
    TextView pwarning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding2);
        backward = (ImageView) findViewById(R.id.back3);
        editpass = (EditText) findViewById(R.id.ops);
        pdelete = (ImageButton) findViewById(R.id.o2delete);
        nextbtn = (Button) findViewById(R.id.o2next);
        pwarning = (TextView)findViewById(R.id.pwarning);

        backward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();

            }
        });

        pdelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editpass.setText("");
            }
        });

        editpass.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                pdelete.setVisibility(View.VISIBLE);
                pwarning.setVisibility(View.VISIBLE);


                if (editpass.getText().length() >= 8)
                {
                    nextbtn.setBackgroundTintList(getResources().getColorStateList(R.color.appmain));
                    pwarning.setText("사용가능한 비밀번호입니다");
                    pwarning.setTextColor(Color.parseColor("#0a847c"));
                }
            }

            @Override
            public void afterTextChanged(Editable arg0) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
        });

        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (editpass.getText().length() != 0)
                {
                    Intent intent = new Intent(getApplicationContext(), OnboardingActivity3.class);
                    startActivity(intent);
                }

            }
        });
    }

}