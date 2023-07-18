package com.example.zoo_ver2.animal;
public class Animal {
    String name;
    int age;
    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMassOfFood() {
        return massOfFood;
    }

    public void setMassOfFood(int massOfFood) {
        if(massOfFood >= 1) {
            this.massOfFood = massOfFood;
        }
    }

    int massOfFood; // ?/kg
    String health;
    String typeOfFood;
    String dayImport; // dd/mm/yy

    public String getDayImport() {
        return dayImport;
    }

    public void setDayImport(String dayImport) {
        this.dayImport = dayImport;
    }

    public Animal(String name, int age, String id, int massOfFood, String health, String typeOfFood, String dayImport) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.massOfFood = massOfFood;
        this.health = health;
        this.typeOfFood = typeOfFood;
        this.dayImport = dayImport;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", massOfFood=" + massOfFood +  "kg" +
                ", health='" + health + '\'' +
                ", typeOfFood='" + typeOfFood + '\'' +
                ", dayImport='" + dayImport + '\'' +
                '}';
    }
}
