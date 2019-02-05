package ru.mera.pechenkina.task5;

import java.util.ArrayList;

public class Shop {
	

	static ArrayList<AllItems> allProductsInTheshop = new ArrayList<AllItems>();

	public static Integer numberOfGoodsInShop = 0;
	public static Integer numberOftotalGoods = 0;
	public static Integer profitFromTheSale = 0;
	public static Integer mostPowerful = 0;
	public static Integer sumofdiskcapacities = 0;
	public static Integer daysForReturn = 0;
	public static String documentsToShow;
	
	public static ArrayList<AllItems> addElementsToArray(AllItems goodsInTheshop) {
		
		numberOftotalGoods += goodsInTheshop.getItemQuantity();
		if (numberOftotalGoods > 100) {
			System.out.println("Shop is full, you can't add new elements before trades. This good wasn't added" + goodsInTheshop);
		} else {
		    allProductsInTheshop.add(goodsInTheshop);		
		}
		return allProductsInTheshop;
	}
		
	public static void printAllElementsFromArray( ArrayList<AllItems> allProductsInTheshop) {
		
		for (AllItems allItems : allProductsInTheshop) {
			System.out.println(allItems);
		}

	}

	public static Integer countNumberOfGoodsInTotalInShop(ArrayList<AllItems> allProductsInTheshop) {
		for (AllItems allItem : allProductsInTheshop) {
			numberOfGoodsInShop += allItem.getItemQuantity();
		}
		
		return numberOfGoodsInShop;
		
	}

	public static Integer countAllThatShopWillGetAfterSallingGoods(ArrayList<AllItems> allProductsInTheshop) {
		for (AllItems allItem : allProductsInTheshop) {
			profitFromTheSale += allItem.getItemPrice()*allItem.getItemQuantity();
		}
			
		return profitFromTheSale;	
	}
	
	public static String selectMostPowerfulInstrument(ArrayList<AllItems> allProductsInTheshop) {
		
		int mostPowerfulCurrent = 0;
		String mostPowerfulInstrument = "";

		for (int i=0; i < allProductsInTheshop.size(); i++) {
			
			if (allProductsInTheshop.get(i) instanceof ElektroInstrument) {
				mostPowerfulCurrent = ((ElektroInstrument) allProductsInTheshop.get(i)).getPower();
				if (mostPowerfulCurrent > mostPowerful) {
					mostPowerful = mostPowerfulCurrent;
					mostPowerfulInstrument = allProductsInTheshop.get(i).getItemName();
				} 
			}	
		}	
		
		return String.format("Most powerful instrument with name %s has power:%s ", mostPowerfulInstrument, mostPowerful);
	}
	
	
	public static Integer getSumOfAllSSDcapacity(ArrayList<AllItems> allProductsInTheshop) {
		
		for (int i=0; i < allProductsInTheshop.size(); i++) {
			
			if ((allProductsInTheshop.get(i) instanceof Computer) && !(allProductsInTheshop.get(i) instanceof Monoblocks)) {
				sumofdiskcapacities += ((Computer) allProductsInTheshop.get(i)).getVolumeSSD();
				} 
			}	

		return sumofdiskcapacities;
		}	
		
		
	public static void getAllReturnableProducts(ArrayList<AllItems> allProductsInTheshop) {

		for (int i = 0; i < allProductsInTheshop.size(); i++) {

			if ((allProductsInTheshop.get(i) instanceof Returnable)) {
				daysForReturn = ((Returnable) allProductsInTheshop.get(i)).getDaysToReturn();
				if (daysForReturn != 0) {
					documentsToShow = ((Returnable) allProductsInTheshop.get(i)).getDocuments();
					System.out.println("If you want to return products with item name "
							+ allProductsInTheshop.get(i).getItemName() + " you need to do it in " + daysForReturn
							+ " days after purchase and have the next documents: " + documentsToShow);
				} 
			}
		}
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Shop newGoodInTheShop = new Shop();
		
		Pily pila1 = new Pily("Bosh", 1, 6000, 220, 15);
		Pily pila2 = new Pily("Shvark", 7, 12000, 2206, 13);
		
		Dreli drel = new Dreli("Shvark", 11, 6500, 206, 1);
		Dreli drel1 = new Dreli("Funtik", 1, 3456, 1789, 2);
		
		Lobziki lobzik = new Lobziki("Sivera", 55, 3452, 345, 12);
		Lobziki lobzik1 = new Lobziki("Juk", 1, 324, 220, 11);
		
		Laptops laptop = new Laptops("HP", 17, 4561, 12, 4, 256, 35, 3);
		Laptops laptop1 = new Laptops("Samsung",5, 45612, 24, 8, 1024, 55,4);
		
		Monoblocks monoblock = new Monoblocks("TempPower", 1, 2345);
		Monoblocks monoblock1 = new Monoblocks("Powerity", 1, 7689);
		
				
		addElementsToArray(pila1);
		addElementsToArray(pila2);
		addElementsToArray(drel1);
		addElementsToArray(drel);
		addElementsToArray(lobzik);
		addElementsToArray(lobzik1);
		addElementsToArray(laptop);
		addElementsToArray(laptop1);
		addElementsToArray(monoblock);
		addElementsToArray(monoblock1);
		
		
		Shop.printAllElementsFromArray(allProductsInTheshop);
		
		
		System.out.println("Let's look through goods iin the shop:");
		System.out.println("Number of goods in the shop:" + countNumberOfGoodsInTotalInShop(allProductsInTheshop));
		
		System.out.println("How much shop solt out:");
		System.out.println("Profit for shop after selling all goods:" + countAllThatShopWillGetAfterSallingGoods(allProductsInTheshop));
		
		System.out.println("Most powerful Instruments from Elektro part");
		System.out.println(selectMostPowerfulInstrument(allProductsInTheshop));
		
		System.out.println("Let's count capacity of all disks in the shop");
		System.out.println("Sum of all disks capacities = " + getSumOfAllSSDcapacity(allProductsInTheshop));
		
		System.out.println("All of these products could be returned, but you need to know some details:");
		Shop.getAllReturnableProducts(allProductsInTheshop);
		
	}

}
