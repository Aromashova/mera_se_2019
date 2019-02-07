package ru.mera.romazanova.task5;

public abstract class ElectricalTools extends AbstractItem {
	private final int powerConsumption;

	public ElectricalTools(int count, String name, int quantity,
			int powerConsumption) {
		super(count, name, quantity);
		this.powerConsumption = powerConsumption;
	}

	public int getPowerconsumption() {
		return powerConsumption;
	}

}
