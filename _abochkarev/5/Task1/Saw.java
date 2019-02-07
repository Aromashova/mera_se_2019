package Task1;

public class Saw extends PowerToolItems implements Returnable {
    private float bladeRadius;

    Saw(String name, int price, int quantity, float powerConsumption, float bladeRadius) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.powerConsumption = powerConsumption;
        this.bladeRadius = bladeRadius;
    }

    @Override
    public String getRequiredDocuments() {
        return "Required documents: passport, check";
    }

    @Override
    public int getDaysForReturn() {
        return 14;
    }

    @Override
    String getOptions() {
        return "blade radius:" + bladeRadius;
    }
}
