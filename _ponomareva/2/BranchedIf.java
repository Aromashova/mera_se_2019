public class BranchedIf {
    /**
     * Задача 1. Ветвистый if
     * 1. Заведите две переменные типа int и занесите туда любые значения
     * (особо продвинутые могут считать аргументы запуска типа java Task1 42 34 .
     * Конвертировать строку в число можно с помощью функции Integer.valueOf )
     * 2. Выведите на экран следущее:
     * - Если любое из чисел больше 100 - надпись "Есть  большое число". Само число можно не выводить
     * - Если второе число не ноль - надпись "Результат деления:" + результат деления первого, на второе. Дробная часть не должна быть отброшена.
     * - Если первое больше второго - надпись "$ больше $ " . $ замените на соответствующие числа
     * - Если второе число четное - надпись "число $ - четное".
     */

    public static void main (String[] args){
        int first_parameter = Integer.valueOf(args[0]);
        int second_parameter = Integer.valueOf(args[1]);

        if(first_parameter>100 || second_parameter>100){
            System.out.println("There is a big number");
        }
        if(second_parameter != 0){
            System.out.println("Division result: " + (float)first_parameter/second_parameter);
        }
        if(first_parameter > second_parameter){
            System.out.println(first_parameter + " is bigger than "+second_parameter);
        }
        if((second_parameter%2) == 0){
            System.out.println("The number " + second_parameter + " is even");
        }
    }
}

