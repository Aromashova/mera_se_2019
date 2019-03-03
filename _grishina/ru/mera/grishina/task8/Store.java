package ru.mera.grishina.task8;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
//import ru.mera.grishina.task8.VegetLorry.Boxes;
//import ru.mera.grishina.task8.FruitLorry.Bins;

public class Store {
    private Map auchan;
    Store() {
        auchan = new HashMap();
    }

    void delivery(ArrayList <? extends Plants> cargo) {
        auchan.put(cargo.get(0).getName(), cargo.get(0));
        for(int i = 1; i < cargo.size(); i++) {
            if(!auchan.containsKey(cargo.get(i).getName())) {
                auchan.put(cargo.get(i).getName(), cargo.get(i));
            }
        }
    }

    void printCargo(){
        for(Object obj : auchan.keySet()){
            System.out.println(auchan.get(obj));
        }
    }
}

/*public class Apricot {
    public static ArrayList<VegetLorry> vegetables = new ArrayList<VegetLorry>();
    public static ArrayList<FruitLorry> fruits = new ArrayList<FruitLorry>();

    class Stock1 {
        loadCargo(ArrayList <VegetLorry> … cargo) {
            // You can load some vegetables and check that the lorry is not overloaded
            cargo.add(new Potato(“Weight 1 kg»));
        }
    }

    class Stock2 {
        /*loadCargo(ArrayList <FruitLorry> … cargo) {
            // You can load some vegetables and check that the lorry is not overloaded
            cargo.add(new Orange(“Weight 2 kg»));
        }
    }

    class Store {
        //printCargo();
    }
}*/