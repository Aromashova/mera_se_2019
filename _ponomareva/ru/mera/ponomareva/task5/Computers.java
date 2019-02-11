package ru.mera.ponomareva.task5;

public abstract class Computers extends AbstractItem{

    private int ram;
    private int hardDiskCapacity;
    private int cpu;

    public Computers(int count, String name, int quantity, int ram, int hardDiskCapacity, int cpu) {
        super(count, name, quantity);
        this.ram = ram;
        this.hardDiskCapacity = hardDiskCapacity;
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public int getHardDiskCapacity() {
        return hardDiskCapacity;
    }

    public int getCpu() {
        return cpu;
    }

}
