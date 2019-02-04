package ru.mera.chumakova.task5;

public class OnlineShop {
    public static void main(String[] args) {
        Item[] shop = new Item[100];
        shop[0] = new CircularSaw(6000, "Bosch", 10, 220, 120);
        shop[1] = new CircularSaw(2000, "Зубр", 20, 220, 220);

        shop[2] = new Drill(1900, "Вихрь", 5, 680, 13);
        shop[3] = new Drill(4000, "Makita", 2, 680, 12);

        shop[4] = new Jigsaw(3000, "Hitachi", 15, 705, 90);
        shop[5] = new Jigsaw(1500, "Kolner", 16, 450, 55);

        shop[6] = new Notebook(26000, "HP", 30, 4, 500, 2, 17.3, 5);
        shop[7] = new Notebook(26000, "Asus", 26, 4, 400, 2, 15.6, 4);

        shop[8] = new Monoblock(33000, "Acer", 3,4, 900, 2);
        shop[9] = new Monoblock(120000, "Apple", 4,8, 1000, 4);

        /*for (int i = 0; i < shop.length; i++) {
            if(shop[i] != null) {
                switch (shop[i].getClass().getSimpleName()) {
                    case "CircularSaw":
                        System.out.println(String.format("Circular saw: %s; count: %s; quantity: %s; power consumption: %s; radius: %s",
                                shop[i].getName(), shop[i].getCount(), shop[i].getQuantity(),
                                ((CircularSaw) shop[i]).getPowerConsumption(), ((CircularSaw) shop[i]).getRadius()));
                        break;
                    case "Drill":
                        System.out.println(String.format("Drill: %s; count: %s; quantity: %s; power consumption: %s; diameter: %s",
                                shop[i].getName(), shop[i].getCount(), shop[i].getQuantity(),
                                ((Drill) shop[i]).getPowerConsumption(), ((Drill) shop[i]).getMaxDiameter()));
                        break;
                    case "Jigsaw":
                        System.out.println(String.format("Jigsaw: %s; count: %s; quantity: %s; power consumption: %s; thickness: %s",
                                shop[i].getName(), shop[i].getCount(), shop[i].getQuantity(),
                                ((Jigsaw) shop[i]).getPowerConsumption(), ((Jigsaw) shop[i]).getThickness()));
                        break;
                    case "Notebook":
                        System.out.println(String.format("Notebook: %s; count: %s; quantity: %s; memory: %s; drive capacity: %s; CPU: %s; diagonal: %s; battery life: %s",
                                shop[i].getName(), shop[i].getCount(), shop[i].getQuantity(),
                                ((Notebook) shop[i]).getMemory(), ((Notebook) shop[i]).getDriveCapacity(),
                                ((Notebook) shop[i]).getCPU(), ((Notebook) shop[i]).getDiagonal(), ((Notebook) shop[i]).getBatteryLife()));
                        break;
                    case "Monoblock":
                        System.out.println(String.format("Monoblock: %s; count: %s; quantity: %s; memory: %s; drive capacity: %s; CPU: %s",
                                shop[i].getName(), shop[i].getCount(), shop[i].getQuantity(),
                                ((Monoblock) shop[i]).getMemory(), ((Monoblock) shop[i]).getDriveCapacity(),
                                ((Monoblock) shop[i]).getCPU()));
                        break;
                }
            } else {
                break;
            }
        }*/

        for (int i = 0; i < shop.length; i++) {
            if(shop[i] != null) {
                System.out.println(shop[i].toString());
            } else {
                break;
            }
        }
        System.out.println();
        getSum(shop);

        System.out.println();
        getTheMostPowerfullElectricInstrument(shop);

        System.out.println();
        getSumOfDriveCapacity(shop);

        System.out.println();
        getReturnableItems(shop);
    }

    public static void getSum(Item[] items) {
        int sum = 0;
        for (int i = 0; i < items.length; i++) {
            if(items[i] != null) {
                sum = sum + items[i].getCount();
            } else {
                break;
            }
        }
        System.out.println("Sum="+sum);
    }

    public static void getTheMostPowerfullElectricInstrument(Item[] items) {
        Item instrument = null;
        int maxPowerConsumption = 0;
        for(Item item: items) {
            if(item instanceof ElectricInstruments) {
                if(((ElectricInstruments) item).getPowerConsumption() > maxPowerConsumption) {
                    maxPowerConsumption = ((ElectricInstruments) item).getPowerConsumption();
                    instrument = item;
                }
            }
        }
        System.out.println(instrument.toString());
    }

    public static void getSumOfDriveCapacity(Item[] items) {
        int driveCapacitySum = 0;
        for(Item item: items) {
            if(item instanceof Computers) {
                driveCapacitySum = driveCapacitySum +((Computers) item).getDriveCapacity();
            }
        }
        System.out.println("Max drive capacity: " + driveCapacitySum);
    }

    public static void getReturnableItems(Item[] items) {
        for(Item item: items) {
            if(item instanceof Returnable) {
                System.out.println(String.format("Item %s can be returned in %d days, %s required", item.getName(),
                        ((Returnable) item).getDaysForReturn(), ((Returnable) item).getRequiredDocuments()));
            }
        }
    }
}
