package ru.mera.chumakova.task5;

public class Jigsaw extends ElectricInstruments {

    private int thickness;

    public Jigsaw(int count, String name, int quantity, int powerConsumption, int thickness) {
        super(count, name, quantity, powerConsumption);
        this.thickness = thickness;
    }

    public int getThickness() {
        return thickness;
    }

    @Override
    public String toString() {
        return String.format("Jigsaw: %s; count: %s; quantity: %s; power consumption: %s; thickness: %s",
                getName(), getCount(), getQuantity(), getPowerConsumption(), getThickness());
    }
}
