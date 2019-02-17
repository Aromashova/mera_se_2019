package lesson8;

public abstract class AbstractFruits implements Fruits {

    private final String type = "fruit";
    private final int toDownload;

    AbstractFruits(int toDownload) {
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
