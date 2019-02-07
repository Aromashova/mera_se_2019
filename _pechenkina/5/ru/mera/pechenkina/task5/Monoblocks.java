package ru.mera.pechenkina.task5;

public class Monoblocks extends Computer{

	public Monoblocks(String itemName, Integer itemQuantity, Integer itemPrice) {
		super(itemName, itemQuantity, itemPrice);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Monoblocks  with name: %s there are %d items in shop. Price: %d rub",getItemName(), getItemQuantity(),getItemPrice());
	}
}
