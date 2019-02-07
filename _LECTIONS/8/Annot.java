import java.lang.reflect.Field;

import annotations.JsonName;

public class Annot {
    //   "{param1: value1,param2:value}" => <param1>valu1</param1>,<param2>valu1</param>
    public static class Person {
        @JsonName(jsonName = "firstName")
        public String name;

        @JsonName(jsonName = "lastName")
        public String surname;

        public Person(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }
    }

    public static class Animal {
        public String nick;

        public Animal(String nick) {
            this.nick = nick;
        }
    }

    public static void main(String[] args) throws IllegalAccessException {
        Person person = new Person("Vasya", "Pupkin");
        // {name:"Vasya", surname:"Pupkin"}
        Animal a = new Animal("Pushok");
        // {nick:"Pushok"}

        System.out.println(serializeToJson(person));


    }

    private static String serializeToJson(Object o) throws IllegalAccessException {
        String result = "{";

        Class<?> aClass = o.getClass();
        Field[] fields = aClass.getDeclaredFields();
        for (Field field : fields) {
            String fieldName = field.getName();
            JsonName annotation = field.getAnnotation(JsonName.class);
            if (annotation != null) {
                fieldName = annotation.jsonName();
            }
            result += fieldName + ":" + field.get(o) + ",";
        }

        return result + "}";
    }

}
