package ru.mera.ponomareva.task5;

public abstract class ElectricInstrument extends AbstractItem {

    private int powerConsumption;

    public ElectricInstrument(int count, String name, int quantity, int powerConsumption) {
        super(count, name, quantity);
        this.powerConsumption = powerConsumption;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }
}
