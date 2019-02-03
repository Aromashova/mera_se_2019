package voronkova.task1;

public class AllInOnePCs extends Computers {
    public AllInOnePCs(String name, double count, int quantity, int memory, int RAM, int CPU) {
        super(name, count, quantity, memory, RAM, CPU);
    }

    @Override
    public String toString() {
        return String.format("All-In-One PC: %s Count: %.2f RUB Quantity: %s Full memory: %s Gb RAM: %s Gb CPU: %s",
                getName(), getCount(), getQuantity(), getMemory(), getRAM(), getCPU());
    }
}
