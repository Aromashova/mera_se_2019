package ru.mera.ponomareva.task5;

public class Jigsaw extends ElectricInstrument {

    private int kerfThickness;

    public Jigsaw(int count, String name, int quantity, int powerConsumption, int kerfThickness) {
        super(count, name, quantity, powerConsumption);
        this.kerfThickness = kerfThickness;
    }

    public int getKerfThickness() {
        return kerfThickness;
    }

    @Override
    public String toString() {
        return String.format("Jigsaw: %s; count: %s; quantity: %s; power consumption: %s; kerf thickness: %s",
                getName(), getCount(), getQuantity(), getPowerConsumption(), getKerfThickness());
    }
}
