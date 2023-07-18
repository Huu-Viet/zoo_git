package com.example.zoo_ver2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.zoo_ver2.animal.Elephant;
import com.example.zoo_ver2.animal.Lion;
import com.example.zoo_ver2.animal.Snake;
import com.example.zoo_ver2.animal.Tiger;
import com.example.zoo_ver2.animal.Wolf;

import java.util.ArrayList;

public class AdapterListView extends BaseAdapter {
    private Context context;
    private ArrayList<Lion> lion;
    private ArrayList<Elephant> elephant;
    private ArrayList<Tiger> tiger;
    private ArrayList<Wolf> wolf;
    private ArrayList<Snake> snake;
    private int layout;
    private ArrayList<String> thongtin ;
    private ArrayList<String> ten ;

    public AdapterListView(Context context, ArrayList<Lion> lion, ArrayList<Elephant> elephant,ArrayList<Tiger> tiger, ArrayList<Wolf> wolf, ArrayList<Snake> snake, int layout) {
        this.context = context;
        this.lion = lion;
        this.elephant = elephant;
        this.tiger = tiger;
        this.wolf = wolf;
        this.snake = snake;
        this.layout = layout;
    }

    public void tinhThucAnTB(){


    }

    public void sum(){
        float sumlion = 0;
        float sumtiger = 0;
        float sumwolf = 0;
        float sumsnake = 0;
        float sumelephant = 0;
        for(Lion lionx : lion){
            sumlion +=  lionx.getMassOfFood();
        }
        for(Tiger tigerx : tiger){
            sumtiger +=  tigerx.getMassOfFood();
        }
        for(Wolf wolfx : wolf){
            sumwolf +=  wolfx.getMassOfFood();
        }
        for(Snake snakex : snake){
            sumsnake +=  snakex.getMassOfFood();
        }
        for(Elephant elephantx : elephant){
            sumelephant +=  elephantx.getMassOfFood();
        }
        thongtin = new ArrayList<>();
        ten = new ArrayList<>();
        thongtin.add("Số cá thể trong loài sư tử: " + lion.size() + "\nLượng thức ăn trung bình: " + sumlion/lion.size());
        ten.add("Lion");
        thongtin.add("Số cá thể trong loài hổ: " + tiger.size() + "\nLượng thức ăn trung bình: " + sumtiger / tiger.size());
        ten.add("tiger");
        thongtin.add("Số cá thể trong loài sói: " + wolf.size() + "\nLượng thức ăn trung bình: " + sumwolf/wolf.size());
        ten.add("wolf");

        thongtin.add("Số cá thể trong loài rắn: " + snake.size() + "\nLượng thức ăn trung bình: " + sumsnake/snake.size());
        ten.add("snake");
        thongtin.add("Số cá thể trong loài voi: " + elephant.size() + "\nLượng thức ăn trung bình: " + sumelephant/elephant.size());
        ten.add("elephant");
    }



    @Override
    public int getCount() {
        sum();
        return thongtin.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        sum();
        view =LayoutInflater.from(context).inflate(R.layout.loai,viewGroup,false);
        TextView slCaThe = (view).findViewById(R.id.food);
        TextView tenLoai = view.findViewById(R.id.tenLoai);
        slCaThe.setText(thongtin.get(i));
        tenLoai.setText(ten.get(i));
        return view;
    }
}
