package ru.mera.chumakova.task5;

public class Notebook extends Computers implements Returnable {

    private double diagonal;
    private int batteryLife;

    public Notebook(int count, String name, int quantity, int memory, int driveCapacity, int CPU, double diagonal, int batteryLife) {
        super(count, name, quantity, memory, driveCapacity, CPU);
        this.diagonal = diagonal;
        this.batteryLife = batteryLife;
    }

    @Override
    public String getRequiredDocuments() {
        return "check and passport";
    }

    @Override
    public int getDaysForReturn() {
        return 14;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    @Override
    public String toString() {
        return String.format("Notebook: %s; count: %s; quantity: %s; memory: %s; drive capacity: %s; CPU: %s; diagonal: %s; battery life: %s",
                getName(), getCount(), getQuantity(), getMemory(), getDriveCapacity(), getCPU(), getDiagonal(), getBatteryLife());
    }
}
