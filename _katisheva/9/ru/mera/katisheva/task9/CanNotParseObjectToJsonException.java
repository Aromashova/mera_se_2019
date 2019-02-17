package ru.mera.katisheva.task9;

public class CanNotParseObjectToJsonException extends Exception{
    Object o;

    CanNotParseObjectToJsonException(Object o){
        this.o = o;
    }

    @Override
    public String toString() {
        return "I can not parse object "+o+" to Json.";
    }
}
