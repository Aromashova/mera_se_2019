package ru.mera.katisheva.task5;

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
    public String getRequiredDocuments() {
        return "чек, паспорт";
    }

    @Override
    public int getDaysForReturn() {
        return 14;
    }

    @Override
    public String toString() {
        if(this.getNumberOfCores()==1) {
            return "Ноутбук " + getName() + ", " + getCount() + "руб., " + getQuantity() + "шт., оперативная память " + getRam() + "МБ, " + getNumberOfCores() + "ядро, жесткий диск " + getHardDiskMemory() + "ГБ, диагональ экрана "+getScreenDiagonal()+"дюймов, время зарядки баратеи "+getBatteryTime()+"Вт*ч";
        }
        else if(this.getNumberOfCores()<=4 && this.getNumberOfCores()>=2) {
            return "Ноутбук " + getName() + ", " + getCount() + "руб., " + getQuantity() + "шт., оперативная память " + getRam() + "МБ, " + getNumberOfCores() + "ядра, жесткий диск " + getHardDiskMemory() + "ГБ, диагональ экрана "+getScreenDiagonal()+"дюймов, время зарядки баратеи "+getBatteryTime()+"ВТ*ч";
        }
        else{
            return "Ноутбук " + getName() + ", " + getCount() + "руб., " + getQuantity() + "шт., оперативная память " + getRam() + "МБ, " + getNumberOfCores() + "ядер, жесткий диск " + getHardDiskMemory() + "ГБ, диагональ экрана "+getScreenDiagonal()+"дюймов, время зарядки баратеи "+getBatteryTime()+"ВТ*ч";
        }
    }
}
