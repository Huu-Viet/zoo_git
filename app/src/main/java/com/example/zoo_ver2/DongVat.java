package com.example.zoo_ver2;

import android.content.Intent;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.zoo_ver2.AdapterListView;
import com.example.zoo_ver2.BanDo;
import com.example.zoo_ver2.ThemDongVat;
import com.example.zoo_ver2.TrangChu;
import com.example.zoo_ver2.XoaDongVat;
import com.example.zoo_ver2.animal.Animal;
import com.example.zoo_ver2.animal.Elephant;
import com.example.zoo_ver2.animal.Lion;
import com.example.zoo_ver2.animal.Snake;
import com.example.zoo_ver2.animal.Tiger;
import com.example.zoo_ver2.animal.Wolf;

import java.util.ArrayList;

public class DongVat extends AppCompatActivity {

    ImageView banDo;
    ImageView dongVat;
    ImageView map;
    ImageView them;
    ImageView xuat;
    ImageView trangChu;
    TextView slCaThe;
    ListView dsLoai;
    ArrayList<String> opt = new ArrayList<String>();
    ArrayAdapter adapter;
    static ArrayList<Object> zoo;
    static ArrayList<Lion> lion;
    static ArrayList<Tiger> tiger;
    static ArrayList<Wolf> wolf;
    static ArrayList<Snake> snake;
    static ArrayList<Elephant> elephant;
    public static String info = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dong_vat);

        dongVat = findViewById(R.id.dongVat);
        banDo = findViewById(R.id.banDo);
        trangChu = findViewById(R.id.trangChu);
        them = findViewById(R.id.them);
        xuat = findViewById(R.id.xuat);
        slCaThe = findViewById(R.id.soLuongCaThe);
//        slLoai = findViewById(R.id.soLuongLoai);
        dsLoai = findViewById(R.id.dsLoai);

        trangChu.setOnClickListener(view -> {
            SaveData.saveZoo(this, zoo);
            SaveData.saveLion(this, lion);
            SaveData.saveTiger(this, tiger);
            SaveData.saveWolf(this, wolf);
            SaveData.saveSnake(this, snake);
            SaveData.saveElephant(this, elephant);
            Intent intent = new Intent(this, TrangChu.class);
            startActivity(intent);
        });

        banDo.setOnClickListener(view -> {
            SaveData.saveZoo(this, zoo);
            SaveData.saveLion(this, lion);
            SaveData.saveTiger(this, tiger);
            SaveData.saveWolf(this, wolf);
            SaveData.saveSnake(this, snake);
            SaveData.saveElephant(this, elephant);
            Intent intent = new Intent(this, BanDo.class);
            startActivity(intent);
        });

        them.setOnClickListener(view -> {
            SaveData.saveZoo(this, zoo);
            SaveData.saveLion(this, lion);
            SaveData.saveTiger(this, tiger);
            SaveData.saveWolf(this, wolf);
            SaveData.saveSnake(this, snake);
            SaveData.saveElephant(this, elephant);
            Intent intent = new Intent(this, ThemDongVat.class);
            startActivity(intent);
        });

        xuat.setOnClickListener(view -> {
            SaveData.saveZoo(this, zoo);
            SaveData.saveLion(this, lion);
            SaveData.saveTiger(this, tiger);
            SaveData.saveWolf(this, wolf);
            SaveData.saveSnake(this, snake);
            SaveData.saveElephant(this, elephant);
            Intent intent = new Intent(this, XoaDongVat.class);
            startActivity(intent);
        });


        int n = 1;
//        zoo = new ArrayList<>();
//        lion = new ArrayList<>();
//        tiger = new ArrayList<>();
//        wolf = new ArrayList<>();
//        snake = new ArrayList<>();
//        elephant = new ArrayList<>();
//        SaveData.resetData(this);
        //lấy thông tin
        zoo = SaveData.getZoo(this);
        lion = SaveData.getLion(this);
        tiger = SaveData.getTiger(this);
        wolf = SaveData.getWolf(this);
        snake = SaveData.getSnake(this);
        elephant= SaveData.getElephant(this);
        if (lion.isEmpty()) {
            for (int i = 0; i < 3; i++) {
                Lion newLion = new Lion("Lion" + i, i, "A0" + i, i + 5, "Good", "Beef", "2/2/222");
                lion.add(newLion);
            }
        }

        if (tiger.isEmpty()) {
            for (int i = 0; i < 3; i++) {
                Tiger newTiger = new Tiger("Tiger" + i, i, "B0" + i, i + 5, "Good", "Beef", "2/2/222");
                tiger.add(newTiger);
            }
        }

        if (wolf.isEmpty()) {
            for (int i = 0; i < 3; i++) {
                Wolf newWolf = new Wolf("Wolf" + i, i, "C0" + i, i + 5, "Good", "Beef", "2/2/222");
                wolf.add(newWolf);
            }
        }

        if (snake.isEmpty()) {
            for (int i = 0; i < 3; i++) {
                Snake newSnake = new Snake("Snake" + i, i, "D0" + i, i + 1, "Good", "Chiken", "2/2/222");
                snake.add(newSnake);
            }
        }

        if (elephant.isEmpty()) {
            for (int i = 0; i < 3; i++) {
                Elephant newElephant = new Elephant("Elephant" + i, i, "E0" + i, i + 10, "Good", "Grass", "2/2/222");
                elephant.add(newElephant);
            }
        }
        SaveData.saveZoo(this, zoo);
        SaveData.saveLion(this, lion);
        SaveData.saveTiger(this, tiger);
        SaveData.saveWolf(this, wolf);
        SaveData.saveSnake(this, snake);
        SaveData.saveElephant(this, elephant);
        // thông tin mặc định các loài
