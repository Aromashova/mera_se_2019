import java.io.IOException;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) throws IOException {
       // int read = System.in.read();
   //    System.out.println("Пользователь ввел символ с номером " + read);


        System.out.println("Введи имя и возраст:\n");
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        int age = sc.nextInt();
        System.out.println(String.format("Ты %s твой возраст %s", next, age));
    }
}
