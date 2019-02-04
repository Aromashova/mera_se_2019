import java.util.Arrays;

public class EnumSamples {

    enum Season {
        WINTER("Зима"),SPRING("Весна"),SUMMER("Лето"),FALL("Осень");
        final String greeting;

        Season(String greeting) {
            this.greeting = greeting;
        }

        public String getGreeting() {
            return greeting;
        }
    }

    public static final class SeasonClass {
        final static SeasonClass WINTER = new SeasonClass();
        final static SeasonClass SPRING = new SeasonClass();
        final static SeasonClass SUMMER = new SeasonClass();
        final static SeasonClass FALL = new SeasonClass();
    }
    // ТАК ДЕЛАТЬ НЕ НАДО
    private static final int WINTER = 0;
    private static final int SUMMER = 1;
    private static final int FALL = 2;
    private static final int SPRING = 3;

    static  void  printName(int season) {
        if (season == WINTER) {

        }
    }

    public static void varargs(int one, long another, String... rest) {
        System.out.println(one + another + Arrays.toString(rest));
    }

    public static void main(String[] args) {
       // printName(42);
        int winter = EnumSamples.WINTER;
      /*  SeasonClass seasonClass = SeasonClass.FALL;
        if (seasonClass == SeasonClass.FALL) {
            System.out.println(seasonClass.getGreeting();
        }*/

     /*   Season s = Season.FALL;
        if ( s == Season.FALL) {
            System.out.println(s.getGreeting());
        }*/


        /*System.out.println(Season.FALL.getGreeting());
        System.out.println(Season.WINTER.getGreeting());*/

       /* if (s.equals(Season.FALL)) {
            System.out.println("Это же осень!");

        }*/

        varargs(42, 42L, "a", "b");
    }
}
