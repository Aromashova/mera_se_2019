package ru.mera.grishina.task6_2;

public class Members {
    public enum Names {
        DEADPOOL ("Deadpool"), VENOM ("Venom"), ANTMAN ("Ant-man"), HALK ("Halk"), DRSTRANGE ("Dr. Strange"),
        SPIDERMAN ("Spider-man"), LOGAN ("Logan"), IRONMAN ("Iron-man"), BLACKPANTHER ("Black Panther"), CAPTAINAMERICA ("Captain America");
        final String greating;

        Names(String greating) {
            this.greating = greating;
        }
    }

    public enum States {
        HIDE, DIDNOTHIDE, GONEHOME;
    }

    private String name;
    private String state;

    public Members(String Names, String States) {
        name = Names;
        state = States;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return String.format("%s is %s", Names.valueOf(getName()), getState());
    }
}