package ru.mera.chumakova.task5;

public abstract class ElectricInstruments extends AbstractItem{

    private int powerConsumption;

    public ElectricInstruments(int count, String name, int quantity, int powerConsumption) {
        super(count, name, quantity);
        this.powerConsumption = powerConsumption;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }
}
