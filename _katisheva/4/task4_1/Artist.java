package task4_1;

class Artist extends Person {
    private String Style;

    Artist(){
        super();
        Style="";
    }

    Artist(String name, String surname, String style){
        super(name,surname);
        Style=style;
    }
    Artist(Person person, String style){
        super(person);
        Style=style;    }

    String getStyle() {
        return Style;
    }
}
