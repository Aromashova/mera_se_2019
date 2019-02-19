package ru.mera.romazanova.task8;

import java.util.ArrayList;

public class Logistics {

    public void loadingOfVegetableCargo(ArrayList<Vegetable> cargo, Warehause warehause, int numberOfBox) {
        final int cargoSize = cargo.size();
        if (cargoSize > 9) {
            System.out.println(" cargo is full");
            return;
        }
        if (cargoSize + numberOfBox > 10) {
            System.out.println("numberOfBox is too big");
            return;
        }

        if (warehause instanceof WarehouseOfCucumbers) {
            ((WarehouseOfCucumbers) warehause).loadCargo(cargo, numberOfBox);
        } else if (warehause instanceof WarehouseOfPotatos) {
            ((WarehouseOfPotatos) warehause).loadCargo(cargo, numberOfBox);
        } else {
            System.out.println("You try to load fruits into vegetable cargo");
            return;
        }
    }

    public void loadingOfFruitCargo(ArrayList<Fruit> cargo, Warehause warehause, int numberOfBox) {
        final int cargoSize = cargo.size();
        if (cargoSize > 9) {
            System.out.println(" cargo is full");
            return;
        }
        if (cargoSize + numberOfBox > 10) {
            System.out.println("numrebOfBox is too big");
            return;
        }

        if (warehause instanceof WarehouseOfApples) {
            ((WarehouseOfApples) warehause).loadCargo(cargo, numberOfBox);

        } else if (warehause instanceof WarehouseOfOranges) {
            ((WarehouseOfOranges) warehause).loadCargo(cargo, numberOfBox);
        } else {
            System.out.println("You try to vegetables into fruit cargo");
        }

    }

    private final Shop newShop = new Shop();

    public void unloadingOfCargo(ArrayList<? extends Plant> cargo) {
        if (cargo.isEmpty()) {
            System.out.println("Cargo was empty");
            return;

        }
        newShop.printCargo(cargo);
        cargo.clear();
        System.out.println("The cargo has been unloaded");

    }

}
