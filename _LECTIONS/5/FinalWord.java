public final class FinalWord {
    public static final int NUMBER =42;

    public static final Animal vasya = new Cat("Вася");

    public static void main(String[] args) {
       // vasya = new Cat("Петям");

        vasya.setName("Петя");
        final int var = 43;
        // var = 44; не могу переопределить

        final int vv;
        if ( var == 43) {
            vv = 42;
        } else {
            vv = 41;
        }
    }

    public static int getNUMBER() {
        return NUMBER;
    }

    public String method1() {
        return "method 1 overridable";
    }

    public final String method2() {
        return "method 2 non overridable";
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
