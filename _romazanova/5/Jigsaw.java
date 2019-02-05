package ru.mera.romazanova.task5;

public class Jigsaw extends ElectricalTools implements Returnable {

    private final int cuttingThickness;
    private final String typeOfGood = "Jigsaw";

    public Jigsaw(int count, String name, int quantity, int powerConsumption, int cuttingThickness) {
        super(count, name, quantity, powerConsumption);
        this.cuttingThickness = cuttingThickness;
    }

    public int getCuttingThickness() {
        return cuttingThickness;
    }

    public String getTypeOfGood() {
        return typeOfGood;
    }

    @Override
    public String getRequiredDocument() {
        return null;
    }

    @Override
    public int getDaysForReturn() {
        return 0;
    }

    @Override
    public String toString() {
        return "Jigsaw " + getName() + " price: " + getCount() + " quantity: " + getQuantity() + " power consumption: "
                + getPowerconsumption() + " max cutting thickness: " + getCuttingThickness() + "\n";
    }

}
