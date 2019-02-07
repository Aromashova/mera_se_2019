package ru.mera.grishina.task5;

public class CircularSaws extends PowerTool implements Returnable{
    private int radius;

    public CircularSaws(int count, String name, int quantity, int power, int radius) {
        super(count, name, quantity, power);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
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
        return String.format("Circular saws: %s\t count: %s\t quantity: %s\t power: %s\t radius: %s\n", getName(), getCount(), getQuantity(), getPower(), getRadius());
    }
}
