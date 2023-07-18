package com.example.zoo_ver2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class BanDo extends AppCompatActivity {

    private ScaleGestureDetector scaleGestureDetector;
    private float scaleFactor = 1.0f;
    private float lastX, lastY;
    private float posX, posY;
    private boolean isMoving = false;
    ImageView banDo;
    ImageView dongVat;
    ImageView map;
    ImageView them;
    ImageView xuat;
    ImageView trangChu;
    ArrayList<String> opt = new ArrayList<String>();
    ArrayAdapter adapter;
    boolean isDefaultState = true;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate( Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.ban_do);

        them = findViewById(R.id.them);
        xuat = findViewById(R.id.xuat);
        dongVat = findViewById(R.id.dongVat);
        banDo = findViewById(R.id.banDo);
        trangChu = findViewById(R.id.trangChu);
        map = findViewById(R.id.map);



        trangChu.setOnClickListener(view -> {
            Intent intent = new Intent(this, TrangChu.class);
            startActivity(intent);
        });

        dongVat.setOnClickListener(view -> {
            Intent intent = new Intent(this, DongVat.class);
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

        scaleGestureDetector = new ScaleGestureDetector(this, new ScaleGestureDetector.OnScaleGestureListener() {
            @Override
            public boolean onScale(ScaleGestureDetector detector) {
                // Xử lý sự kiện phóng to, thu nhỏ ở đây
                scaleFactor *= detector.getScaleFactor();
                scaleFactor = Math.max(0.1f, Math.min(scaleFactor, 5.0f)); // Giới hạn giá trị scaleFactor
                map.setScaleX(scaleFactor);
                map.setScaleY(scaleFactor);
                return true;
            }

            @Override
            public boolean onScaleBegin(ScaleGestureDetector detector) {
                // Xử lý sự kiện bắt đầu phóng to, thu nhỏ ở đây (nếu cần)
                return true;
            }

            @Override
            public void onScaleEnd(ScaleGestureDetector detector) {
                // Xử lý sự kiện kết thúc phóng to, thu nhỏ ở đây (nếu cần)
            }
        });



    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        scaleGestureDetector.onTouchEvent(event);

        float currentX = event.getRawX();
        float currentY = event.getRawY();

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                isMoving = false;
                lastX = currentX;
                lastY = currentY;
                break;
            case MotionEvent.ACTION_MOVE:
                float deltaX = currentX - lastX;
                float deltaY = currentY - lastY;
                if (isDefaultState && (Math.abs(deltaX) > 10 || Math.abs(deltaY) > 10)) {
                    isDefaultState = false;
                }
                if (!isDefaultState) {
                    posX += deltaX;
                    posY += deltaY;
                    map.setX(posX);
                    map.setY(posY);
                }
                lastX = currentX;
                lastY = currentY;
                isMoving = true;
                break;
            case MotionEvent.ACTION_UP:
                if (!isMoving) {
                    // Xử lý sự kiện khi người dùng nhấn vào hình ảnh (không di chuyển)
                } else {
                    if (!isDefaultState) {
                        // Trả lại hình ảnh về trạng thái ban đầu
                        posX = 0;
                        posY = 180;
                        map.setX(posX);
                        map.setY(posY);
                        scaleFactor = 1.0f;
                        map.setScaleX(scaleFactor);
                        map.setScaleY(scaleFactor);
                        isDefaultState = true;
                    }
                }
                break;
        }

        return true;
    }

}

