package ru.mera.pechenkina.task5;

public abstract class ElektroInstrument extends AllItems{
	
	private Integer power;

	public ElektroInstrument(String itemName, Integer itemQuantity, Integer itemPrice) {
		super(itemName, itemQuantity, itemPrice);
		// TODO Auto-generated constructor stub
	}

	public ElektroInstrument(String itemName, Integer itemQuantity, Integer itemPrice, Integer power) {
		super(itemName, itemQuantity, itemPrice);
		this.power = power;
		// TODO Auto-generated constructor stub
	}

	
	public Integer getPower() {
		return power;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("ElektroInstument with name: %s there are %d items in shop. Price: %d,  it's power: %d",getItemName(), getItemQuantity(),getItemPrice(), getPower());
	}
	
}
