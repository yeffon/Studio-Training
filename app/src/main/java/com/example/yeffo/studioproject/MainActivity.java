package com.example.yeffo.studioproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LocalUser local;
    private EditText username, password;
    Button signIn, signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.userText);
        password = (EditText) findViewById(R.id.pwText);
        signIn = (Button) findViewById(R.id.signIn);
        signUp = (Button) findViewById(R.id.register);

        local = new LocalUser(this);


        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = new User(null, null);
                local.storedUser(user);
                local.setLoggedInUser(true);
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reg_Act = new Intent(getApplicationContext(), Register.class);
                startActivity(reg_Act);
            }
        });
    }
}
