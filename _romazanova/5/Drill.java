package ru.mera.romazanova.task5;

public class Drill extends ElectricalTools implements Returnable {

    private final int maxDrillDiameter;
    private final String requiredDocument = "commodity check";
    private final String typeOfGood = "Drill";

    public Drill(int count, String name, int quantity, int powerConsumption, int maxDrillDiameter) {
        super(count, name, quantity, powerConsumption);
        this.maxDrillDiameter = maxDrillDiameter;

    }

    public String getTypeOfGood() {
        return typeOfGood;
    }

    public int getMaxDrillDiameter() {
        return maxDrillDiameter;
    }

    @Override
    public String getRequiredDocument() {
        // TODO Auto-generated method stub
        return requiredDocument;
    }

    @Override
    public int getDaysForReturn() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String toString() {
        return "Drill " + getName() + " price: " + getCount() + " quantity: " + getQuantity() + " power consumption: "
                + getPowerconsumption() + " max drill diameter: " + getMaxDrillDiameter() + "mm\n";
    }
}
