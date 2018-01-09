package com.example.yeffo.studioproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText username, password;
        Button signIn, signUp;
        final Intent reg_Act = new Intent(getApplicationContext(), Register.class);

        username = (EditText) findViewById(R.id.userText);
        password = (EditText) findViewById(R.id.pwText);
        signIn = (Button) findViewById(R.id.signIn);
        signUp = (Button) findViewById(R.id.register);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(reg_Act);
            }
        });
    }
}
