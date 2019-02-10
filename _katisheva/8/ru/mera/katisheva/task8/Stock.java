package ru.mera.katisheva.task8;

import java.util.ArrayList;

class Stock <T>{

    T plants;
    Stock(T plantsValue){
        plants=plantsValue;
    }

    void loadCargo(ArrayList truck){

        if(truck.size()<10){
            truck.add(plants);
        }
    }

    /*void addToStock(T plant){
        list.add(plant);
    }*/

}
