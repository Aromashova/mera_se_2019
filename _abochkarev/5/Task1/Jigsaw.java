package Task1;

public class Jigsaw extends PowerToolItems {
    private float cuttingThickness;

    public Jigsaw(String name, int price, int quantity, float powerConsumption, float cuttingThickness) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.powerConsumption = powerConsumption;
        this.cuttingThickness = cuttingThickness;
    }

    @Override
    String getOptions() {
        return "cutting thickness:" + cuttingThickness;
    }

}
