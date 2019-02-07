package voronkova.task1;

public abstract class AbstractItem implements Item{
    private String name;
    private double count;//?
    private int quantity;

    public AbstractItem(String name, double count, int quantity) {
        this.name = name;
        this.count = count;
        this.quantity = quantity;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCount() {
        return count;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return name + " " + count + " " + quantity;
    }
}
