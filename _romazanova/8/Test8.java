package ru.mera.romazanova.task8;

import java.util.ArrayList;

public class Test8 {

    public static void main(String[] args) {
        final ArrayList<Vegetable> cargoWithVegetables = new ArrayList<>();
        final ArrayList<Fruit> cargoWithFruits = new ArrayList<>();
        final Logistics newLogistics = new Logistics();
        newLogistics.loadingOfVegetableCargo(cargoWithVegetables, new WarehouseOfPotatos(), 2);
        newLogistics.unloadingOfCargo(cargoWithVegetables);

        newLogistics.loadingOfVegetableCargo(cargoWithVegetables, new WarehouseOfCucumbers(), 20);
        newLogistics.unloadingOfCargo(cargoWithVegetables);

        newLogistics.loadingOfFruitCargo(cargoWithFruits, new WarehouseOfApples(), 4);
        newLogistics.loadingOfFruitCargo(cargoWithFruits, new WarehouseOfOranges(), 6);
        newLogistics.unloadingOfCargo(cargoWithFruits);

        newLogistics.loadingOfFruitCargo(cargoWithFruits, new WarehouseOfApples(), 6);
        newLogistics.loadingOfFruitCargo(cargoWithFruits, new WarehouseOfOranges(), 6);
        newLogistics.unloadingOfCargo(cargoWithFruits);

    }

}
