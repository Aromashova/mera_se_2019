package ru.mera.romazanova.task8;

import java.util.ArrayList;

public class WarehouseOfOranges implements Warehause {

    Orange orange = new Orange();

    public void loadCargo(ArrayList<Fruit> cargo, int numberOfBox) {
        for (int i = 0; i < numberOfBox; i++) {
            cargo.add(orange);

        }
    }
}
