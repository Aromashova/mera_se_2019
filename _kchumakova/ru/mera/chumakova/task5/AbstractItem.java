package ru.mera.chumakova.task5;

public abstract class AbstractItem implements Item{
    private int count;
    private String name;
    private int quantity;

    public AbstractItem(int count, String name, int quantity) {
        this.count = count;
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }
}
