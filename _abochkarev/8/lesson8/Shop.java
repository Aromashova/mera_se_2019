package lesson8;

import java.util.ArrayList;

class Shop {
    void printTruck(ArrayList<? extends Plants> truck) {
        System.out.println(truck);
    }
}
