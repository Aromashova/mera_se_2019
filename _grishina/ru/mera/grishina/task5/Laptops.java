package ru.mera.grishina.task5;

public class Laptops extends Computers implements Returnable {
    private int diagonal;
    private int battery_life;

    public Laptops(int count, String name, int quantity, int memory, int hdd_space, int cpu, int diagonal, int battery_life) {
        super(count, name, quantity, memory, hdd_space, cpu);
        this.diagonal = diagonal;
        this.battery_life = battery_life;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public int getBatteryLife() {
        return battery_life;
    }

    @Override
    public int getDaysForReturn() {
        return 14;
    }

    @Override
    public String getRequiredDocuments() {
        return "You need a check and passport to return.";
    }

    @Override
    public String toString() {
        return String.format("Laptops: %s\t count: %s\t quantity: %s\t memory: %s\t HDD space: %s\t CPU: %s\t battery life: %s\t diagonal: %s\n", getName(), getCount(), getQuantity(), getMemory(), getHddSpace(), getCpu(), getBatteryLife(), getDiagonal());
    }
}
