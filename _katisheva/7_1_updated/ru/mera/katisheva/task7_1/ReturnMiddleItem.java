package ru.mera.katisheva.task7_1;

class ReturnMiddleItem {
    static <T> T returnMiddleItem(T ... value){

        return value[value.length/2];
        //System.out.println("Средний аргумент: " + value[value.length/2]);

    }
    public static void main(String[] args){
        System.out.println("Средний аргумент: " + ReturnMiddleItem.returnMiddleItem("aaaaa","sss","ddd"));
        System.out.println("Средний аргумент: " + ReturnMiddleItem.returnMiddleItem("zxzxz",22,"ddd",121,888,444));
        System.out.println("Средний аргумент: " + ReturnMiddleItem.returnMiddleItem(1.1111,33L,4555L,"asasa"));
        System.out.println("Средний аргумент: " + ReturnMiddleItem.returnMiddleItem(new Person("Маша"),new Person("Вася"),33));

    }
}
