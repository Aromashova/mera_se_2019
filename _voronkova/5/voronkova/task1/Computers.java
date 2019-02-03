package voronkova.task1;

public abstract class Computers extends AbstractItem {
    private int memory;
    private int RAM;
    private int CPU;

    public Computers(String name, double count, int quantity, int memory, int RAM, int CPU) {
        super(name, count, quantity);
        this.memory = memory;
        this.RAM = RAM;
        this.CPU = CPU;
    }

    public int getMemory() {
        return memory;
    }

    public int getRAM() {
        return RAM;
    }

    public int getCPU() {
        return CPU;
    }
}
