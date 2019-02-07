package voronkova.task1;

public class CircularSaws extends ElectricPowerTools implements Returnable{
    private  int diskRadius;

    public CircularSaws(String name, double count, int quantity, int wattage, int diskRadius) {
        super(name, count, quantity, wattage);
        this.diskRadius = diskRadius;
    }

    public int getDiskRadius() {
        return diskRadius;
    }

    @Override
    public String getRequiredDocuments() {
        return "check and passport";
    }

    @Override
    public int getDaysForReturn() {
        return 14;
    }

    @Override
    public String toString() {
        return String.format("Circular saw: %s Count: %.2f RUB Quantity: %s Wattage: %s watt Disk radius: %s mm",
                getName(),getCount(),getQuantity(), getWattage(),getDiskRadius());
    }
}
