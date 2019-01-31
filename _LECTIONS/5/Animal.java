import static anotherpackage.Constants.*;

public class Animal  {
    String name = DEFAULT_ANIMAL_NAME;
    String name2 = FIELD;

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
