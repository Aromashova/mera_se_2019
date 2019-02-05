package Task1;

abstract class PowerToolItems extends AbstractItem{
    float powerConsumption;

    float getPowerConsumption() {
        return powerConsumption;
    }

    void show(){
        System.out.println("type:" + this.getClass().getSimpleName() + ", "
                + "name:" + this.getName() + ", "
                + "price:" + this.getPrice() + ", "
                + "quantity:" + this.getQuantity() + "(pieces), "
                + this.getOptions());
    }
}
