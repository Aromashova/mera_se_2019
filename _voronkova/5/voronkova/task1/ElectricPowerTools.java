package voronkova.task1;

public abstract class ElectricPowerTools extends AbstractItem {
    private int wattage;

    public ElectricPowerTools(String name, double count, int quantity, int wattage) {
        super(name, count, quantity);
        this.wattage = wattage;
    }

    public int getWattage() {
        return wattage;
    }
}
