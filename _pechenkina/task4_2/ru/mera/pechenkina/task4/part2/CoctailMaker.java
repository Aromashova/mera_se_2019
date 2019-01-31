package task4_2.ru.mera.pechenkina.task4.part2;


public abstract class CoctailMaker {
	

	public abstract String getLiquid();
	public abstract String getMainIngredient();
	public abstract String getToping();
	
	public void mixCoctail() {

        System.out.println("Coctail mixed up with " + getLiquid() + " " + getMainIngredient() + " " + getToping() + " \n" );
    }
	


}
