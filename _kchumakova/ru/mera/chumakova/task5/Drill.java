package ru.mera.chumakova.task5;

public class Drill extends ElectricInstruments implements Returnable {
    private int maxDiameter;

    public Drill(int count, String name, int quantity, int powerConsumption, int maxDiameter) {
        super(count, name, quantity, powerConsumption);
        this.maxDiameter = maxDiameter;
    }

    @Override
    public String getRequiredDocuments() {
        return "check";
    }

    @Override
    public int getDaysForReturn() {
        return 7;
    }

    public int getMaxDiameter() {
        return maxDiameter;
    }

    @Override
    public String toString() {
        return String.format("Drill: %s; count: %s; quantity: %s; power consumption: %s; diameter: %s",
                getName(), getCount(), getQuantity(), getPowerConsumption(), getMaxDiameter());
    }
}
