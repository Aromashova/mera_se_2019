package ru.mera.katisheva.task6_2;

import java.util.*;


public class Play {
    private ArrayList<Person> command;
    private States[] statesMas = States.values();
    private int numberOfPeople;
    private ArrayList<Person> winners;
    private ArrayList<Person> losers;
    private ArrayList<Person> outOfPlay;
    private ArrayList<Person> inPlay;

    Play(){
        numberOfPeople=10;
        command = new ArrayList<>(numberOfPeople);
        command.add(0,new Person("Маша"));
        command.add(1,new Person("Вася"));
        command.add(2,new Person("Миша"));
        command.add(3,new Person("Лена"));
        command.add(4,new Person("Таня"));
        command.add(5,new Person("Саша"));
        command.add(6,new Person("Леша"));
        command.add(7,new Person("Катя"));
        command.add(8,new Person("Дима"));
        command.add(9,new Person("Оля"));
        winners = new ArrayList<>();
        losers = new ArrayList<>();
        outOfPlay = new ArrayList<>();
        inPlay = new ArrayList<>();

    }

    void printCommand(){

        System.out.println("\nКоманда: ");
        System.out.println(Arrays.toString(command.toArray()));
    }

    void setStatesOfPlayers(){

        long millis = System.currentTimeMillis() % 1000;
        Random rand=new Random(millis);
        int randState = 0;
        for(int i=0; i<numberOfPeople;i++) {
            randState = rand.nextInt(3);
            command.get(i).setState(statesMas[randState]);
        }
    }

    void leadingSaysNotHiding(){

        long millis = System.currentTimeMillis() % 1000;
        Random rand=new Random(millis);
        int randValue = 0;
        for(int i=0; i<numberOfPeople;i++) {
            randValue = rand.nextInt(2);
            if(randValue==1){

                if (((command.get(i).getState()).toString()).compareTo("NOT_HIDDEN") == 0) {
                    outOfPlay.add(command.get(i));
                    System.out.println(command.get(i)+" - Не прячешься! Вне игры. ");
                }
                else if (((command.get(i).getState()).toString()).compareTo("HIDDEN") == 0) {
                    inPlay.add(command.get(i));
                    System.out.println(command.get(i)+" - Продолжает играть");
                }
                else {
                    inPlay.add(command.get(i));
                    System.out.println(command.get(i)+" - Продолжает играть");
                }

            }
            else {
                inPlay.add(command.get(i));
                System.out.println(command.get(i)+" - Продолжает играть");
            }
        }
    }

    void leadingSearches() throws MiJeDogovarivalisDomaNePryatatsaException{

        System.out.println("\nВедущий идет искать игроков:");
        for(int i=0; i<inPlay.size();i++) {

                if (((inPlay.get(i).getState()).toString()).compareTo("NOT_HIDDEN") == 0) {
                    winners.add(inPlay.get(i));
                    System.out.println(inPlay.get(i)+" - победитель");
                }
                if (((inPlay.get(i).getState()).toString()).compareTo("HIDDEN") == 0) {
                    losers.add(inPlay.get(i));
                    System.out.println(inPlay.get(i)+" - проигравший");
                }
                if (((inPlay.get(i).getState()).toString()).compareTo("GONE_HOME") == 0) {

                    System.out.println(inPlay.get(i)+" - ушел домой");
                    throw new MiJeDogovarivalisDomaNePryatatsaException(inPlay.get(i));
                }

        }
        System.out.println("\nПобедители игры: ");
        System.out.println(Arrays.toString(winners.toArray()));
        System.out.println("\nПроигравшие: ");
        System.out.println(Arrays.toString(losers.toArray()));
    }
    public static void main(String[] args){

        Play play1 = new Play();
        play1.setStatesOfPlayers();
        play1.printCommand();
        play1.leadingSaysNotHiding();
        //System.out.println(Arrays.toString(play1.inPlay.toArray()));
        try {
            play1.leadingSearches();
        }
        catch(MiJeDogovarivalisDomaNePryatatsaException exc){
            System.out.println(exc);
        }


    }
}
