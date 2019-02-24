package ru.mera.pechenkina.task8;

public class Tomato implements Vegetables {
	
	final public String name = "Tomato";
	public Integer quantity;


	public Tomato() {
		// TODO Auto-generated constructor stub
	}

	public Tomato(Integer quantity) {
		// TODO Auto-generated constructor stub
		this.quantity = quantity;
	}

	
	public Integer getQuantity() {
		return quantity;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	@Override
	public String toString(){
		return "Vegetable name " + name;
		
	}


}
