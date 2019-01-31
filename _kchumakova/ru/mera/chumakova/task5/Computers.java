package ru.mera.chumakova.task5;

public abstract class Computers extends AbstractItem {
    private int memory;
    private int driveCapacity;
    private int CPU;

    public Computers(int count, String name, int quantity, int memory, int driveCapacity, int CPU) {
        super(count, name, quantity);
        this.memory = memory;
        this.driveCapacity = driveCapacity;
        this.CPU = CPU;
    }

    public int getMemory() {
        return memory;
    }

    public int getDriveCapacity() {
        return driveCapacity;
    }

    public int getCPU() {
        return CPU;
    }
}
