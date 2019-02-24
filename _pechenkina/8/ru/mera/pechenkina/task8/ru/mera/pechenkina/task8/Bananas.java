package  ru.mera.pechenkina.task8;


public class Bananas implements Fruits{

	final public String name = "Banan";
	public Integer quantity;



	/**
	 * @param name
	 */

	public Bananas() {
		// TODO Auto-generated constructor stub
	}


	public Bananas(Integer quantity) {
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
		return "Fruite name " + name;
		
	}
}
