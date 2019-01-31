package task5;

class CircularSaws extends PowerTool implements Returnable{
    private long diskRadius;
    CircularSaws(long countValue, String nameValue, int quantityValue, int powerValue, long diskRadiusValue){
        super(countValue,nameValue,quantityValue,powerValue);
        diskRadius=diskRadiusValue;
    }

    long getDiskRadius() {
        return diskRadius;
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
        return "Пила дисковая "+getName()+", "+getCount()+"руб., "+getQuantity()+"шт., мощность " + getPower()+ "Вт, радиус диска "+getDiskRadius()+"мм";
    }
}
