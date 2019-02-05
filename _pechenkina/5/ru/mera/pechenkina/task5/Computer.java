package ru.mera.pechenkina.task5;

public abstract class Computer extends AllItems{
	
	private Integer cpuNumber;
	private Integer memory;
	private Integer volumeSSD;

	public Computer(String itemName, Integer itemQuantity, Integer itemPrice) {
		super(itemName, itemQuantity, itemPrice);
		// TODO Auto-generated constructor stub
	}

	public Computer(String itemName, Integer itemQuantity, Integer itemPrice,Integer cpuNumber, Integer memory, Integer volumeSSD) {
		super(itemName, itemQuantity, itemPrice);
		this.cpuNumber = cpuNumber;
		this.memory = memory;
		this.volumeSSD = volumeSSD;
		// TODO Auto-generated constructor stub
	}



	public Integer getCpuNumber() {
		return cpuNumber;
	}

	public Integer getMemory() {
		return memory;
	}

	public Integer getVolumeSSD() {
		return volumeSSD;
	}

	@Override
	public String getItemName() {
		// TODO Auto-generated method stub
		return super.getItemName();
	}


	@Override
	public Integer getItemQuantity() {
		// TODO Auto-generated method stub
		return super.getItemQuantity();
	}


	@Override
	public Integer getItemPrice() {
		// TODO Auto-generated method stub
		return super.getItemPrice();
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Computers  with name: %s there are %d items in shop. Price: %d,  number of CPUs: %d memory:%d, volume of SSD: %d",getItemName(), getItemQuantity(),getItemPrice(), getCpuNumber(), getMemory(),getVolumeSSD() );
	}
}
