package ru.mera.ponomareva.task5;

public class Notebook extends Computers implements Returnable{

    private int diagonal;
    private int batteryWorkTime;

    public Notebook(int count, String name, int quantity, int ram, int hardDiskCapacity, int cpu, int diagonal, int batteryWorkTime) {
        super(count, name, quantity, ram, hardDiskCapacity, cpu);
        this.diagonal = diagonal;
        this.batteryWorkTime = batteryWorkTime;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public int getBatteryWorkTime() {
        return batteryWorkTime;
    }

    @Override
    public String getRequiredDocuments() {
        return "Required documents: receipt and passport";
    }

    @Override
    public int getDaysForReturn() {
        return 14;
    }

    @Override
    public String toString() {
        return String.format("Notebook: %s; count: %s; quantity: %s; RAM: %s;hard disk capacity: %s; CPU kernels: %s; diagonal: %s; battery work time: %s",
                getName(), getCount(), getQuantity(), getRam(), getHardDiskCapacity(), getCpu(), getDiagonal(), getBatteryWorkTime());
    }
}
