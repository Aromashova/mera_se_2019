package ru.mera.grishina.task5;

public class Fretsaws extends PowerTool {
    private int thickness;

    public Fretsaws(int count, String name, int quantity, int power, int thickness) {
        super(count, name, quantity, power);
        this.thickness = thickness;
    }

    public int getThickness() {
        return thickness;
    }

    @Override
    public String toString() {
        return String.format("Fretsaws: %s\t count: %s\t quantity: %s\t power: %s\t thickness: %s\n", getName(), getCount(), getQuantity(), getPower(), getThickness());
    }
}
