package ru.mera.katisheva.task7_1;

class ReturnMiddleItem {
    static <T> void returnMiddleItem(T ... value){

        System.out.println("Средний аргумент: " + value[value.length/2]);

    }
    public static void main(String[] args){
        ReturnMiddleItem.returnMiddleItem("aaaaa","sss","ddd");
        ReturnMiddleItem.returnMiddleItem("zxzxz",22,"ddd",121,888,444);
        ReturnMiddleItem.returnMiddleItem(1.1111,33L,4555L,"asasa");
        ReturnMiddleItem.returnMiddleItem(new Person("Маша"),new Person("Вася"),33);

    }
}
