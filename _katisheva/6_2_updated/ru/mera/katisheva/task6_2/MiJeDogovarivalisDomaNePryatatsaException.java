package ru.mera.katisheva.task6_2;

public class MiJeDogovarivalisDomaNePryatatsaException extends Exception {
    Person dishonestPerson;

    MiJeDogovarivalisDomaNePryatatsaException(Person dishonestPersonValue){
        dishonestPerson=dishonestPersonValue;
    }

    @Override
    public String toString() {
        return "\n"+dishonestPerson.getName()+" - играет нечестно! Игра остановлена.";
    }
}
