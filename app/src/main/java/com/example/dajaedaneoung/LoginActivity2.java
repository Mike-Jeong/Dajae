package com.example.dajaedaneoung;

import androidx.appcompat.app.AppCompatActivity;

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
import android.widget.Toast;

public class LoginActivity2 extends AppCompatActivity {

    Button loginbtn;
    ImageView backward;
    EditText editemail;
    EditText editpass;
    TextView warning;
    ImageButton ldelete;
    ImageButton pdelete;
    TextView findpass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        loginbtn = (Button) findViewById(R.id.lbtn);
        backward = (ImageView) findViewById(R.id.back1);
        editemail = (EditText) findViewById(R.id.lid);
        editpass = (EditText) findViewById(R.id.lps);
        warning = (TextView) findViewById(R.id.warning1);
        ldelete = (ImageButton) findViewById(R.id.liddelete);
        pdelete = (ImageButton) findViewById(R.id.lpsdelete);
        findpass = (TextView) findViewById(R.id.lfindpass);


        pdelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                  editpass.setText("");
            }
        });


        ldelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                  editemail.setText("");
            }
        });



        editemail.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                ldelete.setVisibility(View.VISIBLE);
            }

            @Override
            public void afterTextChanged(Editable arg0) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
        });

        editpass.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                pdelete.setVisibility(View.VISIBLE);

                if (editpass.getText().length() >= 8)
                {
                    loginbtn.setBackgroundTintList(getResources().getColorStateList(R.color.appmain));
                }

            }

            @Override
            public void afterTextChanged(Editable arg0) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
        });

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                   if (editemail.getText().length() != 0 && editpass.getText().length() != 0)
                    {
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                    }


                else{
                    warning.setVisibility(View.VISIBLE);
                }
            }
        });

        backward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();

            }
        });

        findpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "아직 구현하지 않은 부분입니", Toast.LENGTH_SHORT).show();
            }
        });

    }

}
