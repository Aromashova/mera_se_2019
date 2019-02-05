package Task1;

public abstract class AbstractItem implements Item{
    int price;
    int quantity;
    String name;

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    abstract String getOptions();

    abstract void show();
}
