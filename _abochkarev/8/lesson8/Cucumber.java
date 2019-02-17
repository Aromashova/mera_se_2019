package lesson8;

public class Cucumber extends AbstractVegetables{

    private final String name = "Cucumber";

    Cucumber(int toDownload) {
        super(toDownload);
    }

    @Override
    public String getPlantsName() {
        return " name:" + name;
    }
}
