package lesson8;

public class Corn extends AbstractVegetables {

    private final String name = "Corn";

    Corn(int toDownload) {
        super(toDownload);
    }

    @Override
    public String getPlantsName() {
        return " name:" + name;
    }
}
