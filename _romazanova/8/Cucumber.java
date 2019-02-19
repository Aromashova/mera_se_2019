package ru.mera.romazanova.task8;

public class Cucumber implements Vegetable {
    final String nameOfPlante = "Cucumber";
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
