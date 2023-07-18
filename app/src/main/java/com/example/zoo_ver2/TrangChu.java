package com.example.zoo_ver2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;



public class TrangChu extends AppCompatActivity {
    ImageView banDo;
    ImageView dongVat;
    ImageView map;
    ImageView them;
    ImageView xuat;
    ImageView trangChu;
    TextView thongTin;
    String tt="";

    ArrayList<String> opt = new ArrayList<String>();
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trang_chu);

        them = findViewById(R.id.them);
        xuat = findViewById(R.id.xuat);
        dongVat = findViewById(R.id.dongVat);
        banDo = findViewById(R.id.banDo);
        trangChu = findViewById(R.id.trangChu);
        thongTin = findViewById(R.id.thongTin);

        dongVat.setOnClickListener(view -> {
            Intent intent = new Intent(this, DongVat.class);
            startActivity(intent);
        });

        banDo.setOnClickListener(view -> {
            Intent intent = new Intent(this, BanDo.class);
            startActivity(intent);
        });

        them.setOnClickListener(view -> {
            Intent intent = new Intent(this, ThemDongVat.class);
            startActivity(intent);
        });

        xuat.setOnClickListener(view -> {
            Intent intent = new Intent(this, XoaDongVat.class);
            startActivity(intent);
        });


    }

}