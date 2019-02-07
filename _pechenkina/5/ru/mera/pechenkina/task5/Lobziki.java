package ru.mera.pechenkina.task5;

public class Lobziki extends ElektroInstrument implements Returnable {
	
	private String documents = "You can't return it";

	private Integer maxValueOfPropil;
	public Lobziki(String itemName, Integer itemQuantity, Integer itemPrice, Integer power, Integer maxValueOfPropil) {
		super(itemName, itemQuantity, itemPrice, power);
		this.maxValueOfPropil = maxValueOfPropil;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getDocuments() {
		return documents;
	}
	@Override
	public Integer getDaysToReturn() {
		// TODO Auto-generated method stub
		return 0;
	}
	public Integer getMaxValueOfPropil() {
		return maxValueOfPropil;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("ElektroInstument Lobziki  with name: %s there are %d items in shop. Price: %d,  it's power: %d and max value of Propil: %d",getItemName(), getItemQuantity(),getItemPrice(), getPower(), getMaxValueOfPropil());
	}

	

}
