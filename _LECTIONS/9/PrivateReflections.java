import java.lang.reflect.Field;

public class PrivateReflections {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        PrivatePerson vasya = new PrivatePerson("Vasya");
        Class<? extends PrivatePerson> aClass = vasya.getClass();
        Field names = aClass.getDeclaredField("name");

        names.setAccessible(true);
        names.set(vasya,"Petya");

        Field names2 = aClass.getDeclaredField("name");

        names2.get(vasya);
        System.out.println(names.get(vasya));
        System.out.println(vasya.getName());
    }
}
