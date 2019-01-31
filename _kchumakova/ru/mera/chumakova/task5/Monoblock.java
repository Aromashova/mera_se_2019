package ru.mera.chumakova.task5;

public class Monoblock extends Computers {

    public Monoblock(int count, String name, int quantity, int memory, int driveCapacity, int CPU) {
        super(count, name, quantity, memory, driveCapacity, CPU);
    }

    @Override
    public String toString() {
        return String.format("Monoblock: %s; count: %s; quantity: %s; memory: %s; drive capacity: %s; CPU: %s",
                getName(), getCount(), getQuantity(), getMemory(), getDriveCapacity(), getCPU());
    }
}
