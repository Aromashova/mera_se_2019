package ru.mera.katisheva.task7_2;

class Box<T> {
    private T something;
      Box(T somethingValue){
        something=somethingValue;
    }


     T unbox(){
        return something;
    }

    @Override
    public String toString() {
        return something.toString();
    }
}
