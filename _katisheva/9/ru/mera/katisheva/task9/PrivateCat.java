package ru.mera.katisheva.task9;

public class PrivateCat {
    @JsonName(jsonName = "name")
    private String name;
    @JsonName(jsonName = "age")
    private int age;


    @ConstAnnot(constAnnot = PrivateCat.class)
    PrivateCat(String name, int age){
        this.name=name;
        this.age=age;
    }

    PrivateCat(){
        this.name="unknown";
        this.age=0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "PrivateCat{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
