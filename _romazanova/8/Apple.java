package ru.mera.romazanova.task8;

public class Apple implements Fruit {
    final String nameOfPlante = "Apple";
    final String volume = "one box";

    @Override
    public String getTypeOfProduct() {
        // TODO Auto-generated method stub
        return nameOfPlante;
    }

    public String getVolume() {
        return volume;
    }

}