//        for (int i = 0; i < 3; i++) {
//            Lion newlion = new Lion("Lion" + i, i, "A0" + i, i + 5, "Good", "Beef", "2/2/222");
//            lion.add(newlion);
//        }
//        for (int i = 0; i < 3; i++) {
//            Tiger newtiger = new Tiger("Tiger" + i, i, "B0" + i, i + 5, "Good", "Beef", "2/2/222");
//            tiger.add(newtiger);
//        }
//        for (int i = 0; i < 3; i++) {
//            Wolf newwolf = new Wolf("Wolf" + i, i, "C0" + i, i + 5, "Good", "Beef", "2/2/222");
//            wolf.add(newwolf);
//        }
//        for (int i = 0; i < 3; i++) {
//            Snake newsnake = new Snake("Snake" + i, i, "D0" + i, i + 1, "Good", "Chiken", "2/2/222");
//            snake.add(newsnake);
//        }
//        for (int i = 0; i < 3; i++) {
//            Elephant newelephant = new Elephant("Elephant" + i, i, "E0" + i, i + 10, "Good", "Grass", "2/2/222");
//            elephant.add(newelephant);
//        }
        // truyền phần thêm động vật
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("mybundle");
        if (bundle != null) {
            String loai = bundle.getString("loaiDv", "");
            if(loai.equals("lion")){
                Lion lion1 = new Lion(bundle.getString("tenDv", ""), bundle.getInt("tuoiDv", 0), bundle.getString("msoDv", ""), bundle.getInt("foodDv", 0), bundle.getString("sucKhoeDv", ""), "beef", bundle.getString("ngaythemDv", ""));
                lion.add(lion1);
            }
            else if(loai.equals("tiger")){
                Tiger tiger1 = new Tiger(bundle.getString("tenDv", ""), bundle.getInt("tuoiDv", 0), bundle.getString("msoDv", ""), bundle.getInt("foodDv", 0), bundle.getString("sucKhoeDv", ""), "beef", bundle.getString("ngaythemDv", ""));
                tiger.add(tiger1);
            }
            else if(loai.equals("wolf")){
                Wolf wolf1 = new Wolf(bundle.getString("tenDv", ""), bundle.getInt("tuoiDv", 0), bundle.getString("msoDv", ""), bundle.getInt("foodDv", 0), bundle.getString("sucKhoeDv", ""), "beef", bundle.getString("ngaythemDv", ""));
                wolf.add(wolf1);
            }
            else if(loai.equals("snake")){
                Snake snake1 = new Snake(bundle.getString("tenDv", ""), bundle.getInt("tuoiDv", 0), bundle.getString("msoDv", ""), bundle.getInt("foodDv", 0), bundle.getString("sucKhoeDv", ""), "beef", bundle.getString("ngaythemDv", ""));
                snake.add(snake1);
            }
            else if(loai.equals("elephant")){
                Elephant elephant1 = new Elephant(bundle.getString("tenDv", ""), bundle.getInt("tuoiDv", 0), bundle.getString("msoDv", ""), bundle.getInt("foodDv", 0), bundle.getString("sucKhoeDv", ""), "beef", bundle.getString("ngaythemDv", ""));
                elephant.add(elephant1);
            }
        }
            zoo.add(lion);
            zoo.add(tiger);
            zoo.add(wolf);
            zoo.add(snake);
            zoo.add(elephant);
        //them cua viet
        //lấy thông tin và xóa loài
        Intent intent1 = getIntent();
        Bundle bundle1 = intent1.getBundleExtra("bundle2");
        if (bundle1 != null) {
            String loaiXoa = bundle1.getString("loaiDvx", "");
            String tenDvXoa = bundle1.getString("tenDvx", "");
            String maSoDvXoa = bundle1.getString("maSoDvx", "");
            if (loaiXoa.equals("lion")){
                for (int i = 0; i < lion.size(); i++) {
                    if (lion.get(i).getId().equals(maSoDvXoa)) {
                        lion.remove(i);
                        i--;  // Giảm chỉ số để kiểm tra lại phần tử tiếp theo
                    }
                }
            }
            else if (loaiXoa.equals("tiger")){
                for (int i = 0; i < tiger.size(); i++) {
                    if (tiger.get(i).getId().equals(maSoDvXoa)) {
                        tiger.remove(i);
                        i--;  // Giảm chỉ số để kiểm tra lại phần tử tiếp theo
                    }
                }
            }
            else if (loaiXoa.equals("wolf")){
                for (int i = 0; i < wolf.size(); i++) {
                    if (wolf.get(i).getId().equals(maSoDvXoa)) {
                        wolf.remove(i);
                        i--;  // Giảm chỉ số để kiểm tra lại phần tử tiếp theo
                    }
                }
            }
            else if (loaiXoa.equals("snake")){
                for (int i = 0; i < snake.size(); i++) {
                    if (snake.get(i).getId().equals(maSoDvXoa)) {
                        snake.remove(i);
                        i--;  // Giảm chỉ số để kiểm tra lại phần tử tiếp theo
                    }
                }
            }
            else if (loaiXoa.equals("elephant")){
                for (int i = 0; i < elephant.size(); i++) {
                    if (elephant.get(i).getId().equals(maSoDvXoa)) {
                        elephant.remove(i);
                        i--;  // Giảm chỉ số để kiểm tra lại phần tử tiếp theo
                    }
                }
            }
        }

            int quantityOfLion;
            int quantityOfTiger;
            int quantityOfWolf;
            int quantityOfSnake;
            int quantityOfElephant;

            quantityOfLion = lion.size();
            quantityOfTiger = tiger.size();
            quantityOfWolf = wolf.size();
            quantityOfSnake = snake.size();
            quantityOfElephant = elephant.size();

            int quantityOfZoo = quantityOfElephant + quantityOfLion + quantityOfSnake + quantityOfTiger + quantityOfWolf;


            slCaThe.setText(quantityOfZoo + "");
