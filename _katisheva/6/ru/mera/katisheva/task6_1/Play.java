package ru.mera.katisheva.task6_1;

import java.util.*;


public class Play {
    private ArrayList<Person> command;
    private Season[] seasons = Season.values();
    private int numberOfPeople;
    Play(){
        numberOfPeople=4;
        command = new ArrayList<>(numberOfPeople);
        command.add(0,new Person("Маша",Games.PUDDLES));
        command.add(1,new Person("Вася",Games.SHIPS));
        command.add(2,new Person("Миша",Games.SNOWBALLS));
        command.add(3,new Person("Лена",Games.SUNLIGHTS));

    }

    void printCommand(){

        System.out.println("Команда: ");
        for(int i=0; i<numberOfPeople; i++){
            System.out.println(command.get(i));
        }
    }
    public static void main(String[] args){

        Play play1 = new Play();
        //play1.printCommand();
        long millis = System.currentTimeMillis() % 1000;
        Random rand=new Random(millis);
        int randSeason=rand.nextInt(4);
        int randPerson=rand.nextInt(4);
        System.out.println("\nСезон: "+play1.seasons[randSeason] +" - "+play1.seasons[randSeason].getGame());
        System.out.println("Игрок: "+play1.command.get(randPerson));
        if(((play1.seasons[randSeason].getGame()).toString()).compareTo((play1.command.get(randPerson)).getGame().toString())==0){
            System.out.println("Выиграл!");
        }
        else System.out.println("Проиграл:(");
    }
}
