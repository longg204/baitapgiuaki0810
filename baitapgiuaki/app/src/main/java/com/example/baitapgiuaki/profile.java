package com.example.baitapgiuaki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class profile extends AppCompatActivity {

    private ImageView logout;
    private ImageView back;
    private ImageView music;
    private ImageView home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        logout = (ImageView) findViewById(R.id.logout_img_profile);
        back = (ImageView) findViewById(R.id.back_img_profile);
        music = (ImageView) findViewById(R.id.music_img_profile);
        home = (ImageView) findViewById(R.id.home_img_profile);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profile.this, signin.class);
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentback = new Intent(profile.this, listview.class);
                startActivity(intentback);
            }
        });
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentmusic = new Intent(profile.this, listview.class);
                startActivity(intentmusic);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenthome = new Intent(profile.this, home.class);
                startActivity(intenthome);
            }
        });
    }
}