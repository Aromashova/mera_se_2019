package ru.mera.katisheva.task9;

public class PrivateFruit {
    @JsonName(jsonName = "count")
    private long count;
    @JsonName(jsonName = "title")
    private String title;
    @JsonName(jsonName = "quantity")
    private long quantity;

    @ConstAnnot(constAnnot = PrivateFruit.class)
    PrivateFruit(String title, long count, long quantity) {
        this.count = count;
        this.title = title;
        this.quantity = quantity;
    }

    PrivateFruit() {
        this.count = 0L;
        this.title = "unknown";
        this.quantity = 0L;
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

    @Override
    public String toString() {
        return "PrivateFruit{" +
                "count=" + count +
                ", title='" + title + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
