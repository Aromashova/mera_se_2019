package ru.mera.pechenkina.task5;

public class Laptops extends Computer implements Returnable {

	private Integer screenDiagonal;
	private Integer workHours;
	private String documents = "Pasport & Bill";
	
	public Laptops(String itemName, Integer itemQuantity, Integer itemPrice, Integer cpuNumber, Integer memory,
			Integer volumeSSD, Integer screenDiagonal, Integer workHours) {
		super(itemName, itemQuantity, itemPrice, cpuNumber, memory, volumeSSD);
		this.screenDiagonal = screenDiagonal;
		this.workHours = workHours;
		// TODO Auto-generated constructor stub
	}




	@Override
	public Integer getDaysToReturn() {
		// TODO Auto-generated method stub
		return 14;
	}


	public Integer getScreenDiagonal() {
		return screenDiagonal;
	}


	public Integer getWorkHours() {
		return workHours;
	}

	@Override
	public String getDocuments() {
		return documents;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Laptops  with name: %s there are %d items in shop. Price: %d,  number of CPUs: %d memory:%d, volume of SSD: %d. Screen diagonal:%d and it works up to %d hours",getItemName(), getItemQuantity(),getItemPrice(), getCpuNumber(), getMemory(), getVolumeSSD(), getScreenDiagonal(), getWorkHours());
	}
	
}
