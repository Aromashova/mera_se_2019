package ru.mera.grishina.task5;

public class Estore {
    public static void main(String[] args) {
        Item[] store = new Item[100];
        store[0] = new CircularSaws(6000, "Bosch", 1, 220, 120);
        store[1] = new CircularSaws(3000, "Зубр", 2, 240, 220);
        store[2] = new Drills(1900, "Вихрь", 8, 200, 100);
        store[3] = new Drills(4000, "Makita", 10, 180, 200);
        store[4] = new Fretsaws(3000, "Hitachi", 5, 220, 30);
        store[5] = new Fretsaws(1500, "Kolner", 1, 220, 40);
        store[6] = new Laptops(120000, "Apple", 5, 8, 1, 86, 21, 10);
        store[7] = new Laptops(26000, "Sony Vaio", 3, 4, 1, 64, 19, 8);
        store[8] = new Monoblocks(33000, "Apple", 4,8, 4, 64);
        store[9] = new Monoblocks(120000, "HP", 7,4, 2, 32);

        for (int i = 0; i < store.length; i++) {
            if(store[i] != null) {
                System.out.println(store[i].toString());
            } else {
                break;
            }
        }
        // The amount the store earns by selling all the goods
        getCash(store);
        // The subject with the greatest power among all power tools
        getMostPowerfull(store);
        // The amount of HDD space for all computers
        getCommonHddSpace(store);
        // All goods that can be returned indicating how many days and which documents are needed for this
        getReturnable(store);
    }

    public static void getCash(Item[] goods) {
        int cash = 0;
        for (int i = 0; i < goods.length; i++) {
            if(goods[i] != null) {
                cash = cash + goods[i].getCount();
            }
        }
        System.out.println("The amount the store earns by selling all the goods is: " + cash + "\n");
    }

    public static void getMostPowerfull(Item[] goods) {
        Item tool = null;
        int max = 0;
        for(Item item: goods) {
            if(item instanceof PowerTool) {
                if(((PowerTool) item).getPower() > max) {
                    max = ((PowerTool) item).getPower();
                    tool = item;
                }
            }
        }
        System.out.println("The most powerful power tool is: " + tool.toString());
    }

    public static void getCommonHddSpace(Item[] goods) {
        int common_space = 0;
        for(Item item: goods) {
            if(item instanceof Computers) {
                common_space = common_space +((Computers)item).getHddSpace();
            }
        }
        System.out.println("The amount of HDD space for all computers is: " + common_space + "\n");
    }

    public static void getReturnable(Item[] goods) {
        for(Item item: goods) {
            if(item instanceof Returnable) {
                System.out.println(String.format("You can return %s During %s days. %s\n", item.getName(), ((Returnable) item).getDaysForReturn(), ((Returnable) item).getRequiredDocuments()));
            }
        }
    }
}
