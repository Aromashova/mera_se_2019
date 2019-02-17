package lesson8;

public abstract class AbstractVegetables implements Vegetables{

    private final String type = "vegetable";
    private final int toDownload;

    AbstractVegetables(int toDownload) {
        this.toDownload = toDownload;
    }

    @Override
    public String getTypePlant() {
        return type;
    }

    @Override
    public int getSize() {
        return toDownload;
    }

    @Override
    public String toString() {
        return getPlantsName();
    }
}
