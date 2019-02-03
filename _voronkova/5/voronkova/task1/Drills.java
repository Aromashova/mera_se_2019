package voronkova.task1;

public class Drills extends ElectricPowerTools implements Returnable{
    private int maxDrillDiameter;

    public Drills(String name, double count, int quantity, int wattage, int maxDrillDiameter) {
        super(name, count, quantity, wattage);
        this.maxDrillDiameter = maxDrillDiameter;
    }

    public int getMaxDrillDiameter() {
        return maxDrillDiameter;
    }

    @Override
    public String getRequiredDocuments() {
        return "check";
    }

    @Override
    public int getDaysForReturn() {
        return 7;
    }

    @Override
    public String toString() {
        return String.format("Drill: %s Count: %.2f RUB Quantity: %s Wattage: %s watt Maximum drill diameter: %s mm",
                getName(),getCount(),getQuantity(), getWattage(),getMaxDrillDiameter());
    }
}
