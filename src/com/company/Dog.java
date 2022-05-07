package com.company;

public class Dog {
    private String name;
    private String dreed;
    private int age;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String dogName) {
        if (dogName.isEmpty()) {
            System.out.println("Имя не должен быть пустым!!!");
        }else {
            name = dogName;
        }
    }

    public String getDreed() {
        return dreed;
    }

    public void setDreed(String dogDreed) {
        if (dogDreed.isEmpty()){
            System.out.println("Поле порода не должен быть пустым!!!");
        }else {
            this.dreed = dogDreed;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int dogAge) {
        if (dogAge<0){
            System.out.println("возраст не должен быть отрицательным!!!");
        }else {
            this.age = dogAge;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String dogColor) {
        this.color = dogColor;
    }

}
