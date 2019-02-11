package ru.mera.katisheva.task6_2;

import java.util.*;


public class Play {
    private ArrayList<Person> command;
    private States[] statesMas = States.values();
    private LeadingCheck[] actionsMas = LeadingCheck.values();
    private int numberOfPeople;
    private ArrayList<Person> winners;
    private ArrayList<Person> losers;


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

    }

    void setStatesOfPlayers(){

        long millis = System.currentTimeMillis() % 1000;
        Random rand=new Random(millis);
        int randState = 0;
        for(int i=0; i<numberOfPeople;i++) {

            randState = (rand.nextInt(3)+rand.nextInt(3)+rand.nextInt(3))/3;
            command.get(i).setState(statesMas[randState]);
        }
    }

    void defineWinnersAndLosers() throws MiJeDogovarivalisDomaNePryatatsaException{

        long millis = System.currentTimeMillis() % 1000;
        Random rand=new Random(millis);
        int randAction = 0;
        for(int i=0; i<numberOfPeople;i++) {
            randAction = rand.nextInt(2);
            if(actionsMas[randAction].toString().compareTo("NOT_HIDE")==0){

                    if (((command.get(i).getState()).toString()).compareTo("NOT_HIDDEN") == 0) {
                        losers.add(command.get(i));
                        //System.out.println(command.get(i)+" - проиграл ");
                    }
                    else if (((command.get(i).getState()).toString()).compareTo("HIDDEN") == 0) {
                        winners.add(command.get(i));
                        //System.out.println(command.get(i)+" - выиграл ");
                    }
                    else if(((command.get(i).getState()).toString()).compareTo("GONE_HOME") == 0){
                        throw new MiJeDogovarivalisDomaNePryatatsaException(command.get(i));
                    }

            }
            else if(actionsMas[randAction].toString().compareTo("HIDE")==0){

                if (((command.get(i).getState()).toString()).compareTo("NOT_HIDDEN") == 0) {
                    winners.add(command.get(i));
                    //System.out.println(command.get(i)+" - выиграл");
                }
                if (((command.get(i).getState()).toString()).compareTo("HIDDEN") == 0) {
                    losers.add(command.get(i));
                    //System.out.println(command.get(i)+" - проиграл");
                }
                if (((command.get(i).getState()).toString()).compareTo("GONE_HOME") == 0) {

                    //System.out.println(command.get(i)+" - ушел домой");
                    throw new MiJeDogovarivalisDomaNePryatatsaException(command.get(i));
                }

            }

        }

        System.out.println("Игра успешно завершилась!");
        System.out.println("Победители игры: ");
        System.out.println(Arrays.toString(winners.toArray()));
        System.out.println("Проигравшие: ");
        System.out.println(Arrays.toString(losers.toArray()));

    }

    public static void main(String[] args){

        Play play1 = new Play();
        System.out.println("\nКоманда участников: ");
        play1.setStatesOfPlayers();
        System.out.println(Arrays.toString(play1.command.toArray()));

        try {

            System.out.println("\nВедущий ищет участников: ");
            play1.defineWinnersAndLosers();
        }
        catch(MiJeDogovarivalisDomaNePryatatsaException exc){
            System.out.println(exc);
        }


    }
}
