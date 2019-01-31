public class Wolf extends Animal implements Wild {
    public Wolf(String name) {
        super(name);
    }

    @Override
    public void eatMeat(String meatType) {
        System.out.println("Съел " + meatType);
    }
}
