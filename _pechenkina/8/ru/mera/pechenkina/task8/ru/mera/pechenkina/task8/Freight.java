package ru.mera.pechenkina.task8;

import java.util.ArrayList;
import java.util.List;

public class Freight {
	
	public static List<Fruits> fruiteCar = new ArrayList<>(10);
	public static List<Vegetables> vegetableCar = new ArrayList<>(10);
	
	public static void fruiteCarGoForCargos(List<Fruits> fruiteCar, Cargos cargo, Integer count) {
        
		
		if ( (fruiteCar.size() < 10) ) { 
			 if (cargo instanceof BananaCargo) {
		            ((BananaCargo) cargo).loadCargo(fruiteCar, count);
		        } else if (cargo instanceof GrushaCargo) {
		        	((GrushaCargo) cargo).loadCargo(fruiteCar, count);	
		        } else {
		        	System.out.println("Are you kidding?");
		        }
		} else {
			System.out.println("Your Fruite car is full try to load less or go to the shop");
		}      
	}
	
	public static void vegetableCarGoForCargos(List<Vegetables> vegetableCar, Cargos cargo, Integer count) {
        
		
			if (vegetableCar.size() < 10) { 
				if (cargo instanceof BaklazhanCargo) {
		            ((BaklazhanCargo) cargo).loadCargo(vegetableCar, count);
				} else if (cargo instanceof TomatoCargo) {
		        	((TomatoCargo) cargo).loadCargo(vegetableCar, count);	
		        } else {
		        	System.out.println("Are you kidding?");
		        }
			} else {
				System.out.println("Your Vegetable Car car is full try to load less or go to the shop");
			}      
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BananaCargo bananaCargo = new BananaCargo();			
		fruiteCarGoForCargos(fruiteCar, bananaCargo, 3);
		
		GrushaCargo grushaCargo = new GrushaCargo();			
		fruiteCarGoForCargos(fruiteCar, grushaCargo, 3);
		
		BananaCargo bananaCargo2 = new BananaCargo();			
		fruiteCarGoForCargos(fruiteCar, bananaCargo2, 3);
		
		BaklazhanCargo baklazhanCargo = new BaklazhanCargo();
		vegetableCarGoForCargos(vegetableCar, baklazhanCargo, 5);
		
		TomatoCargo tomatoCargo = new TomatoCargo();
		vegetableCarGoForCargos(vegetableCar, tomatoCargo, 6);

		vegetableCarGoForCargos(vegetableCar, baklazhanCargo, 5);
		vegetableCarGoForCargos(vegetableCar, tomatoCargo, 3);
		vegetableCarGoForCargos(vegetableCar, baklazhanCargo, 2);
		vegetableCarGoForCargos(vegetableCar, tomatoCargo, 1);
		
		
		Shop shop = new Shop();
		shop.printCargoInShop(fruiteCar);
		shop.printCargoInShop(vegetableCar);
		
		List<String> stringShopCheck = new ArrayList<>(1);
		stringShopCheck.add("Kurkuma");
		
		shop.printCargoInShop(stringShopCheck);
		
		
		
	}

}
