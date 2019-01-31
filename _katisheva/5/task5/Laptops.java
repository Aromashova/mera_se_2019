package task5;

class Laptops extends Computers implements Returnable{
    private double screenDiagonal;
    private int batteryTime;
    Laptops(long countValue, String nameValue, int quantityValue, double ramValue, int numberOfCoresValue, long hardDiskMemoryValue, double screenDiagonalValue, int batteryTimeValue){

        super(countValue,nameValue,quantityValue,ramValue,numberOfCoresValue,hardDiskMemoryValue);
        screenDiagonal=screenDiagonalValue;
        batteryTime=batteryTimeValue;
    }

    double getScreenDiagonal() {
        return screenDiagonal;
    }

    int getBatteryTime() {
        return batteryTime;
    }

    @Override
    public String[] getRequiredDocuments() {
        return new String[]{"check", "passport"};
    }

    @Override
    public int getDaysForReturn() {
        return 14;
    }

    @Override
    public String toString() {
        if(this.getNumberOfCores()==1) {
            return "Ноутбук " + getName() + ", " + getCount() + "руб., " + getQuantity() + "шт., оперативная память " + getRam() + "ГБ, " + getNumberOfCores() + "ядро, жесткий диск " + getHardDiskMemory() + "ГБ, диагональ экрана "+getScreenDiagonal()+"см, время зарядки баратеи "+getBatteryTime()+"часов";
        }
        else if(this.getNumberOfCores()<=4 && this.getNumberOfCores()>=2) {
            return "Ноутбук " + getName() + ", " + getCount() + "руб., " + getQuantity() + "шт., оперативная память " + getRam() + "ГБ, " + getNumberOfCores() + "ядра, жесткий диск " + getHardDiskMemory() + "ГБ, диагональ экрана "+getScreenDiagonal()+"см, время зарядки баратеи "+getBatteryTime()+"часов";
        }
        else{
            return "Ноутбук " + getName() + ", " + getCount() + "руб., " + getQuantity() + "шт., оперативная память " + getRam() + "ГБ, " + getNumberOfCores() + "ядер, жесткий диск " + getHardDiskMemory() + "ГБ, диагональ экрана "+getScreenDiagonal()+"см, время зарядки баратеи "+getBatteryTime()+"часов";
        }
    }
}
