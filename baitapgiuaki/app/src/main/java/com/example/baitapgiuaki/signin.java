package com.example.baitapgiuaki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class signin extends AppCompatActivity {

    private TextView signup_text;
    private Button signin;
    private TextInputEditText email;
    private TextInputEditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        signin = (Button)  findViewById(R.id.btn_signin);
        signup_text = (TextView) findViewById(R.id.text_signup);
        email = (TextInputEditText) findViewById(R.id.email_signin);
        pass = (TextInputEditText) findViewById(R.id.password_signin);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(email.getText().length() !=0 && pass.getText().length() !=0){
                    if(email.getText().toString().equals("long@gmail.com") && pass.getText().toString().equals("123456")){
                        Toast.makeText(signin.this, "Logged in successfully", Toast.LENGTH_SHORT).show();
                        Intent dangnhap = new Intent(signin.this, home.class);
                        startActivity(dangnhap);
                    }else{
                        Toast.makeText(signin.this, "Login failed", Toast.LENGTH_SHORT).show();
                    }

                }else{
                    Toast.makeText(signin.this, "Please fill in enough information", Toast.LENGTH_SHORT).show();
                }
            }
        });

        signup_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(signin.this, signup.class);
                startActivity(intent);
            }
        });
    }
}