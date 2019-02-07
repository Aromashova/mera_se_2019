package ru.mera.romazanova.task5;

public class Monoblock extends Computers implements Returnable {
    private final String typeOfGood = "Monoblock";

    public Monoblock(int count, String name, int quantity, int memorySize, int hardDriveSpace, int numberOfCpuCores) {
        super(count, name, quantity, memorySize, hardDriveSpace, numberOfCpuCores);
    }

    @Override
    public String getTypeOfGood() {
        return typeOfGood;
    }

    @Override
    public String getRequiredDocument() {
        return null;
    }

    @Override
    public int getDaysForReturn() {
        return 0;
    }

    @Override
    public String toString() {
        return "Moloblock " + getName() + " price: " + getCount() + " quantity: " + getQuantity() + " memory size: "
                + getMemorySize() + "hard drive space: " + getHardDriveSpace() + " number of CPU cores: "
                + getNumberOfCpuCores() + "\n";
    }
}
