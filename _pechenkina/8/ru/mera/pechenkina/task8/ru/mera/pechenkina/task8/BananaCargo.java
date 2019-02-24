package ru.mera.pechenkina.task8;


import java.util.List;

public class BananaCargo implements Cargos{

	
    public void loadCargo(List<Fruits> fruiteCar, Integer quantity) {
    	    		
		fruiteCar.add(new Bananas(quantity));
    }

}
