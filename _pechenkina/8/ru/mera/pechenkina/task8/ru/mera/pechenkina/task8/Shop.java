package ru.mera.pechenkina.task8;

import java.util.List;

public class Shop implements Plants{
	
	public void printCargoInShop(List<? extends Plants> cars) {
		
		for (int j = 0; j < cars.size(); j++) {
			if (cars.get(j) instanceof Fruits){ 
				System.out.println("Fruite Cargo get this to the shop " + (Fruits)cars.get(j));
			} else if (cars.get(j) instanceof Vegetables) {
				System.out.println("Cargo get this to the shop " + (Vegetables)cars.get(j));
			} else {
				System.out.println("You try to print smth strange");
			}
			
		}
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
