package task7_1;

/**
 * Задание 7.1 Обощение посредине .
 *
 * Создать метод, который на вход принимает  любое количество аргументов одного класса,
 * а на возвращает элемент, который был в середине переданного списка.
 * Если в списке было четное количество аргументов -
 * можно вернуть любой из "средних". т.е. {a,c,e} нужно вернуть c, {a,b,d,e} подойдут b или d.
 */

public class Test {

    public  static void main(String[] args) {
        MiddleElement<String> middleElement = new MiddleElement<>();
        middleElement.middleElement("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday","Sunday");
        MiddleElement<Integer> middleElement1 =new MiddleElement<>();
        middleElement1.middleElement();
        middleElement1.middleElement(11,12,13,14);

    }
}
