package ru.mera.grishina.task5;

public class Monoblocks extends Computers {

    public Monoblocks(int count, String name, int quantity, int memory, int hdd_space, int cpu) {
        super(count, name, quantity, memory, hdd_space, cpu);
    }

    @Override
    public String toString() {
        return String.format("Monoblocks: %s\t count: %s\t quantity: %s\t memory: %s\t HDD space: %s\t CPU: %s\n", getName(), getCount(), getQuantity(), getMemory(), getHddSpace(), getCpu());
    }
}