package ru.mera.romazanova.task4;

public class Test4 {
    public static void main ( String [] args ){

        PersonContainer newPersonContainer = new PersonContainer();
        int sizeOfContainer = PersonContainer.getContainerSize();

        for ( int i = 0; i < sizeOfContainer ; i++ ){
            Person person = newPersonContainer.getPerson(i);
            if (person instanceof Musician){
                System.out.println(person.toString() + " plays " + ((Musician)person).getInstrument().getValue());
            }
            else if  (person instanceof Artist){
                System.out.println(person.toString() + " paints in the style " + ((Artist)person).getStyle().getValue());
            }
        }
    }
}