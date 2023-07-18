package com.example.zoo_ver2;

import static com.example.zoo_ver2.R.id.ttLoai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import java.util.ArrayList;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class ThongTinChiTiet extends AppCompatActivity {
    ImageView banDo;
    ImageView dongVat;
    ImageView map;
    ImageView them;
    ImageView xuat;
    ImageView trangChu;
    String tt="";
    TextView ttLoai;

    ArrayList<Object> thongTinDongVat;
    ArrayList<String> opt = new ArrayList<String>();
    ArrayAdapter adapter;
    String inf;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thong_tin_loai);
        opt.add("              ");
        opt.add("Thêm Động Vật");
        opt.add("Xóa Động Vật");

        them = findViewById(R.id.them);
        xuat = findViewById(R.id.xuat);
        dongVat = findViewById(R.id.dongVat);
        banDo = findViewById(R.id.banDo);
        trangChu = findViewById(R.id.trangChu);
        ttLoai = findViewById(R.id.ttLoai);

        trangChu.setOnClickListener(view -> {
            Intent intent = new Intent(this, TrangChu.class);
            startActivity(intent);
        });

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

        ttLoai.setText(DongVat.info);

    }
}

