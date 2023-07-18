package com.example.zoo_ver2;

import java.util.ArrayList;
import java.util.Iterator;

public class Animal {
    String name;
    String id;
    int age;
    String food;
    float quantityOfFood;
    String importDate;

    public Animal(String name, String id, int age, String food, float quantityOfFood, String importDate) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.food = food;
        this.quantityOfFood = quantityOfFood;
        this.importDate = importDate;
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public int getAge() {
        return this.age;
    }

    public String getFood() {
        return this.food;
    }

    public float getQuantityOfFood() {
        return this.quantityOfFood;
    }

    public String getImportDatee() {
        return this.importDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setQuantityOfFood(float quantityOfFood) {
        this.quantityOfFood = quantityOfFood;
    }

    public void setImportDate(String addDate) {
        this.importDate = addDate;
    }


    public String displayAnimalInfo() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", food='" + food + '\'' +
                ", quantityOfFood=" + quantityOfFood +
                ", importDate='" + importDate + '\'' +
                '}';
    }



    public static double averageFoodQuantity(ArrayList<Animal> animals) {
        int totalFoodQuantity = 0;
        int numberOfAnimals = animals.size();

        Animal animal;
        for(Iterator var3 = animals.iterator(); var3.hasNext(); totalFoodQuantity = (int)((float)totalFoodQuantity + animal.getQuantityOfFood())) {
            animal = (Animal)var3.next();
        }
        double averageFoodQuantity;
        return averageFoodQuantity = (double)totalFoodQuantity / (double)numberOfAnimals;

    }
}
