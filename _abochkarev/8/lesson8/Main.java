package lesson8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    static class FruitsWarehouse {

        private List<Fruits> fruits = new ArrayList<>();

        FruitsWarehouse(Fruits... fruits) {
            this.fruits.addAll(Arrays.asList(fruits));
        }

        void loadTruck(ArrayList<Fruits> fruitTruck) {
            for (Fruits item : fruits) {
                for (int i = 0; i < item.getSize(); i++) {
                    if (fruitTruck.size() < 10) {
                        fruitTruck.add(item);
                    } else {
                        break;
                    }
                }
            }
        }
    }

    static class VegetablesWarehouse {

        private List<Vegetables> vegetables = new ArrayList<>();

        VegetablesWarehouse(Vegetables... vegetables) {
            this.vegetables.addAll(Arrays.asList(vegetables));
        }

        void loadTruck(ArrayList<Vegetables> vegetablesTruck) {
            for (Vegetables item : vegetables) {
                for (int i = 0; i < item.getSize(); i++) {
                    if (vegetablesTruck.size() < 10) {
                        vegetablesTruck.add(item);
                    } else {
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Fruits> fruitTruck = new ArrayList<>();
        ArrayList<Vegetables> vegetablesTruck = new ArrayList<>();
        Shop shop = new Shop();

        FruitsWarehouse fruitWarehouse1 = new FruitsWarehouse(new Orange(2), new Apple(3));
        FruitsWarehouse fruitWarehouse2 = new FruitsWarehouse(new Pineapple(4));
        FruitsWarehouse fruitWarehouse3 = new FruitsWarehouse(new Orange(7));

        VegetablesWarehouse vegetablesWarehouse1 = new VegetablesWarehouse(new Cucumber(5));
        VegetablesWarehouse vegetablesWarehouse2 = new VegetablesWarehouse(new Corn(2));

        fruitWarehouse1.loadTruck(fruitTruck);
        fruitWarehouse2.loadTruck(fruitTruck);
        fruitWarehouse3.loadTruck(fruitTruck);

        vegetablesWarehouse1.loadTruck(vegetablesTruck);
        vegetablesWarehouse2.loadTruck(vegetablesTruck);


        System.out.println("Storefront:\n");
        System.out.println("Fruits from fruit truck:");
        shop.printTruck(fruitTruck);

        System.out.println("\nVegetables from vegetable truck:");
        shop.printTruck(vegetablesTruck);
    }
}
