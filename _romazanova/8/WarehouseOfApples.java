package ru.mera.romazanova.task8;

import java.util.ArrayList;

public class WarehouseOfApples implements Warehause {
    Apple apple = new Apple();

    public void loadCargo(ArrayList<Fruit> cargo, int numberOfBox) {
        for (int i = 0; i < numberOfBox; i++) {
            cargo.add(apple);

        }

    }

}
