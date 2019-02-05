package ru.mera.romazanova.task5;

public class Saw extends ElectricalTools implements Returnable {

    private final int radiusOfDisc;
    private final String requiredDocument = "commodity check and passport";
    private final int dayForReturn = 14;
    private final String typeOfGood = "Saw";

    public Saw(int count, String name, int quantity, int powerConsumption, int radiusOfDisk) {
        super(count, name, quantity, powerConsumption);
        this.radiusOfDisc = radiusOfDisk;
        // TODO Auto-generated constructor stub
    }

    public String getTypeOfGood() {
        return typeOfGood;
    }

    @Override
    public String getRequiredDocument() {
        // TODO Auto-generated method stub
        return requiredDocument;
    }

    @Override
    public int getDaysForReturn() {
        // TODO Auto-generated method stub
        return dayForReturn;
    }

    public int getRadiusOfDisc() {
        return radiusOfDisc;
    }

    @Override
    public String toString() {
        return "Saw " + getName() + " price: " + getCount() + " quantity: " + getQuantity() + " power consumption: "
                + getPowerconsumption() + " radius of disk:  " + getRadiusOfDisc() + "mm\n";
    }
}
