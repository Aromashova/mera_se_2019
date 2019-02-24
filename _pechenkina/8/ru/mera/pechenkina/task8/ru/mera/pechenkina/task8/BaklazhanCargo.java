package ru.mera.pechenkina.task8;

import java.util.List;

public class BaklazhanCargo implements Cargos{

    public void loadCargo(List<Vegetables> vegetableCar, Integer quantity) {
    	
    	vegetableCar.add(new Baklazhan(quantity));
    }
}
