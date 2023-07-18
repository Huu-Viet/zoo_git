package com.example.zoo_ver2;

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

public class XoaDongVat extends AppCompatActivity {

    ImageView xuat;
    ImageView them;
    Spinner spinnerChonLoai;
    ImageView dongVat;
    ImageView banDo;
    ImageView trangChu;
    ArrayList<String> optChonTrang = new ArrayList<String>();
    ArrayList<String> optChonLoai = new ArrayList<String>();
    ArrayAdapter adapter;
    ArrayAdapter adapterChonLoai;
    EditText ten;
    EditText maSo;
    EditText ngayXoa;
    EditText liDoXoa;
    Button xoaDongVat;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xoa_dong_vat);
        optChonTrang.add("              ");
        optChonTrang.add("Thêm Động Vật");
        optChonTrang.add("Xóa Động Vật");
        optChonLoai.add("lion");
        optChonLoai.add("tiger");
        optChonLoai.add("wolf");
        optChonLoai.add("snake");
        optChonLoai.add("elephant");


        dongVat = findViewById(R.id.dongVat);
        banDo = findViewById(R.id.banDo);
        trangChu = findViewById(R.id.trangChu);
        spinnerChonLoai = findViewById(R.id.spinnerLoai);
        ten = findViewById(R.id.ten);
        maSo = findViewById(R.id.maSo);
        ngayXoa = findViewById(R.id.ngayXoa);
        liDoXoa = findViewById(R.id.liDoXoa);
        xoaDongVat = findViewById(R.id.xoaDongVat);
        them = findViewById(R.id.them);
        xuat = findViewById(R.id.xuat);


        adapterChonLoai = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, optChonLoai);
        adapterChonLoai.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerChonLoai.setAdapter(adapterChonLoai);
        xoaDongVat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tenDv = ten.getText().toString();
                String maSoDv = maSo.getText().toString();
                String loaiDv = spinnerChonLoai.getSelectedItem().toString();
                String ngayXoaDv = ngayXoa.getText().toString();
                String lidoXoaDv = liDoXoa.getText().toString();
                Intent intent = new Intent(XoaDongVat.this, DongVat.class);
                Bundle bundle = new Bundle();
                bundle.putString("tenDvx", tenDv);
                bundle.putString("maSoDvx", maSoDv);
                bundle.putString("loaiDvx", loaiDv);
                bundle.putString("ngayXoaDvx", ngayXoaDv);
                bundle.putString("lidoXoaDvx", lidoXoaDv);
                intent.putExtra("bundle2", bundle);
                startActivity(intent);
            }
        });

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