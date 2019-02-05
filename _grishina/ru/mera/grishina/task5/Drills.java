package ru.mera.grishina.task5;

public class Drills extends PowerTool implements Returnable {
    private int diameter;

    public Drills(int count, String name, int quantity, int power, int diameter) {
        super(count, name, quantity, power);
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    @Override
    public int getDaysForReturn() {
        return 7;
    }

    @Override
    public String getRequiredDocuments() {
        return "You need a check to return.";
    }

    @Override
    public String toString() {
        return String.format("Drills: %s\t count: %s\t quantity: %s\t power: %s\t diameter: %s\n", getName(), getCount(), getQuantity(), getPower(), getDiameter());
    }
}
