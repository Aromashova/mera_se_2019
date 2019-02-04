package ru.mera.katisheva.task5;

abstract class AbstractItem implements Item {
    private long count;
    private String name;
    private int quantity;

    AbstractItem(long countValue, String nameValue, int quantityValue){
        count=countValue;
        name=nameValue;
        quantity=quantityValue;
    }
    @Override
    public long getCount() {
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
