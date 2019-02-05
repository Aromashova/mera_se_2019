package voronkova.task1;

/**
 * Домашнее задание по пятой лекции:
 * Задание 1. Продано!
 * Делаем интернет магазин.
 * В интернет магазине может хранится только 100 товаров максимум.
 *
 * Есть товары. У каждого товара есть цена продажи, название, остаток на складе.
 * Некоторые товары можно вернуть после покупки. (интерфейс Returnable).
 * Если товар можно вернуть, то есть список необходимых документов для возврата.
 *
 * Всего есть две  категорий товаров:
 * 1. Электроинструменты. У каждого инструмента есть «потребляемая мощность»
 * - Пилы дисковые. У каждой пилы есть радиус режущего диска. Можно вернуть через 14 дней. Нужен чек и паспорт.
 * - Дрели. У каждой дрели есть максимальный диаметр сверла. Можно вернуть через 7 дней. Нужен только чек.
 * -  Лобзики. У каждого лобзика есть максимальная толщина пропила. Нельзя вернуть.
 *
 * 2. Компьютеры. У каждого компьютера есть количество памяти, места на жестком диске и ядер CPU.
 * - Ноутбук. Есть диагональ экрана и время работы без подзарядки. Можно вернуть через 14 дней. Нужен чек и паспорт.
 * - Моноблок. Без дополнительных свойств.
 *
 * Создайте как минимум по два товара из каждой категории. (пила, дрель, лобзик, ноутбук, моноблок)
 * Выведите все товары  в формате.
 * Название Цена Количество + доп параметры для каждого конкретного товара. Например
 * Пила Bosch 6000 1шт радиус диска 120мм
 * Пила Зубр 3000 2шт радиус диска 220мм
 * …
 * Выведите сумму, которую заработает магазин, продав все  товары.
 * Для всех электроинструментов выведите предмет с наибольшей мощностью.
 * Выведите сумму места на жестком диске для всех компьютеров.
 * Выведите все товары, которые можно вернуть. Укажите, в течение скольких дней и какие документы для этого нужны.
 *
 * Рекомендации для выполнения:
 * 1. Создайте интерфейс Item с методами getCount(), getName(), getQuantity()
 * 2. Создайте интерфейс Returnable с методами getRequiredDocuments() , getDaysForReturn
 * 3. Создайте абстрактный класс AbstractItem , реализующий интерфейс Item с полями count,name, quantity.
 * 4. Создайте абстрактные классы для Электроинсутрментов и компьютеров, наследующих AbstractItem
 * 5. Создайте конкретные классы для каждого товара. Где требуется  - реализуйте интерфейс Returnable
 * 6. Создайте массив на 100 элементов – это и есть ваш магазин.
 */

public class OnlineShop {
    public static void main(String[] args) {
    Item[] onlineShop = new Item[100];
    onlineShop[0]=new CircularSaws("CircularSaw1", 4589.98,6,450,45);
    onlineShop[1]=new CircularSaws("CircularSaw2", 3500.03,0,1200,75);

    onlineShop[2]=new Drills("Drill1",2145.00,3,543,80);
    onlineShop[3]=new Drills("Drill2",666.66,10,350,20);

    onlineShop[4]=new ElectricJigsaws("Jigsaw1",3980.23,1,988,40);
    onlineShop[5]=new ElectricJigsaws("Jigsaw2",6500.00,7,1000,60);

    onlineShop[6]=new Laptops("Lenovo",15000.99,2,250,4,2, 12.5,6);
    onlineShop[7]=new Laptops("Xiaomi",35999.99,5,250,4,2, 12.5,12);

    onlineShop[8]=new AllInOnePCs("Apple",70000.00,4,500,8,4);
    onlineShop[9]=new AllInOnePCs("Xiaomi",50000.00,0,500,8,4);

    getSumOfAllSales(onlineShop);
    getMostWattageElectricPowerTool(onlineShop);
    getSumOfAllComputersMemory(onlineShop);
    getReturnableItems(onlineShop);
    }

    public static void getSumOfAllSales(Item [] items){
        double sum = 0;
        for (int i=0;i<items.length;i++) {
            if(items[i]!=null){
            sum = sum + items[i].getCount();}
            else{
                break;
            }
        }
        System.out.println(String.format("Sum is %.2f RUB",sum));
    }
    public static void getMostWattageElectricPowerTool(Item [] items){
        int maxWattage=0;
        String ElectricPowerTool=null;
        for (Item item: items){
            if (item instanceof ElectricPowerTools){
                if(((ElectricPowerTools)item).getWattage()>maxWattage){
                    maxWattage=((ElectricPowerTools)item).getWattage();
                    ElectricPowerTool=item.toString();
                }
            }
        }
        System.out.println("This item has maximum wattage: " + ElectricPowerTool);
    }
    public static void getSumOfAllComputersMemory(Item [] items){
        int memorySum = 0;
        for (Item item:items) {
            if(item instanceof Computers){
                memorySum = memorySum + ((Computers)item).getMemory();
            }
        }
        System.out.println(String.format("Full memory of all computers is %s",memorySum));

    }

    public  static void getReturnableItems (Item [] items){
        for (Item item:items){
            if (item instanceof Returnable){
                System.out.println(String.format("%s can be return in %s days. To return the item %s must be presented",
                        item.getName(),((Returnable)item).getDaysForReturn(),((Returnable)item).getRequiredDocuments(),item.getName()));
            }
        }

    }
}
