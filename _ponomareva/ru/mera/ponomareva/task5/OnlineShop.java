package ru.mera.ponomareva.task5;

public class OnlineShop {

    public static void main(String[] args) {

        /*1.	Создайте как минимум по два товара из каждой категории. (пила, дрель, лобзик, ноутбук, моноблок)
2.	Выведите все товары  в формате.
Название Цена Количество + доп параметры для каждого конкретного товара. Например
Пила Bosch 6000 1шт радиус диска 120мм
Пила Зубр 3000 2шт радиус диска 220мм
…
3.	Выведите сумму, которую заработает магазин, продав все  товары.
4.	Для всех электроинструментов выведите предмет с наибольшей мощностью.
5.	Выведите сумму места на жестком диске для всех компьютеров.
6.	Выведите все товары, которые можно вернуть. Укажите, в течение скольких дней и какие документы для этого нужны.
*/
        AbstractItem[] items = new AbstractItem[100];

        items[0] = new CircularSaw(8000, "Bosch", 10, 1200, 85 );
        items[1] = new CircularSaw(9000, "Makita", 15, 1300, 60);

        items[2] = new Drill(12000, "Bosch", 7, 800, 30 );
        items[3] = new Drill(15000, "Ryobi", 5, 1000, 40 );

        items[4] = new Jigsaw(3500, "Bosch", 13, 500, 20);
        items[5] = new Jigsaw(9800, "AEG", 4, 600, 40);

        items[6] = new Monoblock(45000, "HP", 8, 4, 1000, 2);
        items[7] = new Monoblock(49000, "ASUS", 4, 4, 1000, 4);

        items[8] = new Notebook(53000, "ASER", 6, 8, 1000, 4, 15, 7);
        items[9] = new Notebook(260000, "DELL", 2, 32, 512, 6, 17, 8);

        for (int i = 0; i < items.length; i++) {
            if (items[i] != null)
                System.out.println(items[i].toString()+"\n");
            else
                break;

        }

        System.out.println("*******************************************************************************************");
        System.out.println("The sum of all goods in stock: " + getSum(items));
        System.out.println(getMaxPower(items));
        System.out.println("The hard disk capacity sum of all computers: "  + getSumOfHardDiskCapacity(items) + "\n");
        getReturnableItems(items);


    }

    public static int getSum(AbstractItem[] abstractItems){
        int sum = 0;
        for (int i = 0; i < abstractItems.length ; i++) {
            if (abstractItems[i] != null)
                sum = sum + abstractItems[i].getCount()*abstractItems[i].getQuantity();
            else
                break;
        }
        return sum;
    }

    public static String getMaxPower(AbstractItem[] abstractItems){
        int power = 0;
        String instrumentName = null;
        for (int i = 0; i < abstractItems.length; i++) {
            if (abstractItems[i] != null&& abstractItems[i] instanceof ElectricInstrument)
                if(power < ((ElectricInstrument)abstractItems[i]).getPowerConsumption()){
                    power = ((ElectricInstrument)abstractItems[i]).getPowerConsumption();
                    instrumentName = abstractItems[i].getName();
                }

        }
        return instrumentName + " has max power consumption : " + power + "W";
    }

    public static int getSumOfHardDiskCapacity(AbstractItem[] abstractItems){
        int sum = 0;
        for (int i = 0; i <abstractItems.length ; i++) {
            if (abstractItems[i] instanceof Computers)
                sum = sum + ((Computers)abstractItems[i]).getHardDiskCapacity()*abstractItems[i].getQuantity();
            else
                continue;
        }
        return sum;
    }

    public static void getReturnableItems(AbstractItem[] abstractItems){
        for (int i = 0; i < abstractItems.length; i++) {
            if (abstractItems[i] instanceof Returnable)
                System.out.println(abstractItems[i].getClass().getSimpleName()+ " " + abstractItems[i].getName() + " can be returned in " +
                        ((Returnable)abstractItems[i]).getDaysForReturn() + " days. " + ((Returnable)abstractItems[i]).getRequiredDocuments());


        }
    }


}
