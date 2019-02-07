package ru.mera.romazanova.task5;

public class Laptop extends Computers implements Returnable {

    private final int screeDiagonal;
    private final int timeWithoutRecharging;
    private final String requiredDocument = "commodity check and passport";
    private final int dayForReturn = 14;
    private final String typeOfGood = "Laptop";

    public Laptop(int count, String name, int quantity, int memorySize, int hardDriveSpace, int numberOfCpuCores,
            int screeDiagonal, int timeWithoutRecharging) {
        super(count, name, quantity, memorySize, hardDriveSpace, numberOfCpuCores);
        this.screeDiagonal = screeDiagonal;
        this.timeWithoutRecharging = timeWithoutRecharging;

    }

    public String getTypeOfGood() {
        return typeOfGood;
    }

    public int getScreeDiagonal() {
        return screeDiagonal;
    }

    public int getTimeWithoutRecharging() {
        return timeWithoutRecharging;
    }

    @Override
    public String getRequiredDocument() {
        return requiredDocument;
    }

    @Override
    public int getDaysForReturn() {
        return dayForReturn;
    }

    @Override
    public String toString() {
        return "Laptop " + getName() + " price: " + getCount() + " quantity: " + getQuantity() + " memory size: "
                + getMemorySize() + "hard drive space: " + getHardDriveSpace() + "number of CPU cores: "
                + getNumberOfCpuCores() + " scree diagonal: " + getScreeDiagonal() + " "
                + " worktime without recharging: " + getTimeWithoutRecharging() + "\n";
    }

}
