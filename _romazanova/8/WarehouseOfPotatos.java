package ru.mera.romazanova.task8;

import java.util.ArrayList;

public class WarehouseOfPotatos implements Warehause {

    Potato potato = new Potato();

    public void loadCargo(ArrayList<Vegetable> cargo, int numberOfBox) {
        for (int i = 0; i < numberOfBox; i++) {
            cargo.add(potato);

        }
    }
}
