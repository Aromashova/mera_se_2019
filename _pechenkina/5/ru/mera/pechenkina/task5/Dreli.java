package ru.mera.pechenkina.task5;

public class Dreli extends ElektroInstrument implements Returnable{

	private Integer sverloRadius;
	private String documents = "Bill";

	public Dreli(String itemName, Integer itemQuantity, Integer itemPrice, Integer power, Integer sverloRadius) {
		super(itemName, itemQuantity, itemPrice, power);
		this.sverloRadius = sverloRadius;
		// TODO Auto-generated constructor stub
	}

	public Integer getSverloRadius() {
		return sverloRadius;
	}


	@Override
	public String getDocuments() {
		return documents;
	}
	
	@Override
	public Integer getDaysToReturn() {
		// TODO Auto-generated method stub
		return 7;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("ElektroInstument Dreli with name: %s there are %d items in shop. Price: %d,  it's power: %d and sverlo radius: %d",getItemName(), getItemQuantity(),getItemPrice(), getPower(), getSverloRadius());
	}


}
