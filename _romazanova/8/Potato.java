package ru.mera.romazanova.task8;

public class Potato implements Vegetable {
    final String nameOfPlante = "Potato";
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
