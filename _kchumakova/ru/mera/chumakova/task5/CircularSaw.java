package ru.mera.chumakova.task5;

public class CircularSaw extends ElectricInstruments implements Returnable {
    private int radius;

    public CircularSaw(int count, String name, int quantity, int powerConsumption, int radius) {
        super(count, name, quantity, powerConsumption);
        this.radius = radius;
    }

    @Override
    public String getRequiredDocuments() {
        return "check and passport";
    }

    @Override
    public int getDaysForReturn() {
        return 14;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return String.format("Circular saw: %s; count: %s; quantity: %s; power consumption: %s; radius: %s",
                getName(), getCount(), getQuantity(), getPowerConsumption(), getRadius());
    }
}
