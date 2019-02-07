package Task1;

public class Monoblock extends ComputerItems {

    Monoblock(String name, int price, int quantity, int memorySize, int HDSize, int CPUCoreCount) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.memorySize = memorySize;
        this.HDSize = HDSize;
        this.CPUCoreCount = CPUCoreCount;
    }

    @Override
    String getOptions() {
        return "";
    }
}
