package ru.mera.katisheva.task5;

class CandyBars extends Computers {
    CandyBars(long countValue, String nameValue, int quantityValue, double ramValue, int numberOfCoresValue, long hardDiskMemoryValue) {

        super(countValue, nameValue, quantityValue, ramValue, numberOfCoresValue, hardDiskMemoryValue);
    }

    @Override
    public String toString() {

        if(this.getNumberOfCores()==1) {
            return "Моноблок " + getName() + ", " + getCount() + "руб., " + getQuantity() + "шт., оперативная память " + getRam() + "МБ, " + getNumberOfCores() + "ядро, жесткий диск " + getHardDiskMemory() + "ГБ";
        }
        else if(this.getNumberOfCores()<=4 && this.getNumberOfCores()>=2) {
            return "Моноблок " + getName() + ", " + getCount() + "руб., " + getQuantity() + "шт., оперативная память " + getRam() + "МБ, " + getNumberOfCores() + "ядра, жесткий диск " + getHardDiskMemory() + "ГБ";
        }
        else{
            return "Моноблок " + getName() + ", " + getCount() + "руб., " + getQuantity() + "шт., оперативная память " + getRam() + "МБ, " + getNumberOfCores() + "ядер, жесткий диск " + getHardDiskMemory() + "ГБ";
        }

    }
}
