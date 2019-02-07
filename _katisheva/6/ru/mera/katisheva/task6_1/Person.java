package ru.mera.katisheva.task6_1;

class Person {
    private String name;
    private Games canPlay;
    Person(String nameValue, Games gameValue){
        name=nameValue;
        canPlay=gameValue;
    }

    public String getName() {
        return name;
    }

    public Games getGame() {
        return canPlay;
    }

    @Override
    public String toString() {
        return name + " умеет играть в " + canPlay;
    }
}
