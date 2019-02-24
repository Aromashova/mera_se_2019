package ru.mera.pechenkina.task8;


public class Baklazhan implements Vegetables {

	final public String name = "Baklazhan"; 
	public Integer quantity;
	
	/**
	 * @param name
	 */

	public Baklazhan() {
		// TODO Auto-generated constructor stub
	}

	public Baklazhan(Integer quantity) {
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
