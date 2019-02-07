package Task1;


import java.util.ArrayList;
import java.util.List;

public class Main {
    private static int index;
    private static boolean mark = false;

    public static void main(String[] args) {

        AbstractItem[] array = new AbstractItem[100];
        AbstractItem maxPowerConsumptionItem = null;
        List<AbstractItem> typeCollection = new ArrayList<>();
        float maxPowerConsumption = 0f;
        int summa = 0;
        int summaryHDSize = 0;
        boolean exist = false;

        addToArray(array, new Saw("Bosch", 3500, 23, 500.5f, 125f), typeCollection);
        addToArray(array, new Saw("Makita", 4000, 3, 720f, 125f), typeCollection);

        addToArray(array, new Drill("Bosch", 1500, 9, 650f, 13f), typeCollection);
        addToArray(array, new Drill("Dewalt", 1950, 6, 400f, 10.7f), typeCollection);

        addToArray(array, new Jigsaw("Kolner", 800, 2, 650f, 3.5f), typeCollection);
        addToArray(array, new Jigsaw("Bosch", 1950, 10, 500f, 4f), typeCollection);

        addToArray(array, new Laptop("Lenovo", 25000, 5, 4, 256, 4, 15, 8), typeCollection);
        addToArray(array, new Laptop("HP", 50499, 13, 8, 500, 4, 15, 8), typeCollection);

        addToArray(array, new Monoblock("HP", 152000, 3, 32, 1000, 8), typeCollection);
        addToArray(array, new Monoblock("Apple", 320000, 2, 32, 1000, 8), typeCollection);

        System.out.println(" ----- All Store Products: ----- ");
        for (AbstractItem item : typeCollection) {
            item.show();
        }

        for (AbstractItem item : array) {
            if (item != null) {
                summa += item.getPrice();
                if (item instanceof PowerToolItems) {
                    if (((PowerToolItems) item).getPowerConsumption() > maxPowerConsumption) {
                        maxPowerConsumption = ((PowerToolItems) item).getPowerConsumption();
                        maxPowerConsumptionItem = item;
                    }
                }
                if (item instanceof ComputerItems) {
                    summaryHDSize += ((ComputerItems) item).getHDSize();
                }
            }
        }

        System.out.println(" ------------------------------ ");
        System.out.println("Amount from the sale of all items = " + summa + " RUB");
        System.out.println(" ------------------------------ ");

        if (maxPowerConsumptionItem != null) {
            System.out.println("Max power consumption item: " + maxPowerConsumptionItem.getClass().getSimpleName() + " " + maxPowerConsumptionItem.getName());
            System.out.println(" ------------------------------ ");
        }

        if (summaryHDSize != 0) {
            System.out.println("The total amount of memory on all hard drives = " + summaryHDSize + " Gb");
            System.out.println(" ------------------------------ ");
        }

        System.out.println("This items can be returned:");
        for (AbstractItem item : typeCollection) {
            if (item instanceof Returnable) {
                exist = true;
                System.out.println("* " + item.getClass().getSimpleName() + " " + item.getName() + ":");
                System.out.println("\tThis item can be returned within " + ((Returnable) item).getDaysForReturn() + " days.");
                System.out.println("\t" + ((Returnable) item).getRequiredDocuments());
            }
        }
        if (!exist) {
            System.out.println("There are no such items");
        }
        System.out.println(" ------------------------------ ");

    }

    private static void addToArray(AbstractItem[] array, AbstractItem item, List<AbstractItem> typeCollection) {
        if (!mark) {
            typeCollection.add(item);
            for (int i = 0; i < item.getQuantity(); i++) {
                if (index < 100) {
                    array[index] = item;
                    index++;
                } else {
                    mark = true;
                    System.out.println("--------\nWARNING :: There is no more space in the warehouse!\n--------\n");
                    typeCollection.remove(item);
                    item.setQuantity(i);
                    typeCollection.add(item);
                    break;
                }
            }
        }
    }

}

