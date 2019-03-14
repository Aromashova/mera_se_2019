package ru.mera.grishina.task11;

import java.util.*;
import java.util.Random;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.stream.Collectors;

public class StreamTime {
    List<LocalDate> dates;

    StreamTime(){
        dates = new ArrayList<>();
        Random rand = new Random(System.currentTimeMillis() % 1000);

        for(int i = 0; i < 30; i++){
            int min = (int) LocalDate.of(1500, 1, 1).toEpochDay();
            int max = (int) LocalDate.of(2500, 12, 31).toEpochDay();
            long rand_day = min + rand.nextInt(max - min);
            LocalDate rand_date = LocalDate.ofEpochDay(rand_day);
            dates.add(i, rand_date);
            dates.get(0).getDayOfMonth();
            System.out.println("Century: " + (((dates.get(i).getYear())/100 + 1)) + " => random date from this century: " + dates.get(i));
        }
    }

    public void groupDatesByCentury(){
        // Group dates by century and output them in the format: century => dates from this century.
        Map<Integer, List<LocalDate>> group = dates.stream().collect(Collectors.groupingBy(x -> x.get(ChronoField.YEAR)/100 + 1));
        System.out.println(group);
    }

    public void filterDatesSundayLastDay(){
        // Filter the dates for which the last day of the month is Sunday and display them on the screen.
        List<LocalDate> filter = new ArrayList<>();
        for(LocalDate date : dates){
            if(date.withDayOfMonth(date.lengthOfMonth()).getDayOfWeek().getValue() == 7){
                filter.add(date);
            }
        }
        System.out.println(filter);
    }

    public void orderedDates(){
        // Display the ordered dates on the screen.
        Collections.sort(dates);
        System.out.println(dates);
    }

    public void datesEndedWith99(){
        // Print each date in a string in the format "dd.MM.yyyy" (Use DateTimeFormatter) only those dates that end with 99.
        List<String> formatterDates = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        formatterDates = dates.stream().map(date -> date.format(formatter)).filter(d -> d.endsWith("99")).collect(Collectors.toList());
        if(formatterDates.isEmpty())
            System.out.println("No date ended with 99.");
        else
            System.out.println(formatterDates);
    }

    public static void main(String[] args){
        StreamTime timeInStream = new StreamTime();
        System.out.println("Group dates by century and output them in the format: century => dates from this century.");
        timeInStream.groupDatesByCentury();
        System.out.println("Filter the dates for which the last day of the month is Sunday and display them on the screen.");
        timeInStream.filterDatesSundayLastDay();
        System.out.println("Display the ordered dates on the screen.");
        timeInStream.orderedDates();
        System.out.println("Print each date in a string in the format \"dd.MM.yyyy\" (Use DateTimeFormatter) only those dates that end with 99.");
        timeInStream.datesEndedWith99();
    }
}