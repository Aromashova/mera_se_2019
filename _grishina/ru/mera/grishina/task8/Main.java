package ru.mera.grishina.task8;

import java.util.ArrayList;

class Main {
    private ArrayList<Fruits> fruitLorry;
    private ArrayList<Vegetables> vegetLorry;
    private ArrayList<Stock<Fruits>> fruitStock;
    private ArrayList<Stock<Vegetables>> vegetStock;

    Main(){
        fruitLorry= new ArrayList<>(100);
        vegetLorry = new ArrayList<>(100);
        fruitStock=new ArrayList<>();
        vegetStock=new ArrayList<>();

        FruitLorry fruits = new FruitLorry("800 kg", "Super sweet!");
        VegetLorry vegets = new VegetLorry("500 kg","Incredibly healthy!");

        fruitStock.add(new Stock<Fruits>(fruits));
        vegetStock.add(new Stock<Vegetables>(vegets));
    }

    public static void main(String[] args){
        Main std = new Main();

        for(Stock <Fruits> st : std.fruitStock){
            st.loadCargo(std.fruitLorry);
        }

        for(Stock <Vegetables> st : std.vegetStock){
            st.loadCargo(std.vegetLorry);
        }

        Store auchan = new Store();
        auchan.delivery(std.fruitLorry);
        auchan.delivery(std.vegetLorry);
        auchan.printCargo();
    }
}