package task7_2;

/**
 * Задание 7.2 Упакуй и распакуй
 * Создать класс Box - контейнер, который может хранить одно значение любого типа.
 * У класса должен быть конструктор с одним параметром - значение, которое мы хотим хранить.
 * У класса должен быть метод  unbox() который возвращает хранимое значение.
 *
 * Класс должен использоваться так.
 *
 * Box str = new Box("A");
 * String value = str.unnbox();
 *
 * Box numb = new Box(42);
 * Integer intValue = numb.unbox();
 */

public class Test {
    public  static void main(String[] args) {
        Box <String> str = new Box<String>("A");
        String value = str.unbox();
        System.out.println(value);

        Box<Integer> numb= new Box<Integer>(42);
        Integer intValue = numb.unbox();
        System.out.println(intValue);
    }
}
