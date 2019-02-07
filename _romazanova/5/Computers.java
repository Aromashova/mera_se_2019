package ru.mera.romazanova.task5;

public abstract class Computers extends AbstractItem {
	private final int memorySize;
	private final int hardDriveSpace;
	private final int numberOfCpuCores;

	public Computers(int count, String name, int quantity, int memorySize,
			int hardDriveSpace, int numberOfCpuCores) {
		super(count, name, quantity);
		this.memorySize = memorySize;
		this.hardDriveSpace = hardDriveSpace;
		this.numberOfCpuCores = numberOfCpuCores;
	}
	public int getMemorySize() {
		return memorySize;
	}
	public int getHardDriveSpace() {
		return hardDriveSpace;
	}
	public int getNumberOfCpuCores() {
		return numberOfCpuCores;
	}
}
