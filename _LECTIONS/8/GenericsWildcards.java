public class GenericsWildcards {

    public static class  Box <T>   {
        T content;

        public Box(T content) {
            this.content = content;
        }

        public T getContent() {
            return content;
        }
    }


    public static class BoxWithString <T> extends Box<T> {

        public BoxWithString(T content) {
            super(content);
        }

        @Override
        public String toString() {
            return "Content is" + content;
        }
    }

    public static void main(String[] args) {
        BoxWithString<String> str = new BoxWithString<>("String");
        Box<Integer> in = new Box<>(42);
        //printBox(str);
        //printBox(str);
        // printPlusInt(str); не работает, т.к. строка
       // printBox(in);

        Box<Long> longBox = new Box<>(42L);
       //  printPlusNumber(longBox); не работает т.к. <Long> != <Number>

        Box<Number> nmb = new Box(42L);
      //  printPlusNumber(nmb);

        Box<Number> nmb2 = new Box("sorok dva");
    //    printPlusNumber(nmb2);

        printPlusNumberWildcard(longBox);

    }


    public static void printBox(Box box) {
        Object content = box.getContent();
        System.out.println(content.toString());
    }

    public static void printPlusInt(Box<Integer> box) {

        Integer content = box.getContent();
        System.out.println(content + 12);
    }

    public static void printPlusNumber(Box<Number> box) {
        Number content = box.getContent();
        System.out.println(content.intValue() + 12);
    }

    public static void printPlusNumberWildcard(Box<? extends Number> box) {
        Number content = box.getContent();
        System.out.println(content.intValue() + 12);
    }


}
