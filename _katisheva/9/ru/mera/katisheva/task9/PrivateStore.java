package ru.mera.katisheva.task9;

public class PrivateStore {
    private PrivateFruit fruit;
    private String deliveryDate;

    public PrivateStore(PrivateFruit fruit, String deliveryDate) {
        this.fruit = fruit;
        this.deliveryDate = deliveryDate;
    }

    public PrivateFruit getFruit() {
        return fruit;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    @Override
    public String toString() {
        return "PrivateStore{" +
                "fruit=" + fruit +
                ", deliveryDate='" + deliveryDate + '\'' +
                '}';
    }
}
