package task4_2.ru.mera.pechenkina.task4.part2;

public class SaffronLady  extends CoctailMaker  {
	public String liquid;
	public String mainIngredient;
	public String toping;
	
	
	/**
	 * @param liquid
	 * @param mainIngredient
	 * @param toping
	 */
	public SaffronLady(String liquid, String mainIngredient, String toping) {
		super();
		this.liquid = liquid;
		this.mainIngredient = mainIngredient;
		this.toping = toping;
	}

	public SaffronLady() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getLiquid() {
		return "Viski";
	}

	@Override
	public String getMainIngredient() {
		return "Liker";
	}

	@Override
	public String getToping() {
		return "Laim juice";
	}


}
