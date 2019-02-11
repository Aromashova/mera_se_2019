package ru.mera.ponomareva.task5;

public class Drill extends ElectricInstrument implements Returnable {

    private int maxDrillDiameter;

    public Drill(int count, String name, int quantity, int powerConsumption, int maxDrillDiameter) {
        super(count, name, quantity, powerConsumption);
        this.maxDrillDiameter = maxDrillDiameter;
    }

    public int getMaxDrillDiameter() {
        return maxDrillDiameter;
    }

    @Override
    public String getRequiredDocuments() {
        return "Required documents: receipt";
    }

    @Override
    public int getDaysForReturn() {
        return 7;
    }

    @Override
    public String toString() {
        return String.format("Drill: %s; count: %s; quantity: %s; power consumption: %s; max drill diameter: %s",
                getName(), getCount(), getQuantity(), getPowerConsumption(), getMaxDrillDiameter());
    }
}
