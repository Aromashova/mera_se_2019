package ru.mera.chumakova.task7.subtask1;

public class Generalizing<T> {

    public static void main(String[] args) {
        Generalizing generalizing = new Generalizing();

        System.out.println(generalizing.generalizeArguments(new String[] {"a","b","c"}));
        System.out.println(generalizing.generalizeArguments(new Integer[] {1,2,3,4}));
        System.out.println(generalizing.generalizeArguments());

        Argument arg1 = new Argument("arg1");
        Argument arg2 = new Argument("arg2");

        System.out.println(generalizing.generalizeArguments(new Argument[] {arg1, arg2}).toString());
    }

    public T generalizeArguments(T ... args) {
        if(args.length == 0) {
            return null;
        } else {
            return args[args.length / 2];
        }
    }

}
