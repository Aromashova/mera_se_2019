package task5;

import java.util.*;

public class OnlineStore {

    ArrayList<AbstractItem> products;
    int productsQuantity;
    CircularSaws[] saws=new CircularSaws[2];
    CandyBars[] candy = new CandyBars[2];
    int totalQuantity;
    long totalSum;
    PowerTool[] powerToolMas;
    int powerToolQuantity;

    OnlineStore(){
        productsQuantity=100;
        ArrayList<AbstractItem> products=new ArrayList<>(productsQuantity);
        CircularSaws[] saws=new CircularSaws[2];
        saws[0]= new CircularSaws(4950, "Интерскол ДП-190", 4, 1600, 190);
        saws[1]= new CircularSaws(3819, "RedVerg RD-CS150-66L", 10, 1500, 190);
        CandyBars[] candy = new CandyBars[2];
        candy[0]=new CandyBars(129000, "Apple IMac",3,8,1,1000);
        candy[1]=new CandyBars(34190, "Acer Aspire",1,4,1,1000);
        for(int i=0; i<productsQuantity; i++) {
            for(int k=0; k<saws.length; k++) {
                for (int j = 0; j < saws[k].getQuantity(); j++) {
                    products.add(i,saws[k]);
                    i++;
                }

            }
            for(int k=0; k<candy.length; k++) {
                for (int j = 0; j < candy[k].getQuantity(); j++) {
                    products.add(i,candy[k]);
                    i++;
                }
            }
            totalQuantity=i;
            break;
        }

        System.out.println("Каталог товаров:");
        for(int i=0;i<totalQuantity;) {

            System.out.println(products.get(i).toString());
            i=i+products.get(i).getQuantity();
        }

    }

    void printTotalQuantity() {
        System.out.println("Общее количество товаров на складе: "+totalQuantity);
        if (totalQuantity == 100) {
            System.out.println("Склад полон!");
        }
    }

    void printTotalSum() throws NullPointerException{

        for(int i=0; i<totalQuantity; i++){
           totalSum=totalSum+(products.get(i)).getCount();
        }
        System.out.println("Общая стоимость всех товаров на складе: "+totalSum);

   }

    public static void main(String[] args){

        OnlineStore store=new OnlineStore();
        store.printTotalQuantity();
        try {
            store.printTotalSum();
        }
        catch(NullPointerException exc){
            System.out.println("Нет товаров в магазине");
        }
       /* AbstractItem[] mas=new AbstractItem[100];
        CircularSaws[] saws=new CircularSaws[2];
        saws[0]= new CircularSaws(4950, "Интерскол ДП-190", 4, 1600, 190);
        saws[1]= new CircularSaws(3819, "RedVerg RD-CS150-66L", 10, 1500, 190);
        CandyBars[] candy = new CandyBars[2];
        candy[0]=new CandyBars(129000, "Apple IMac",3,8,1,1000);
        candy[1]=new CandyBars(34190, "Acer Aspire",1,4,1,1000);
        //Drills[] drills =new Drills[3];
        //drills[0]=new Drills(3218, "BOSCH EasyImpact 500", 3, 550, 25);
        int totalQuantity=0;
        long totalSum=0;
        PowerTool[] powerToolMas;
        int powerToolQuantity=0;
       for(int i=0; i<mas.length; i++) {
           for(int k=0; k<saws.length; k++) {
               for (int j = 0; j < saws[k].getQuantity(); j++) {
                   mas[i] = saws[k];
                   i++;
               }

           }
           for(int k=0; k<candy.length; k++) {
               for (int j = 0; j < candy[k].getQuantity(); j++) {
                   mas[i] = candy[k];
                   i++;
               }
           }
           totalQuantity=i;
           break;
       }

       System.out.println("Каталог товаров:");
       for(int i=0;i<totalQuantity;) {

           System.out.println(mas[i].toString());
           i=i+mas[i].getQuantity();
       }

       System.out.println("Общее количество товаров на складе: "+totalQuantity);
       if (totalQuantity == 100) {
            System.out.println("Склад полон!");
       }
       for(int i=0; i<totalQuantity; i++){
           totalSum+=mas[i].getCount();
       }
       System.out.println("Общая стоимость всех товаров на складе: "+totalSum);

       for(int i=0; i<totalQuantity; i++) {

           if(mas[i] instanceof PowerTool) {
               powerToolQuantity++;
           }
       }
        */
    }
}
