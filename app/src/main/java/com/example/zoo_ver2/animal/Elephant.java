package com.example.zoo_ver2.animal;

public class Elephant extends Animal{
    public Elephant(String name, int age, String id, int massOfFood, String health, String typeOfFood, String dayImport) {
        super(name, age, id, massOfFood, health, typeOfFood, dayImport);
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", massOfFood=" + massOfFood +
                ", health='" + health + '\'' +
                ", typeOfFood='" + typeOfFood + '\'' +
                ", dayImport='" + dayImport + '\'' +
                '}';
    }
}
