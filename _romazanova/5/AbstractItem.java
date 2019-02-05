package ru.mera.romazanova.task5;

public abstract class AbstractItem implements Item {
    private final int count;
    private final String name;
    private final int quantity;

    public AbstractItem(int count, String name, int quantity) {
        super();
        this.count = count;
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public int getCount() {
        return count;
    };

    @Override
    public String getName() {
        return name;
    };

    @Override
    public int getQuantity() {
        return quantity;
    };

}
