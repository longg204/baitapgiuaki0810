package com.example.baitapgiuaki;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class listview extends AppCompatActivity {
    private ListView listviewbaihat;
    ArrayList<cacbaihat>arraybaihat;
    baihatadapter adapter;
    ImageView back_img;
    ImageView person_img;
    ImageView home_img;
    private int vitri=-1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        back_img = (ImageView) findViewById(R.id.back_img_listview);
        person_img = (ImageView) findViewById(R.id.person_img_listview);
        home_img = (ImageView) findViewById(R.id.home_img_listview);
        back_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentback = new Intent(listview.this, home.class);
                startActivity(intentback);
            }
        });
        person_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentperson = new Intent(listview.this, profile.class);
                startActivity(intentperson);
            }
        });
        home_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenthome = new Intent(listview.this, home.class);
                startActivity(intenthome);
            }
        });
        listviewbaihat = (ListView) findViewById(R.id.listviewbaihat);
        arraybaihat = new ArrayList<>();
        arraybaihat.add(new cacbaihat("Em của ngày hôm qua", "Sơn Tùng", R.drawable.sontung, R.drawable.ic_bacham));
        arraybaihat.add(new cacbaihat("Mang tiền về cho mẹ", "Đen Vâu", R.drawable.denvau, R.drawable.ic_bacham));
        arraybaihat.add(new cacbaihat("Mãi mãi bên nhau", "Noo Phước Thịnh", R.drawable.noo, R.drawable.ic_bacham));
        arraybaihat.add(new cacbaihat("Hẹn ước từ hư vô", "Mỹ Tâm", R.drawable.mytam, R.drawable.ic_bacham));
        arraybaihat.add(new cacbaihat("Autumn Morning", "IU", R.drawable.iu, R.drawable.ic_bacham));
        arraybaihat.add(new cacbaihat("Nevetheless", "Song Kang", R.drawable.songkang, R.drawable.ic_bacham));
        arraybaihat.add(new cacbaihat("Em của ngày hôm qua", "Sơn Tùng", R.drawable.sontung, R.drawable.ic_bacham));
        arraybaihat.add(new cacbaihat("Mang tiền về cho mẹ", "Đen Vâu", R.drawable.denvau, R.drawable.ic_bacham));
        arraybaihat.add(new cacbaihat("Mãi mãi bên nhau", "Noo Phước Thịnh", R.drawable.noo, R.drawable.ic_bacham));
        arraybaihat.add(new cacbaihat("Hẹn ước từ hư vô", "Mỹ Tâm", R.drawable.mytam, R.drawable.ic_bacham));

        adapter = new baihatadapter(this, R.layout.activity_baihat, arraybaihat);
        listviewbaihat.setAdapter(adapter);
        listviewbaihat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Intent intent = new Intent(listview.this, detail.class);
                    startActivity(intent);
                }
                if(i==1){
                    Intent intent = new Intent(listview.this, detail.class);
                    startActivity(intent);
                }
                if(i==2){
                    Intent intent = new Intent(listview.this, detail.class);
                    startActivity(intent);
                }
                if(i==3){
                    Intent intent = new Intent(listview.this, detail.class);
                    startActivity(intent);
                }
                if(i==4){
                    Intent intent = new Intent(listview.this, detail.class);
                    startActivity(intent);
                }
                if(i==5){
                    Intent intent = new Intent(listview.this, detail.class);
                    startActivity(intent);
                }
                if(i==6){
                    Intent intent = new Intent(listview.this, detail.class);
                    startActivity(intent);
                }
                if(i==7){
                    Intent intent = new Intent(listview.this, detail.class);
                    startActivity(intent);
                }
                if(i==8){
                    Intent intent = new Intent(listview.this, detail.class);
                    startActivity(intent);
                }
                if(i==9){
                    Intent intent = new Intent(listview.this, detail.class);
                    startActivity(intent);
                }
            }
        });
        listviewbaihat.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                vitri = i;
                new AlertDialog.Builder(listview.this)
                        .setIcon(android.R.drawable.ic_delete)
                        .setTitle("Are you sure?")
                        .setMessage("Do you want delete this Item?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                arraybaihat.remove(vitri);
                                adapter.notifyDataSetChanged();
                            }
                        })
                        .setNegativeButton("No", null)
                        .show();
                return true;
            }
        });
    }
}