package com.example.yeffo.studioproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    public EditText reg_user, reg_email, reg_pw, reg_confirm;
    public Button reg_signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        reg_user = (EditText) findViewById(R.id.registerUN);
        reg_email = (EditText) findViewById(R.id.registerEmail);
        reg_pw = (EditText) findViewById(R.id.registerPW);
        reg_confirm = (EditText) findViewById(R.id.registerConfirm);
        reg_signUp = (Button) findViewById(R.id.signUp);

        reg_signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
