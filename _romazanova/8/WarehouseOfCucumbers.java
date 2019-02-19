package ru.mera.romazanova.task8;

import java.util.ArrayList;

public class WarehouseOfCucumbers implements Warehause {
    Cucumber cucumber = new Cucumber();

    public void loadCargo(ArrayList<Vegetable> cargo, int numberOfBox) {
        for (int i = 0; i < numberOfBox; i++) {
            cargo.add(cucumber);

        }

    }
}
