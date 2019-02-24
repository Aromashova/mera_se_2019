package ru.mera.pechenkina.task8;

import java.util.List;

public class GrushaCargo implements Cargos{
	
    public void loadCargo(List<Fruits> fruiteCar,Integer quantity) {
    	
			fruiteCar.add(new Grusha(quantity));
    }

}
