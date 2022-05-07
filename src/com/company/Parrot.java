package com.company;

public class Parrot {
    private String species;
    private String color;
    private int age;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        if (species.isEmpty()){
            System.out.println("Поля виды не может быть пустым!!!");
        }else {
            this.species = species;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0){
            System.out.println("Возраст не может быть отрицательным!!!");
        }else {
            this.age = age;
        }
    }

}
