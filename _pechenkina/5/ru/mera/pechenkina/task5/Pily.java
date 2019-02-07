package ru.mera.pechenkina.task5;

public class Pily extends ElektroInstrument implements Returnable{
	
	private Integer diskRadius;
	private String documents = "Pasport & Bill";




	public Pily(String itemName, Integer itemQuantity, Integer itemPrice, Integer power, Integer diskRadius) {
		super(itemName, itemQuantity, itemPrice, power);
		this.diskRadius = diskRadius;
		// TODO Auto-generated constructor stub
	}

	
	public Integer getDiskRadius() {
		return diskRadius;
	}


	@Override
	public Integer getDaysToReturn() {
		// TODO Auto-generated method stub
		return 14;
	}

	@Override
	public String getDocuments() {
		return documents;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("ElektroInstument Pily with name: %s there are %d items in shop. Price: %d,  it's power: %d and disk radius: %d. Don't forget documents to return: %s",getItemName(), getItemQuantity(),getItemPrice(), getPower(), getDiskRadius(), getDocuments());
	}
	
	
}
