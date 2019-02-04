public class Exception {

    public static void main(String[] args) {
   /*     int a = 42;
        int b = 0;
        int div = div(a, b);
        System.out.println("Результат");
        System.out.println(div);*/

      /*  String a = null;
        String b = "";
        try {
            System.out.println("Длина строки " + a.length() + b.length());
        } catch (java.lang.ArithmeticException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println("NpE" + e);
        } catch (java.lang.Exception e) {
            System.out.println(e);
        }
        System.out.println("Конец");*/

        int a = 42;
        int b = 0;
        int div;
        try {
            div = div(a, b);
        } catch (ArithmeticException e) {
            b = 1;
            div = div(a, b);
        }
      /*  System.out.println("Результат");
        System.out.println(div);*/

       /* int improved = divImproved(42, 0);
        System.out.println("Без обработки " + improved); */

       try {
           int improved = divImproved(42, null);
           System.out.println("Без обработки " + improved);
       } catch (NullPointerException e) {
           System.out.println("Случилось исключение, но результат " + 42);

       }

    }


    public static int div( int one, int anoter) {
        return one / anoter;
    }

    public static int safeDiv( int one, int anoter) {
        if (anoter == 0) {
            return one;
        }

        return one / anoter;
    }


    public static int divImproved( Integer one, Integer anoter) {
        try {
            return one / anoter;
        } catch (ArithmeticException e) {
            return one;
        }
    }
}
