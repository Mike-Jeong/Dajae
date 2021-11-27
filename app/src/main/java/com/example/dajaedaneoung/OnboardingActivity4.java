package com.example.dajaedaneoung;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class OnboardingActivity4 extends AppCompatActivity {

    ImageView backward;
    EditText editnick;
    ImageButton ndelete;
    Button donebtn;
    Button ncheck;
    TextView nwarning;
    Dialog dilaog01;
    boolean boolnick = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding4);
        backward = (ImageView) findViewById(R.id.back5);
        editnick = (EditText) findViewById(R.id.o2ps);
        ndelete = (ImageButton) findViewById(R.id.o5delete);
        donebtn = (Button) findViewById(R.id.o5done);
        nwarning = (TextView)findViewById(R.id.nwarning);
        ncheck = (Button) findViewById(R.id.o5check);

        dilaog01 = new Dialog(OnboardingActivity4.this);       // Dialog 초기화
        dilaog01.requestWindowFeature(Window.FEATURE_NO_TITLE); // 타이틀 제거
        dilaog01.setContentView(R.layout.activity_alert);



        backward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();

            }
        });

        ndelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editnick.setText("");
            }
        });

        editnick.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (editnick.getText().length() == 0)
                {
                    ncheck.setBackgroundTintList(getResources().getColorStateList(R.color.appmain3));
                }
                ncheck.setBackgroundTintList(getResources().getColorStateList(R.color.appmain));

            }

            @Override
            public void afterTextChanged(Editable arg0) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
        });

        ncheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (editnick.getText().length()>2)
                {
                    boolnick = true;
                }

                if (!boolnick){
                    nwarning.setVisibility(View.VISIBLE);
                }

                else{
                    nwarning.setVisibility(View.VISIBLE);
                    nwarning.setText("사용가능한 닉네임 입니다");
                    nwarning.setTextColor(Color.parseColor("#0a847c"));
                    donebtn.setBackgroundTintList(getResources().getColorStateList(R.color.appmain));
                }


            }
        });

        donebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (boolnick)
                {
                   showDialog01();
                }

            }
        });
    }

    public void showDialog01(){
        dilaog01.show();
        Button noBtn = dilaog01.findViewById(R.id.okbtn);
        noBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = getBaseContext().getPackageManager().
                        getLaunchIntentForPackage(getBaseContext().getPackageName());
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(i);
            }
        });

    }


}