//            slLoai.setText(zoo.size() + "");

            AdapterListView adapterListView = new AdapterListView(this, lion, elephant, tiger, wolf, snake, R.layout.loai);
            dsLoai.setAdapter(adapterListView);

            dsLoai.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int pos, long id) {

                    if (pos == 0) {
                        String inf = "";
                        String sumID = "";
                        int sumFood = 0;
                        for (Lion lionx : lion) {
                            sumID += lionx.getId() + "  ";
                            sumFood += lionx.getMassOfFood();
                        }
                        inf = "Tên: Lion" + "\n\nSố lượng: " + lion.size() + "\n\nMã số: " + sumID + "\n\nKhối lượng thức ăn" + sumFood + "\n\nLoại thức ăn: Beef";
                        info = inf;
                        Intent intent = new Intent(DongVat.this, ThongTinChiTiet.class);
                        startActivity(intent);
                    } else if (pos == 1) {
                        String inf = "";
                        String sumID = "";
                        int sumFood = 0;
                        for (Tiger tiger1 : tiger) {
                            sumID += tiger1.getId() + "  ";
                            sumFood += tiger1.getMassOfFood();
                        }
                        inf = "Tên: Tiger" + "\n\nSố lượng: " + tiger.size() + "\n\nMã số: " + sumID + "\n\nKhối lượng thức ăn" + sumFood + "\n\nLoại thức ăn: Beef";
                        info = inf;
                        Intent intent = new Intent(DongVat.this, ThongTinChiTiet.class);
                        startActivity(intent);
                    } else if (pos == 2) {
                        String inf = "";
                        String sumID = "";
                        int sumFood = 0;
                        for (Wolf wolf1 : wolf) {
                            sumID += wolf1.getId() + "  ";
                            sumFood += wolf1.getMassOfFood();
                        }
                        inf = "Tên: Wolf" + "\n\nSố lượng: " + wolf.size() + "\n\nMã số: " + sumID + "\n\nKhối lượng thức ăn" + sumFood + "\n\nLoại thức ăn: Beef";
                        info = inf;
                        Intent intent = new Intent(DongVat.this, ThongTinChiTiet.class);
                        startActivity(intent);
                    } else if (pos == 3) {
                        String inf = "";
                        String sumID = "";
                        int sumFood = 0;
                        for (Snake snake1 : snake) {
                            sumID += snake1.getId() + "  ";
                            sumFood += snake1.getMassOfFood();
                        }
                        inf = "Tên: Snake" + "\n\nSố lượng: " + snake.size() + "\n\nMã số: " + sumID + "\n\nKhối lượng thức ăn" + sumFood + "\n\nLoại thức ăn: Chicken";
                        info = inf;
                        Intent intent = new Intent(DongVat.this, ThongTinChiTiet.class);
                        startActivity(intent);
                    } else if (pos == 4) {
                        String inf = "";
                        String sumID = "";
                        int sumFood = 0;
                        for (Elephant elephant1 : elephant) {
                            sumID += elephant1.getId() + "  ";
                            sumFood += elephant1.getMassOfFood();
                        }
                        inf = "Tên: Elephant" + "\n\nSố lượng: " + elephant.size() + "\n\nMã số: " + sumID + "\n\nKhối lượng thức ăn" + sumFood + "\n\nLoại thức ăn: Grass";
                        info = inf;
                        Intent intent = new Intent(DongVat.this, ThongTinChiTiet.class);
                        startActivity(intent);
                    }

                }
            });

        }

    }