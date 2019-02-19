package lesson8;

public class Apple extends AbstractFruits {
    private final String name = "Apple";

    Apple(int toDownload) {
        super(toDownload);
    }

    @Override
    public String getPlantsName() {
        return " name:" + name;
    }
}
