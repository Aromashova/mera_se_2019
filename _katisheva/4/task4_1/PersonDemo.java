package task4_1;

import java.util.*;
public class PersonDemo {

    /*private task4_1.Person[] people;
    private int PutIndex, GetIndex;

    task4_1.PersonDemo(int people_size){
        GetIndex=PutIndex=0;
        people=new task4_1.Person[people_size];

    }

    task4_1.PersonDemo(task4_1.Person[] person_mas){
        GetIndex=PutIndex=0;
        people=new task4_1.Person[person_mas.length];
        System.arraycopy(people,0,person_mas,0,person_mas.length);
    }

    void putPerson(task4_1.Person person){
        if(PutIndex==people.length-1)
        {

            task4_1.Person[] increased_people=new task4_1.Person[people.length+1];
            System.arraycopy(people,0,increased_people,0,people.length);
            people=increased_people;
        }
        PutIndex++;
        people[PutIndex]=person;

    }

    task4_1.Person getPerson(){
        if(PutIndex==GetIndex){
            System.out.println("EmailBox is empty.");
            return new task4_1.Person();
        }
        GetIndex++;
        return people[GetIndex];

    }

    int getPutIndex() {
        return PutIndex;
    }

    int getGetIndex() {
        return GetIndex;
    }
    */

    public static void main(String[] args){

        //task4_1.PersonDemo personDemo1=new task4_1.PersonDemo(5);
        String[] styles={"classic", "impressionism", "modernism","postmodernism","baroque","realism"};
        String[] instruments={"piano","violin","cello","guitar","accordion","drum"};
        Person[] person_mas1=new Person[5];
        person_mas1[0]=new Person("Misha", "Ivanov");
        person_mas1[1]=new Person("Anya","Smirnova");
        person_mas1[2]=new Person("Vova","Petrov");
        person_mas1[3]=new Person("Vasya","Sidorov");
        person_mas1[4]=new Person("Natasha","Stepanova");

        Random rand=new Random(47);
        int random_value=0;
        for(int i=0, j=0, k=0; (i< person_mas1.length)&&(j<styles.length)&&(k<instruments.length); i++){

            random_value=rand.nextInt(1001);
            if(random_value%2==0) {
                //personDemo1.people[i] = new task4_1.Artist(person_mas1[i],styles[j]);
                person_mas1[i] = new Artist(person_mas1[i],styles[j]);
                j++;
            }
            else{
                //personDemo1.people[i] = new task4_1.Musician(person_mas1[i],instruments[k]);
                person_mas1[i] = new Musician(person_mas1[i],instruments[k]);
                k++;
            }
        }

        /*for(int i=0; i<personDemo1.people.length; i++) {
            if(personDemo1.people[i] instanceof task4_1.Artist) {
                System.out.println(personDemo1.people[i].toString() + " paints in style " + ((task4_1.Artist) personDemo1.people[i]).getStyle());
            }
            else if (personDemo1.people[i] instanceof task4_1.Musician) {
                System.out.println(personDemo1.people[i].toString() + " plays on " + ((task4_1.Musician) personDemo1.people[i]).getInstrument());
            }
            else System.out.println(personDemo1.people[i].toString() + " unknown");
        }*/
        for(int i=0; i<person_mas1.length; i++) {
            if (person_mas1[i] instanceof Artist) {
                System.out.println(person_mas1[i].toString() + " paints in style " + ((Artist) person_mas1[i]).getStyle());
            } else if (person_mas1[i] instanceof Musician) {
                System.out.println(person_mas1[i].toString() + " plays on " + ((Musician) person_mas1[i]).getInstrument());
            } else System.out.println(person_mas1[i].toString() + " unknown");
        }
    }
}
