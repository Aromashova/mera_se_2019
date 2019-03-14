package ru.mera.grishina.task9;

import java.lang.reflect.Field;
import ru.mera.grishina.task9.annotations.JsonIgnore;
import ru.mera.grishina.task9.annotations.JsonName;

public class Annot {
    public static final String CONST = "42";
    // "{param1: value1, param2: value}" => <param1>valu1</param1>,<param2>valu1</param>
    public static class Person {
        @JsonName(jsonName = "firstName")
        public String name;

        @JsonName(jsonName = "lastName")
        public String surname;

        @JsonIgnore
        public int hashCode = this.hashCode();

        public Person(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }
    }

    public static class Animal {
        public String nick;

        public Animal() {
        }

        public Animal(String nick) {
            this.nick = nick;
        }

        @Override
        public String toString() {
            return "Animal{" + "nick='" + nick + '\'' + '}';
        }
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Person person = new Person("Vasya", "Pupkin");
        // {name:"Vasya", surname:"Pupkin"}
        Animal a = new Animal("Pushok");
        // {nick:"Pushok"}

        String animal = serializeToJson(a);
        System.out.println(animal);

        Annot de = new Annot();

        Animal deserialize = de.deserialize(animal, Animal.class);
        // System.out.println(deserialize);
        Person vasya = de.deserialize(serializeToJson(person), Person.class);
        System.out.println(vasya);
    }

    private <T> T deserialize(String json, Class<T> clazz) throws IllegalAccessException, InstantiationException {
        Object o = clazz.newInstance();
        String[] split = json.replace("{", "").replace("}", "").split(",");
        for (String s : split) {
            String[] split1 = s.split(":");

            for (Field field : clazz.getDeclaredFields()) {
                if (field.getName().equals(split1[0])) {
                    field.set(o,split1[1]);
                }
            }
        }
        return (T) o;
    }

    private static String serializeToJson(Object o) throws IllegalAccessException {
        String result = "{";

        Class<?> aClass = o.getClass();
        Field[] fields = aClass.getDeclaredFields();
        for (Field field : fields) {
            String fieldName = field.getName();
            JsonIgnore ignore = field.getAnnotation(JsonIgnore.class);
            if (ignore != null) {
                continue;
            }

            JsonName annotation = field.getAnnotation(JsonName.class);
            if (annotation != null) {
                fieldName = annotation.jsonName();
            }
            result += fieldName + ":" + field.get(o) + ",";
        }
        return result + "}";
    }
}
