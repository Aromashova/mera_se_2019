package ru.mera.katisheva.task5;

class Jigsaws extends PowerTool {
    private long kerfThickness;
    Jigsaws(long countValue, String nameValue, int quantityValue, int powerValue, long kerfThicknessValue){
        super(countValue,nameValue,quantityValue,powerValue);
        kerfThickness=kerfThicknessValue;
    }

    public long getKerfThickness() {
        return kerfThickness;
    }

    @Override
    public String toString() {
        return "Лобзик "+getName()+", "+getCount()+"руб., "+getQuantity()+"шт., мощность "+getPower()+"Вт, максимальная толщина пропила "+getKerfThickness()+"мм";
    }
}
