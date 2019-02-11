package ru.mera.katisheva.task8;

import java.util.ArrayList;

class Stock <T>{

    private T plants;
    Stock(T plantsValue){
        plants=plantsValue;
    }

    void loadCargo(ArrayList<? super T> truck){

        if(truck.size()<10){
            truck.add(plants);
        }
    }

    public T getPlants() {
        return plants;
    }
}
