package com.example.zoo_ver2;

import com.example.zoo_ver2.animal.Lion;
import com.example.zoo_ver2.animal.Tiger;
import com.example.zoo_ver2.animal.Wolf;
import com.example.zoo_ver2.animal.Snake;
import com.example.zoo_ver2.animal.Elephant;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;

    public class SaveData {
        private static final String PREFERENCES_FILE_NAME = "UserCredentials";
        private static final String KEY_ZOO = "zoo";
        private static final String KEY_LION = "lion";
        private static final String KEY_TIGER = "tiger";
        private static final String KEY_WOLF = "wolf";
        private static final String KEY_SNAKE = "snake";
        private static final String KEY_ELEPHANT = "elephant";

        public static void saveZoo(Context context, ArrayList<Object> zoo) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCES_FILE_NAME, Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();

            // Chuyển đổi ArrayList thành chuỗi JSON bằng Gson
            Gson gson = new Gson();
            String json = gson.toJson(zoo);

            editor.putString(KEY_ZOO, json);
            editor.apply();
        }

        public static ArrayList<Object> getZoo(Context context) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCES_FILE_NAME, Context.MODE_PRIVATE);
            String json = sharedPreferences.getString(KEY_ZOO, "");

            // Chuyển đổi chuỗi JSON thành ArrayList bằng Gson
            Gson gson = new Gson();
            Type type = new TypeToken<ArrayList<Object>>() {}.getType();
            ArrayList<Object> zoo = gson.fromJson(json, type);

            if (zoo == null) {
                zoo = new ArrayList<>();
            }

            return zoo;
        }

        // Tương tự cho các ArrayList còn lại
        //Lion
        public static void saveLion(Context context, ArrayList<Lion> lion) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCES_FILE_NAME, Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();

            Gson gson = new Gson();
            String json = gson.toJson(lion);

            editor.putString(KEY_LION, json);
            editor.apply();
        }

        public static ArrayList<Lion> getLion(Context context) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCES_FILE_NAME, Context.MODE_PRIVATE);
            String json = sharedPreferences.getString(KEY_LION, "");

            Gson gson = new Gson();
            Type type = new TypeToken<ArrayList<Lion>>() {}.getType();
            ArrayList<Lion> lion = gson.fromJson(json, type);

            if (lion == null) {
                lion = new ArrayList<>();
            }

            return lion;
        }


        public static void saveTiger(Context context, ArrayList<Tiger> tiger) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCES_FILE_NAME, Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();

            Gson gson = new Gson();
            String json = gson.toJson(tiger);

            editor.putString(KEY_TIGER, json);
            editor.apply();
        }

        public static ArrayList<Tiger> getTiger(Context context) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCES_FILE_NAME, Context.MODE_PRIVATE);
            String json = sharedPreferences.getString(KEY_TIGER, "");

            Gson gson = new Gson();
            Type type = new TypeToken<ArrayList<Tiger>>() {}.getType();
            ArrayList<Tiger> tiger = gson.fromJson(json, type);

            if (tiger == null) {
                tiger = new ArrayList<>();
            }

            return tiger;
        }

        public static void saveWolf(Context context, ArrayList<Wolf> wolf) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCES_FILE_NAME, Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();

            Gson gson = new Gson();
            String json = gson.toJson(wolf);

            editor.putString(KEY_WOLF, json);
            editor.apply();
        }

        public static ArrayList<Wolf> getWolf(Context context) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCES_FILE_NAME, Context.MODE_PRIVATE);
            String json = sharedPreferences.getString(KEY_WOLF, "");

            Gson gson = new Gson();
            Type type = new TypeToken<ArrayList<Wolf>>() {}.getType();
            ArrayList<Wolf> wolf = gson.fromJson(json, type);

            if (wolf == null) {
                wolf = new ArrayList<>();
            }

            return wolf;
        }

        public static void saveSnake(Context context, ArrayList<Snake> snake) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCES_FILE_NAME, Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();

            Gson gson = new Gson();
            String json = gson.toJson(snake);

            editor.putString(KEY_SNAKE, json);
            editor.apply();
        }
        //snake
        public static ArrayList<Snake> getSnake(Context context) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCES_FILE_NAME, Context.MODE_PRIVATE);
            String json = sharedPreferences.getString(KEY_SNAKE, "");

            Gson gson = new Gson();
            Type type = new TypeToken<ArrayList<Snake>>() {}.getType();
            ArrayList<Snake> snake = gson.fromJson(json, type);

            if (snake == null) {
                snake = new ArrayList<>();
            }

            return snake;
        }

        public static void saveElephant(Context context, ArrayList<Elephant> elephant) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCES_FILE_NAME, Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();

            Gson gson = new Gson();
            String json = gson.toJson(elephant);

            editor.putString(KEY_ELEPHANT, json);
            editor.apply();
        }

        public static ArrayList<Elephant> getElephant(Context context) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCES_FILE_NAME, Context.MODE_PRIVATE);
            String json = sharedPreferences.getString(KEY_ELEPHANT, "");

            Gson gson = new Gson();
            Type type = new TypeToken<ArrayList<Elephant>>() {}.getType();
            ArrayList<Elephant> elephant = gson.fromJson(json, type);

            if (elephant == null) {
                elephant = new ArrayList<>();
            }

            return elephant;
        }
        public static void resetData(Context context) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCES_FILE_NAME, Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.clear();
            editor.apply();
        }

        // Các phương thức khác
    }
