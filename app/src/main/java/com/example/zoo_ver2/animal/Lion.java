package com.example.zoo_ver2.animal;

public class Lion  extends Animal{
    public Lion(String name, int age, String id, int massOfFood, String health, String typeOfFood, String dayImport) {
        super(name, age, id, massOfFood, health, typeOfFood, dayImport);
    }

    @Override
    public String toString() {
        return "Lion{" +
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
