package ru.mera.grishina.task8;

class FruitLorry implements Fruits {
    private String name = "Fruits";
    private String weight;
    private String sweetness;

    FruitLorry(String weight, String sweetness){
        this.weight = weight;
        this.sweetness = sweetness;
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
    public String getDegreeOfSweetness() {
        return sweetness;
    }*/

    @Override
    public String toString() {
        return (name + ", Weight: " + weight + ", Degree of healthy: " + sweetness);
    }
}

/*public class FruitLorry {
    public enum Bins {
        BIN1, BIN2, BIN3, BIN4, BIN5, BIN6, BIN7, BIN8, BIN9, BIN10
    }

    private String bin;

    public FruitLorry(String Bins) {
        bin = Bins;
    }

    public String getBin() {
        return bin;
    }

    @Override
    public String toString() {
        return String.format("%s", Bins.values());
    }
}*/
