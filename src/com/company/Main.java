package com.company;

public class Main {

    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.setSpecies("Акула");
        fish.setWeight(100);
        System.out.println("Названия рыб: "+fish.getSpecies());
        System.out.println("Вес рыбы "+fish.getWeight()+" кг\n----------------");

        Parrot parrot = new Parrot();
        parrot.setSpecies("Неразлучники");
        parrot.setColor("ПолуЗеленый Полукрасный");
        parrot.setAge(5);
        System.out.println("Названия попугаев: "+parrot.getSpecies());
        System.out.println("Цвет: "+parrot.getColor());
        System.out.println("Возраст: "+parrot.getAge()+"\n------------------");

        Cat cat = new Cat();
        cat.setName("Жора");
        cat.setColor("Серый");
        cat.setAge(10);
        System.out.println("Имя кошки: "+cat.getName());
        System.out.println("Цвет: "+cat.getColor());
        System.out.println("Возраст: "+cat.getAge()+" кг\n------------------");

        Dog dog = new Dog();
        dog.setName("Бобик");
        dog.setAge(10);
        dog.setColor("Черный");
        System.out.println("Имя собаки: "+dog.getName());
        System.out.println("Возраст: "+dog.getAge());
        System.out.println("Цвет: "+dog.getColor()+"\n--------------------");

    }
}
