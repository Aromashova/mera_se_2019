package ru.mera.grishina.task5;

public abstract class Computers extends AbstractItem {
    private int memory;
    private int hdd_space;
    private int cpu;

    public Computers(int count, String name, int quantity, int memory, int hdd_space, int cpu) {
        super(count, name, quantity);
        this.memory = memory;
        this.hdd_space = hdd_space;
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public int getHddSpace() {
        return hdd_space;
    }

    public int getCpu() {
        return cpu;
    }
}
