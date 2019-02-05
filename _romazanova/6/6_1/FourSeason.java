package ru.mera.romazanova.task6_1;

import java.util.Random;

import ru.mera.romazanova.task6_1.Season.Seasons;

public class FourSeason {
    private final Season[] fourSeason = new Season[4];

    FourSeason() {
        fourSeason[0] = new Season(Seasons.WINTER);
        fourSeason[1] = new Season(Seasons.SPRING);
        fourSeason[2] = new Season(Seasons.SUMMER);
        fourSeason[3] = new Season(Seasons.AUTUMN);

    }

    public Season getRandomSeason() {
        final Season randomSeason = fourSeason[new Random().nextInt(fourSeason.length)];
        return randomSeason;
    }

}
