package ru.mera.romazanova.task8;

import java.util.ArrayList;

public class Shop {
    ArrayList<Vegetable> unloadedVegetables = new ArrayList<>();
    ArrayList<Fruit> unloadedFruits = new ArrayList<>();

    public ArrayList<Vegetable> getUnloadedVegetables() {
        return unloadedVegetables;
    }

    public void setUnloadedVegetables(ArrayList<Vegetable> unloadedVegetables) {
        this.unloadedVegetables = unloadedVegetables;
    }

    public void setUnloadedFruits(ArrayList<Fruit> unloadedFruits) {
        this.unloadedFruits = unloadedFruits;
    }

    public ArrayList<Fruit> getUnloadedFruits() {
        return unloadedFruits;
    }

    public void printCargo(ArrayList<? extends Plant> cargo) {
        for (final Plant tempContent : cargo) {
            if (tempContent instanceof Vegetable) {
                unloadedVegetables.add((Vegetable) tempContent);
                System.out.println(tempContent.getVolume() + " of " + tempContent.getTypeOfProduct()
                        + " was unloaded in the shop");

            } else if (tempContent instanceof Fruit) {
                unloadedFruits.add((Fruit) tempContent);
                System.out.println(tempContent.getVolume() + " of " + tempContent.getTypeOfProduct()
                        + " was unloaded in the shop");
            }

        }
    }
}
