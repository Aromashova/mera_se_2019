package ru.mera.katisheva.task9;

public class PrivateVegetable {
    @JsonName(jsonName = "count")
    private long count;
    @JsonName(jsonName = "title")
    private String title;
    @JsonName(jsonName = "quantity")
    private long quantity;
    @JsonIgnore
    private String optimalStorageTemperature;

    @ConstAnnot(constAnnot = PrivateVegetable.class)
    public PrivateVegetable(long count, String title, long quantity, String optimalStorageTemperature) {
        this.count = count;
        this.title = title;
        this.quantity = quantity;
        this.optimalStorageTemperature = optimalStorageTemperature;
    }
    public PrivateVegetable() {
        this.count = 0;
        this.title = "unknown";
        this.quantity = 0;
        this.optimalStorageTemperature = "unknown";
    }

    public long getCount() {
        return count;
    }

    public String getTitle() {
        return title;
    }

    public long getQuantity() {
        return quantity;
    }

    public String getOptimalStorageTemperature() {
        return optimalStorageTemperature;
    }

    @Override
    public String toString() {
        return "PrivateVegetable{" +
                "count=" + count +
                ", title='" + title + '\'' +
                ", quantity=" + quantity +
                ", optimalStorageTemperature='" + optimalStorageTemperature + '\'' +
                '}';
    }
}
