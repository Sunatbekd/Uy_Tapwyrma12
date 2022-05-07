package com.company;

public class Fish {
    private String species;
    private int weight;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String fishSpecies) {
        if (fishSpecies.isEmpty()){
            System.out.println("Поля Виды не должно быть пустым!!!");
        }else {
            species = fishSpecies;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int fishWeight) {
        if (fishWeight<0){
            System.out.println("Вес не может быть отрицательным!!!");
        }
        this.weight = fishWeight;
    }

}
