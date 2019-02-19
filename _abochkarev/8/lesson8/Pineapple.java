package lesson8;

public class Pineapple extends AbstractFruits {
    private final String name = "Pineapple";

    Pineapple(int toDownload) {
        super(toDownload);
    }

    @Override
    public String getPlantsName() {
        return " name:" + name;
    }
}
