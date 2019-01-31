package task4_2.ru.mera.pechenkina.task4.part2;

public class Mohito  extends CoctailMaker {

	public String liquid;
	public String mainIngredient;
	public String toping;
	
	/**
	 * @param liquid
	 * @param mainIngredient
	 * @param toping
	 */
	public Mohito(String liquid, String mainIngredient, String toping) {
		super();
		this.liquid = liquid;
		this.mainIngredient = mainIngredient;
		this.toping = toping;
	}
	
	public Mohito() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getLiquid() {
		return "Tonik";
	}

	@Override
	public String getMainIngredient() {
		return "Dzin";
	}

	@Override
	public String getToping() {
		return "Mint";
	}


}
