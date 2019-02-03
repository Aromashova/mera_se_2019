package Task1;

public class Laptop extends ComputerItems implements Returnable{

    private int screenDiagonal;
    private int workingHours;

    Laptop(String name, int price, int quantity, int memorySize, int HDSize, int CPUCoreCount, int screenDiagonal, int workingHours) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.memorySize = memorySize;
        this.HDSize = HDSize;
        this.CPUCoreCount = CPUCoreCount;
        this.screenDiagonal = screenDiagonal;
        this.workingHours = workingHours;
    }

    public float getScreenDiagonal() {
        return screenDiagonal;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    @Override
    public String getRequiredDocuments() {
        return "Required documents: passport, check";
    }

    @Override
    public int getDaysForReturn() {
        return 14;
    }

    @Override
    String getOptions() {
        return String.format(", screen diagonal:%d working hours:%d", screenDiagonal, workingHours);
    }
}
