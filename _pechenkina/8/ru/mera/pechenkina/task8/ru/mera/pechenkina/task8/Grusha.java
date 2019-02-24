package ru.mera.pechenkina.task8;

public class Grusha implements Fruits{

	final public String name = "Grusha";
	public Integer quantity;
	
	
	/**
	 * @param name
	 */

	public Grusha() {
		// TODO Auto-generated constructor stub
	}

	public Grusha(Integer quantity) {
		// TODO Auto-generated constructor stub
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
		return "Fruite name " + name;
		
	}

}
