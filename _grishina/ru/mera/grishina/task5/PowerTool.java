package ru.mera.grishina.task5;

public abstract class PowerTool extends AbstractItem {
    private int power;

    public PowerTool(int count, String name, int quantity, int power) {
        super(count, name, quantity);
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}