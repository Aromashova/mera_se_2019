package ru.mera.romazanova.task6_1;

public class Season {
    private final Seasons season;
    private Games game;

    public Season(Seasons season) {
        this.season = season;
        this.game = null;
        switch (season) {
        case WINTER:
            this.game = Games.SNOWBALLS;
            break;

        case SPRING:
            this.game = Games.LAUNCHINGBOATS;
            break;
        case SUMMER:
            this.game = Games.CHATCHINGSUNBEAMS;
            break;
        case AUTUMN:
            this.game = Games.MEASURINGOFPUDDLE;
            break;
        }
    }

    public Seasons getSeasonName() {
        return season;
    }

    public Games getGame() {
        return game;
    }

    enum Seasons {
        WINTER("winter"), SPRING("spring"), SUMMER("summer"), AUTUMN("autumn");
        private final String value;

        Seasons(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

    }

    enum Games {
        SNOWBALLS("snowballs"), LAUNCHINGBOATS("launching of boats in the creeks"), CHATCHINGSUNBEAMS(
                "catching sunbeams"), MEASURINGOFPUDDLE("measuring the depth of the puddle by boot");
        private final String value;

        Games(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

    }
}
