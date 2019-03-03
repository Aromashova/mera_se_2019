package ru.mera.grishina.task8;

class VegetLorry implements Vegetables {
    private String name = "Vegetables";
    private String weight;
    private String healthy;

    VegetLorry(String weight, String healthy) {
        this.weight = weight;
        this.healthy = healthy;
    }

    @Override
    public String getName() {
        return name;
    }

    /*@Override
    public String getWeight() {
        return weight;
    }

    @Override
    public String getDegreeOfHealthy() {
        return healthy;
    }*/

    @Override
    public String toString() {
        return (name + ", Weight: " + weight + ", Degree of healthy: " + healthy);
    }
}

/*public class VegetLorry {
    public enum Boxes {
        BOX1, BOX2, BOX3, BOX4, BOX5, BOX6, BOX7, BOX8, BOX9, BOX10
    }

    private String box;

    public VegetLorry(String Boxes) {
        box = Boxes;
    }

    public String getBox() {
        return box;
    }

    @Override
    public String toString() {
        return String.format("%s", Boxes.values());
    }
}*/