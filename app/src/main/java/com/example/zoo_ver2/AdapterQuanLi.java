package com.example.zoo_ver2;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class AdapterQuanLi extends AppCompatActivity {
    Spinner spinner;
    ArrayList<String> opt = new ArrayList<String>();
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trang_chu); // Replace with your layout file name
        opt.add("Thêm Động Vật");
        opt.add("Xóa Động Vật");
        spinner = findViewById(R.id.quanLi);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,opt);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
}
