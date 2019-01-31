package task5;

abstract class Computers extends AbstractItem{
    private double ram;
    private int numberOfCores;
    private long hardDiskMemory;

    Computers(long countValue, String nameValue, int quantityValue, double ramValue, int numberOfCoresValue, long hardDiskMemoryValue){

        super(countValue,nameValue,quantityValue);
        ram=ramValue;
        hardDiskMemory=hardDiskMemoryValue;
        numberOfCores=numberOfCoresValue;

    }
    double getRam() {
        return ram;
    }

    int getNumberOfCores() {
        return numberOfCores;
    }

    long getHardDiskMemory() {
        return hardDiskMemory;
    }

    @Override
    public long getCount() {
        return super.getCount();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getQuantity() {
        return super.getQuantity();
    }
}