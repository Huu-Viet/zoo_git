package com.example.zoo_ver2.animal;

public class Wolf extends Animal{
    public Wolf(String name, int age, String id, int massOfFood, String health, String typeOfFood, String dayImport) {
        super(name, age, id, massOfFood, health, typeOfFood, dayImport);
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", massOfFood=" + massOfFood + "kg" +
                ", health='" + health + '\'' +
                ", typeOfFood='" + typeOfFood + '\'' +
                ", dayImport='" + dayImport + '\'' +
                '}';
    }
}
