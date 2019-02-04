public class Vetvistyy {
    public static void main (String[] args){
        int param1 = Integer.valueOf(args[0]);
        int param2 = Integer.valueOf(args[1]);

        if(param1>100 || param2>100){
            System.out.println("Есть большое число");
        }
        if(param2 != 0){
            System.out.println("Результат деления: " + (float)param1/param2);
        }
        if(param1 > param2){
            System.out.println(param1 + " Больше "+param2);
        }
        if((param2%2) == 0){
            System.out.println("Число  " + param2 + " четное");
        }
    }
}
