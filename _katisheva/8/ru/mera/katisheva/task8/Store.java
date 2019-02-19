package ru.mera.katisheva.task8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Store {

    Map store;
    Store(){
        store = new HashMap();
    }

    void deliveryToStore(ArrayList<? extends Plants> cargo) {


        store.put(cargo.get(0).getTitle(),cargo.get(0));

        for(int i=1; i<cargo.size(); i++){
            if(!store.containsKey(cargo.get(i).getTitle())) {
                store.put(cargo.get(i).getTitle(), cargo.get(i));

            }
            else{
                //long quantityTemp=((Plants)(store.get(cargo.get(i).getTitle()))).getQuantity();
                //((Plants)(store.get(cargo.get(i).getTitle()))).setQuantity(++quantityTemp);
                ((Plants)(store.get(cargo.get(i).getTitle()))).increaseQuantityByOne();
            }

        }

    }

    void printCargo(){
        for(Object obj : store.keySet()){
            System.out.println(store.get(obj));
        }
    }

}
