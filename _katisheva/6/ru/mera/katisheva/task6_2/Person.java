package ru.mera.katisheva.task6_2;

class Person {
    private String name;
    private States state;
    Person(String nameValue){
        name=nameValue;
        state=States.GONE_HOME;
    }

    public String getName() {
        return name;
    }

    public States getState() {
        return state;
    }

    public void setState(States state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return name + " - " + state;
    }
}
