package ru.mera.katisheva.task7_2;

class BoxDemo {

    public static void main(String[] args){
        Box<String> str = new Box<>("A");
        String strValue=str.unbox();
        System.out.println(strValue);

        Box<Integer> numb=new Box<>(42);
        Integer intValue=numb.unbox();
        System.out.println(intValue);

        Box<Double> doub=new Box<>(42.33);
        Double doubValue=doub.unbox();
        System.out.println(doubValue);

        Box<Long> longNum=new Box<>(4245L);
        Long longValue=longNum.unbox();
        System.out.println(longValue);
    }
}
