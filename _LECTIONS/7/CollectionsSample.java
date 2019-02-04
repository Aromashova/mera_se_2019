import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import lection7.Animal;
import lection7.MyList;
import lection7.Person;

public class CollectionsSample {
    List lists = new ArrayList();
    Set sets = new HashSet();
    Queue queue = new LinkedList();
    Map maps = new HashMap();

    public static void main(String[] args) {
        CollectionsSample s = new CollectionsSample();

      /*  s.lists.add("123");
        s.lists.add("123");
        System.out.println(s.lists);


        s.sets.add("123");
        s.sets.add("123");
        System.out.println(s.sets);

        s.maps.put("Андрей","Тарасов");
        s.maps.put("Андрей","ТарасоВ");
        s.maps.put("Вася","Петечкин");

        System.out.println(s.maps.get("Андрей"));

        System.out.println(s.maps.keySet());
        System.out.println(s.maps.values());*/

/*
        s1.add("1");
        s1.add("3");
        s1.add("2");
        s1.add("4");
        s1.add("5");
        s1.add("6");*/
        //System.out.println(s1);


        // не работающий хэш код


        HashSet s1 = new HashSet();

        Person vasya = new Person("Вася");
        //vasya hash =  1
        s1.add(vasya);
        // добавляем  Васю в корзину
        vasya.name = "Василий";
        // hash = 2
        //System.out.println(s1.contains(vasya));

      //  collectionTypes();
        generics();

    }

    private static void generics() {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> intList = new ArrayList<>();
        list.add("сорок два");
        String s = list.get(0);

        MyList<String> myList = new MyList<>();
        myList.addObject("Строка");

        MyList<Integer> myListOfInts = new MyList<>();
        myListOfInts.addObject(42);

        Integer x = myListOfInts.get(0);
        System.out.println(x);
    }

    public static class AnimalComparator  implements Comparator {

        @Override
        public int compare(Object o1, Object o2) {
            if (o1 instanceof Animal && o2 instanceof Animal) {
                return ((Animal) o1).getName().compareTo(((Animal) o2).getName());
            }
            return 0;
        }
    }

    private static void collectionTypes() {
        List lists = new ArrayList();
        Set sets = new HashSet();
        Queue queue = new LinkedList();
        Map maps = new HashMap();

        LinkedList l = new LinkedList();

        Set treeSet = new TreeSet((o1, o2) -> {
            System.out.println("Лямбда выражение");
            return ((Animal) o1).getName().compareTo(o2.toString());
        });
     /*   treeSet.add(new Person("Вася"));
        treeSet.add(new Person("Андрей"));
        treeSet.add(new Person("Борис"));*/


        treeSet.add(new Animal("Лисенок"));

        treeSet.add(new Animal("Волчок"));
        Object next = treeSet.iterator().next();
        System.out.println(next);

        //  System.out.println(treeSet);

        HashMap map2 = new HashMap();
        map2.put(123, "Один два три");
        map2.put(42, "сорок два");

        System.out.println(map2);

        TreeMap map3 = new TreeMap();
        map3.put(123, "Один два три");
        map3.put(42, "сорок два");



        System.out.println(map3);





    }
}
