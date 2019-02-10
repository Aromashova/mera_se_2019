package ru.mera.ponomareva.task5;

public class Monoblock extends Computers {

    public Monoblock(int count, String name, int quantity, int ram, int hardDiskCapacity, int cpu) {
        super(count, name, quantity, ram, hardDiskCapacity, cpu);
    }

    @Override
    public String toString() {
        return String.format("Monoblock: %s; count: %s; quantity: %s; RAM: %s;hard disk capacity: %s; CPU kernels: %s",
                getName(), getCount(), getQuantity(), getRam(), getHardDiskCapacity(), getCpu());
    }
}
