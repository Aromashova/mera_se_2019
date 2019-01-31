package task5;

class Drills extends PowerTool implements Returnable{
    private long maxDrillDiameter;
    Drills(long countValue, String nameValue, int quantityValue, int powerValue, long maxDrillDiameterValue){
        super(countValue,nameValue,quantityValue,powerValue);
        maxDrillDiameter=maxDrillDiameterValue;
    }

    public long getMaxDrillDiameter() {
        return maxDrillDiameter;
    }

    @Override
    public String[] getRequiredDocuments() {
        return new String[]{"check"};
    }

    @Override
    public int getDaysForReturn() {
        return 7;
    }

    @Override
    public String toString() {
        return "Дрель "+getName()+", "+getCount()+"руб., "+getQuantity()+"шт., мощность "+getPower()+"Вт, максимальный диаметр сверла "+getMaxDrillDiameter()+"мм";
    }
}
