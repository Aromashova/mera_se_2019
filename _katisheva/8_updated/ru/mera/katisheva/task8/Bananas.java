package ru.mera.katisheva.task8;

class Bananas implements Fruits {
    private long count;
    private String title="Bananas";
    private long quantity;
    private String optimalStorageTemperature;

    Bananas(long count, long quantity, String optimalStorageTemperature){
        this.count=count;
        this.quantity=quantity;
        this.optimalStorageTemperature=optimalStorageTemperature;
    }

    @Override
    public String getOptimalStorageTemperature() {
        return optimalStorageTemperature;
    }

    @Override
    public long getCount() {
        return count;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public long getQuantity() {
        return quantity;
    }

    public void increaseQuantityByOne() {
        quantity++;
    }
    @Override
    public String toString() {
        return title+", count: "+count+"rub., quantity: "+quantity+"boxes, optimal storage temperature: "+optimalStorageTemperature+"\u00b0"+"C";
    }
}
