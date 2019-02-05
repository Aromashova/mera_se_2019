package ru.mera.pechenkina.task5;

public abstract class AllItems implements Item {

	private String itemName;
	private Integer itemQuantity;
	private Integer itemPrice;
	
	
	
	/**
	 * @param itemName
	 * @param itemQuantity
	 * @param itemPrice
	 */
	public AllItems(String itemName, Integer itemQuantity, Integer itemPrice) {
		super();
		this.itemName = itemName;
		this.itemQuantity = itemQuantity;
		this.itemPrice = itemPrice;
	}



	public String getItemName() {
		return itemName;
	}



	public Integer getItemQuantity() {
		return itemQuantity;
	}



	public Integer getItemPrice() {
		return itemPrice;
	}

}
