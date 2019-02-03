package voronkova.task1;

public class Laptops extends Computers implements Returnable {
    private double screenDiagonal;
    private int timeWithoutRecharging;

    public Laptops(String name, double count, int quantity, int memory, int RAM, int CPU, double screenDiagonal, int timeWithoutRecharging) {
        super(name, count, quantity, memory, RAM, CPU);
        this.screenDiagonal = screenDiagonal;
        this.timeWithoutRecharging = timeWithoutRecharging;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public int getTimeWithoutRecharging() {
        return timeWithoutRecharging;
    }

    @Override
    public String getRequiredDocuments() {
        return "check and passport";
    }

    @Override
    public int getDaysForReturn() {
        return 14;
    }

    @Override
    public String toString() {
        return String.format("Laptop: %s Count: %.2f RUB Quantity: %s Full memory: %s Gb RAM: %s Gb CPU: %s Screen diagonal: %.1f inch Work hour without recharging: %s hour",
                getName(),getCount(),getQuantity(),getMemory(), getRAM(), getCPU(), getScreenDiagonal(),getTimeWithoutRecharging());
    }
}
