package com.example.zoo_ver2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ThemDongVat extends AppCompatActivity {

    Spinner spinnerChonLoai;
    ImageView dongVat;
    ImageView banDo;
    ImageView trangChu;
    ImageView them;
    ImageView xuat;
    EditText ten;
    EditText maSo;
    EditText tuoi;
    EditText ngaythem;
    EditText food;
    EditText suckhoe;
    ArrayList<String> optChonTrang = new ArrayList<String>();
    ArrayList<String> optChonLoai = new ArrayList<String>();

    ArrayAdapter adapterQuanLi;
    ArrayAdapter adapterChonLoai;
    String tenDv;
    String msoDv;
    int tuoiDv;
    String ngaythemDv;
    int foodDv;
    String sucKhoeDv;
    Button button;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.them_dong_vat);
        optChonTrang.add("             ");
        optChonTrang.add("Thêm Động Vật");
        optChonTrang.add("Xóa Động Vật");
        optChonLoai.add("lion");
        optChonLoai.add("tiger");
        optChonLoai.add("wolf");
        optChonLoai.add("snake");
        optChonLoai.add("elephant");

        them = findViewById(R.id.them);
        xuat = findViewById(R.id.xuat);
        dongVat = findViewById(R.id.dongVat);
        banDo = findViewById(R.id.banDo);
        trangChu = findViewById(R.id.trangChu);
        spinnerChonLoai = findViewById(R.id.spinnerLoai);
        // mới thêm
        ten = findViewById(R.id.ten);
        maSo = findViewById(R.id.maSo);
        tuoi = findViewById(R.id.tuoi);
        ngaythem = findViewById(R.id.ngayXoa);
        food = findViewById(R.id.food);
        suckhoe = findViewById(R.id.suckhoe);
        button = findViewById(R.id.button);
        // lấy thông tin từng mục
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tenDv = ten.getText().toString();
                String mso = maSo.getText().toString();
                int tuoiDv = Integer.parseInt(tuoi.getText().toString());
                String ngaythemDv = ngaythem.getText().toString();
                int khoiluong = Integer.parseInt(food.getText().toString());
                String suckhoeDv = suckhoe.getText().toString();
                String loaiDv = spinnerChonLoai.getSelectedItem().toString();
                Intent intent1 = new Intent(ThemDongVat.this, DongVat.class);
                Bundle bundle = new Bundle();
                bundle.putString("tenDv", tenDv);
                bundle.putString("msoDv", mso);
                bundle.putInt("tuoiDv", tuoiDv);
                bundle.putString("loaiDv", loaiDv);
                bundle.putString("ngaythemDv", ngaythemDv);
                bundle.putInt("foodDv", khoiluong);
                bundle.putString("sucKhoeDv", suckhoeDv);
                intent1.putExtra("mybundle",bundle);
                startActivity(intent1);
            }
        });

        adapterChonLoai = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, optChonLoai);
        adapterChonLoai.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerChonLoai.setAdapter(adapterChonLoai);

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
    }
}
