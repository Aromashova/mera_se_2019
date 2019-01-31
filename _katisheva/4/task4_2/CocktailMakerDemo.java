package task4_2;

class CocktailMakerDemo {
    public static void main (String[] args){

        CocktailMaker[] coctail_mas1=new CocktailMaker[4];
        coctail_mas1[0]= new BananaMilkCocktailMaker();
        coctail_mas1[1]= new VegetableSaladMaker();
        coctail_mas1[2]= new StrawberryMilkCocktailMaker();
        coctail_mas1[3]= new PeachYogurtCocktailMaker();
        for(int i=0; i<coctail_mas1.length; i++){
            coctail_mas1[i].mix();
        }

    }
}
