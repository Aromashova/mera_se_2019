package Task1;

public class Drill extends PowerToolItems implements Returnable {
    private float maxDrillDiameter;

    Drill(String name, int price, int quantity, float powerConsumption, float maxDrillDiameter) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.powerConsumption = powerConsumption;
        this.maxDrillDiameter = maxDrillDiameter;
    }

    @Override
    public String getRequiredDocuments() {
        return "Required documents: check";
    }

    @Override
    public int getDaysForReturn() {
        return 7;
    }

    @Override
    String getOptions() {
        return "max drill diameter:" + maxDrillDiameter;
    }
}
