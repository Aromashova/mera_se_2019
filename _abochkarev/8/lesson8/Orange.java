package lesson8;

public class Orange extends AbstractFruits {

    private final String name = "Orange";

    Orange(int toDownload) {
        super(toDownload);
    }

    @Override
    public String getPlantsName() {
        return " name:" + name;
    }
}
