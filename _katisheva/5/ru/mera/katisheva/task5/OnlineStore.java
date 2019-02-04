package ru.mera.katisheva.task5;

import java.util.*;

public class OnlineStore {

    private ArrayList<AbstractItem> catalog;
    private int productsQuantity;
    private int storeCapacity;
    private CircularSaws[] saws;
    private CandyBars[] candy;
    private Drills[] drills;
    private Laptops[] laptops;
    private Jigsaws[] jsaws;
    private int numberOfItems;
    private long totalSum;

    OnlineStore(){
        storeCapacity=100;
        catalog=new ArrayList<>();
        saws=new CircularSaws[2];
        saws[0]= new CircularSaws(4950, "Интерскол ДП-190", 4, 1600, 190);
        saws[1]= new CircularSaws(3819, "RedVerg RD-CS150-66L", 10, 1500, 190);
        candy = new CandyBars[2];
        candy[0]=new CandyBars(129000, "Apple IMac",3,8192,1,1000);
        candy[1]=new CandyBars(34190, "Acer Aspire",1,4096,1,1000);
        drills =new Drills[3];
        drills[0]=new Drills(3218, "BOSCH EasyImpact 500", 3, 1600, 25);
        drills[1]=new Drills(2140, "Зубр ЗДУ-580 ЭРМ2", 2, 810, 20);
        drills[2]=new Drills(3218, "BORT BSM-650U", 2, 650, 20);
        laptops =new Laptops[2];
        laptops[0]=new Laptops(38090, "Acer", 2, 8192, 2,1000,15.6, 48);
        laptops[1]=new Laptops(22470, "Lenovo", 4, 4096, 2, 500,15.6,30);
        jsaws=new Jigsaws[3];
        jsaws[0]= new Jigsaws(1320, "BORT", 2, 350, 55);
        jsaws[1]= new Jigsaws(1670, "ЗУБР", 10, 400, 55);
        jsaws[2]= new Jigsaws(3819, "BOSCH", 3, 500, 65);

        for(int i=0; i<storeCapacity; ){
            for(int k=0; k<saws.length; k++) {
                    catalog.add(i,saws[k]);
                    i++;
            }
            for(int k=0; k<candy.length; k++) {
                catalog.add(i,candy[k]);
                i++;
            }
            for(int k=0; k<drills.length; k++) {
                catalog.add(i,drills[k]);
                i++;
            }
            for(int k=0; k<laptops.length; k++) {
                catalog.add(i,laptops[k]);
                i++;
            }
            for(int k=0; k<jsaws.length; k++) {
                catalog.add(i,jsaws[k]);
                i++;
            }
            numberOfItems=i;
            break;
        }

        System.out.println("Каталог товаров:");
        for(int i=0;i<numberOfItems;i++) {

            System.out.println(catalog.get(i).toString());
            productsQuantity+=catalog.get(i).getQuantity();
        }

    }


    public int getProductsQuantity() {
        return productsQuantity;
    }

    public CircularSaws[] getSaws() {
        return saws;
    }

    public CandyBars[] getCandy() {
        return candy;
    }

       public long getTotalSum() {
        return totalSum;
    }

    public Drills[] getDrills() {
        return drills;
    }

    public Laptops[] getLaptops() {
        return laptops;
    }

    public ArrayList<AbstractItem> getCatalog() {
        return catalog;
    }

    public int getStoreCapacity() {
        return storeCapacity;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public Jigsaws[] getJsaws() {
        return jsaws;
    }

    void printTotalQuantity() {
        System.out.println("\nОбщее количество товаров на складе: "+productsQuantity);
        if (productsQuantity == storeCapacity) {
            System.out.println("Склад полон!");
        }
    }

    void printTotalSum() {

        for(int i=0; i<numberOfItems; i++){
           totalSum=totalSum+((catalog.get(i)).getCount())*(catalog.get(i).getQuantity());
        }
        System.out.println("\nОбщая стоимость всех товаров на складе: "+totalSum +"руб.");

   }


   void printTheMostPowerfulTool(){
       int powerToolQuantity=0;
       ArrayList<PowerTool> mostPowerfulTool=new ArrayList<>();
       ArrayList<PowerTool> powerToolMas=new ArrayList<>();
       int numberMostPowerfulTools=0;

       for(int i=0; i<numberOfItems; i++) {

           if(catalog.get(i) instanceof PowerTool) {

               powerToolMas.add(powerToolQuantity,(PowerTool) catalog.get(i));
               powerToolQuantity++;
           }

       }
       System.out.println("\nСамые мощные электроинструменты: ");
       if(powerToolQuantity==0){
           System.out.println("Нет электроинструментов в магазине.");
       }
       else{
           mostPowerfulTool.add(0,powerToolMas.get(0));
           numberMostPowerfulTools++;
           for(int i=1,j=0; i<powerToolQuantity;i++) {
               //System.out.println(powerToolMas.get(i));
               if(powerToolMas.get(i).getPower()>=mostPowerfulTool.get(j).getPower()) {
                   mostPowerfulTool.add(j,powerToolMas.get(i));
                   numberMostPowerfulTools++;
               }
           }

           for(int i=0; i<numberMostPowerfulTools; i++){
               System.out.println(mostPowerfulTool.get(i).getName()+", мощность "+mostPowerfulTool.get(i).getPower()+"Вт");
           }
       }

   }

   void printTotalHardDiskMemory(){

       double totalHardDiskMemory=0;

       for(int i=0; i<numberOfItems; i++) {

           if(catalog.get(i) instanceof Computers) {

               totalHardDiskMemory=totalHardDiskMemory+(((Computers) catalog.get(i)).getHardDiskMemory())*(((Computers) catalog.get(i)).getQuantity());

           }

       }
       System.out.println("\nСумма места на жестком диске для всех компьютеров: "+totalHardDiskMemory +"ГБ");
   }

   void printReturnableProducts(){
       int returnProdQuantity=0;
       //ArrayList<AbstractItem> returnProdMas=new ArrayList<>();

       System.out.println("\nТовары, которые можно вернуть: ");
       for(int i=0; i<numberOfItems; i++) {

           if(catalog.get(i) instanceof Returnable) {

               System.out.println(catalog.get(i).getName()+", можно вернуть в течение "+((Returnable)catalog.get(i)).getDaysForReturn()+ "дней, документы для возврата: " +((Returnable)catalog.get(i)).getRequiredDocuments());
               returnProdQuantity++;
           }
           else if(i!=0 && returnProdQuantity==0){
               System.out.println("В магазине нет товаров, которые можно вернуть.");
           }

       }

   }

   public static void main(String[] args){

        OnlineStore store=new OnlineStore();
        store.printTotalQuantity();
        store.printTotalSum();
        store.printTotalHardDiskMemory();
        store.printReturnableProducts();
        store.printTheMostPowerfulTool();

    }
}
