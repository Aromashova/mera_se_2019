package ru.mera.katisheva.task9;

import java.beans.PropertyEditor;
import java.beans.PropertyEditorManager;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Annot{

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        Annot de = new Annot();
        PrivatePerson person1 = new PrivatePerson("Vasiliy", "Smirnov", "01.01.1980");
        PrivateCat cat1 = new PrivateCat("Pushok", 2);
        PrivateFruit fruit1 = new PrivateFruit("Apple", 50, 10);
        PrivateStore store1 = new PrivateStore(fruit1, "12.02.2019");
        PrivateVegetable vegetable1 = new PrivateVegetable(30,"Potato",15, "0-1");

        try {

            String stringPersonAfterSerialize = de.serializeToJson(person1);
            System.out.println("Json: " + stringPersonAfterSerialize);
            PrivatePerson personAfterDeserialize = de.deserialize(stringPersonAfterSerialize, PrivatePerson.class);
            System.out.println("Object: " + personAfterDeserialize);

        }
        catch(CanNotParseObjectToJsonException | InstantiationException | IllegalAccessException | NullPointerException exc){
            System.out.println(exc);
        }

        try {

            String stringCatAfterSerialize = de.serializeToJson(cat1);
            System.out.println("Json: " + stringCatAfterSerialize);
            PrivateCat catAfterDeserialize = de.deserialize(stringCatAfterSerialize, PrivateCat.class);
            System.out.println("Object: " + catAfterDeserialize);
        }
        catch(CanNotParseObjectToJsonException | InstantiationException | IllegalAccessException | NullPointerException exc){
            System.out.println(exc);
        }
        try {
            String stringFruitAfterSerialize = de.serializeToJson(fruit1);
            System.out.println("Json: " + stringFruitAfterSerialize);
            PrivateFruit fruitAfterDeserialize = de.deserialize(stringFruitAfterSerialize, PrivateFruit.class);
            System.out.println("Object: " + fruitAfterDeserialize);
        }
        catch(CanNotParseObjectToJsonException | InstantiationException | IllegalAccessException | NullPointerException exc){
            System.out.println(exc);
        }
        try {
            String stringStoreAfterSerialize = de.serializeToJson(store1);
            System.out.println("Json: " + stringStoreAfterSerialize);
            PrivateStore storeAfterDeserialize = de.deserialize(stringStoreAfterSerialize, PrivateStore.class);
            System.out.println("Object: " + storeAfterDeserialize);
        }
        catch(CanNotParseObjectToJsonException | InstantiationException | IllegalAccessException | NullPointerException exc){
            System.out.println(exc);
        }
        try {
            String stringVegetableAfterSerialize = de.serializeToJson(vegetable1);
            System.out.println("Json: " + stringVegetableAfterSerialize);
            PrivateVegetable vegetableAfterDeserialize = de.deserialize(stringVegetableAfterSerialize, PrivateVegetable.class);
            System.out.println("Object: " + vegetableAfterDeserialize);
        }
        catch(CanNotParseObjectToJsonException | InstantiationException | IllegalAccessException | NullPointerException exc){
            System.out.println(exc);
        }
    }

    private <T> T deserialize(String json, Class<T> clazz) throws NullPointerException, IllegalAccessException, InstantiationException{
        if(json.equals("")){
            System.out.println("I can not create object.");
            return (T)null;
        }
        Object o = clazz.newInstance();
        Constructor<?> con = clazz.getDeclaredConstructors()[0];
        if(con.isAnnotationPresent(ConstAnnot.class)) {

            Class<?>[] paramTypes = con.getParameterTypes();
            String[] split1 = {""};
            String[] split = json.replace("{", "").replace("}", "").split(",");

            for (String s : split) {
                split1 = s.split(":");

                for(Class<?> type : paramTypes) {
                    for (Field field : clazz.getDeclaredFields()) {

                        if (field.getName().equals(split1[0]) && field.getType().equals(type)) {
                            field.setAccessible(true);
                            PropertyEditor editor = PropertyEditorManager.findEditor(type);
                            editor.setAsText(split1[1]);
                            field.set(o, editor.getValue());
                        }
                    }
                }

            }

        }
        return (T)o;

    }

    private String serializeToJson(Object o) throws IllegalAccessException, CanNotParseObjectToJsonException {
        String result = "{";

        Class<?> aClass = o.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (Field field : fields) {
            if(!(String.class.isAssignableFrom(field.getType()) || field.getType().isPrimitive()) || Number.class.isAssignableFrom(field.getType()) ){

                    throw new CanNotParseObjectToJsonException(o);

            }
        }

        for (Field field : fields) {
            field.setAccessible(true);
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
        result = result.substring(0, result.length() - 1);
        result = result + "}";
        return result;
    }

}
