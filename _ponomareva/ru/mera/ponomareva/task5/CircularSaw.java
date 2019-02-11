package ru.mera.ponomareva.task5;

public class CircularSaw extends ElectricInstrument implements Returnable {

    private int diskRadius;

    public CircularSaw(int count, String name, int quantity, int powerConsumption, int diskRadius) {
        super(count, name, quantity, powerConsumption);
        this.diskRadius = diskRadius;
    }

    public int getDiskRadius() {
        return diskRadius;
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
        return String.format("Circular saw: %s; count: %s; quantity: %s; power consumption: %s; disk rudius: %s",
                                getName(), getCount(), getQuantity(), getPowerConsumption(), getDiskRadius());
    }
}
