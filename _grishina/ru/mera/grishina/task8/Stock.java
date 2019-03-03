package ru.mera.grishina.task8;

import java.util.ArrayList;

class Stock <T> {
    private T boxes;
    Stock(T boxesValue){
        boxes = boxesValue;
    }

    void loadCargo(ArrayList <? super T> lorry){
        // You can load some vegetables and check that the lorry is not overloaded
        if(lorry.size() < 100){
            lorry.add(boxes);
        }
    }
}
