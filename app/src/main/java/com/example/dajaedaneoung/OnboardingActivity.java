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

import androidx.appcompat.app.AppCompatActivity;

public class OnboardingActivity extends AppCompatActivity {

    ImageView backward;
    EditText editemail;
    ImageButton ldelete;
    Button nextbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);

        backward = (ImageView) findViewById(R.id.back2);
        editemail = (EditText) findViewById(R.id.oid);
        ldelete = (ImageButton) findViewById(R.id.odelete);
        nextbtn = (Button) findViewById(R.id.onext);

        backward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();

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

                if (editemail.getText().length() >= 8)
                {
                    nextbtn.setBackgroundTintList(getResources().getColorStateList(R.color.appmain));
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

                if (editemail.getText().length() >= 8)
                {
                    Intent intent = new Intent(getApplicationContext(), OnboardingActivity2.class);
                    startActivity(intent);
                }

            }
        });
    }

}