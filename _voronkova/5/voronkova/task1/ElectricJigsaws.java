package voronkova.task1;

public class ElectricJigsaws extends ElectricPowerTools {
    private  int maximumCuttingThickness;

    public ElectricJigsaws(String name, double count, int quantity, int wattage, int maximumCuttingThickness) {
        super(name, count, quantity, wattage);
        this.maximumCuttingThickness = maximumCuttingThickness;
    }

    public int getMaximumCuttingThickness() {
        return maximumCuttingThickness;
    }

    @Override
    public String toString() {
        return String.format("Electric jigsaw: %s Count: %.2f RUB Quantity: %s Wattage: %s watt Maximum cutting thickness: %s mm",
                getName(),getCount(),getQuantity(), getWattage(),getMaximumCuttingThickness());
    }
}
