package ru.mera.katisheva.task8;

import java.util.ArrayList;

class StocksTrucksDemo {

    private ArrayList<Fruits> truckFruits;
    private ArrayList<Vegetables> truckVegetables;
    private ArrayList<Stock<Fruits>> stockFruits;
    private ArrayList<Stock<Vegetables>> stockVegetables;

    StocksTrucksDemo(){
        truckFruits = new ArrayList<>(10);
        truckVegetables = new ArrayList<>(10);
        stockFruits=new ArrayList<>();
        stockVegetables=new ArrayList<>();
        Apples apples = new Apples(70, 1, "-1-4");
        Oranges oranges = new Oranges(50,1, "0-2");
        Potato potato = new Potato( 40, 1, "Russia");
        Cabbage cabbage = new Cabbage(15, 1, "Russia");
        Bananas bananas = new Bananas( 30, 1, "+13+14");

        stockFruits.add(new Stock<Fruits>(apples));
        stockFruits.add(new Stock<Fruits>(oranges));
        stockFruits.add(new Stock<Fruits>(bananas));
        stockFruits.add(new Stock<Fruits>(bananas));
        stockFruits.add(new Stock<Fruits>(apples));
        stockFruits.add(new Stock<Fruits>(apples));
        stockFruits.add(new Stock<Fruits>(oranges));
        stockFruits.add(new Stock<Fruits>(oranges));
        stockFruits.add(new Stock<Fruits>(bananas));
        stockFruits.add(new Stock<Fruits>(bananas));

        stockVegetables.add(new Stock<Vegetables>(potato));
        stockVegetables.add(new Stock<Vegetables>(potato));
        stockVegetables.add(new Stock<Vegetables>(potato));
        stockVegetables.add(new Stock<Vegetables>(potato));
        stockVegetables.add(new Stock<Vegetables>(cabbage));
        stockVegetables.add(new Stock<Vegetables>(cabbage));
        stockVegetables.add(new Stock<Vegetables>(cabbage));
        stockVegetables.add(new Stock<Vegetables>(cabbage));
        stockVegetables.add(new Stock<Vegetables>(cabbage));
        stockVegetables.add(new Stock<Vegetables>(cabbage));
        stockVegetables.add(new Stock<Vegetables>(cabbage));
        stockVegetables.add(new Stock<Vegetables>(cabbage));
    }
    public static void main(String[] args){

        StocksTrucksDemo std = new StocksTrucksDemo();
        for(Stock<Fruits> st : std.stockFruits){
            st.loadCargo(std.truckFruits);
        }

        for(Stock<Vegetables> st : std.stockVegetables){
            st.loadCargo(std.truckVegetables);
        }

        Store store1 = new Store();
        store1.deliveryToStore(std.truckFruits);
        store1.deliveryToStore(std.truckVegetables);
        store1.printCargo();

    }
}
