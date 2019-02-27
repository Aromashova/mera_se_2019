package ru.mera.katisheva.task11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.*;
import java.util.stream.Collectors;

public class TimeInStream {

    List<LocalDate> dates;
    int datesNum=30;

    TimeInStream(){
        dates = new ArrayList<>();
        long millis = System.currentTimeMillis() % 1000;
        Random random = new Random(millis);
        System.out.println(datesNum+" random dates from 1500 till 2500: ");
        for(int i=0; i< datesNum; i++) {

            int minDay = (int) LocalDate.of(1500, 1, 1).toEpochDay();
            int maxDay = (int) LocalDate.of(2500, 12, 31).toEpochDay();
            long randomDay = minDay + random.nextInt(maxDay - minDay);
            LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
            dates.add(i,randomDate);
            dates.get(0).getDayOfMonth();
            System.out.println("Date: "+dates.get(i)+" century: "+(((dates.get(i).getYear())/100+1)));

        }
    }

    public void datesGropByCentury(){

        Map<Integer, List<LocalDate>> map = dates.stream().collect(Collectors.groupingBy(x -> x.get(ChronoField.YEAR) / 100+1));
        System.out.println(map);
    }

    public void datesSundayIsLastDayOfMonth(){

        List<LocalDate> temp = new ArrayList<>();
        for(LocalDate date : dates){
            if(date.withDayOfMonth(date.lengthOfMonth()).getDayOfWeek().getValue()==7) {
                temp.add(date);
                //System.out.println("Date: "+date+", last day of month: "+date.withDayOfMonth(date.lengthOfMonth())+" is "+date.withDayOfMonth(date.lengthOfMonth()).getDayOfWeek().toString());
            }
        }

        System.out.println(temp);
    }

    public void sortDates(){
            Collections.sort(dates);
            System.out.println(dates);
    }

    public void datesEndedBy99(){
        List<String> formattedDates = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        formattedDates = dates.stream().map(date -> date.format(formatter))
                    .filter(d -> d.endsWith("99")).collect(Collectors.toList());
        if(formattedDates.isEmpty())
            System.out.println("No dates ended by 99.");
        else
            System.out.println(formattedDates);
    }

    public static void main(String[] args){

        TimeInStream timeInStream = new TimeInStream();
        System.out.println("\nDates grouped by century: ");
        timeInStream.datesGropByCentury();
        System.out.println("\nDates where the last day of month is Sunday: ");
        timeInStream.datesSundayIsLastDayOfMonth();
        System.out.println("\nSorted dates: ");
        timeInStream.sortDates();
        System.out.println("\nFormatted dates ended by 99: ");
        timeInStream.datesEndedBy99();


    }
}
