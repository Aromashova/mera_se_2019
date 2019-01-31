package task4_2.ru.mera.pechenkina.task4.part2;

public class AizbergInOcean extends CoctailMaker {
	
	public String liquid;
	public String mainIngredient;
	public String toping;
	
	
	/**
	 * @param liquid
	 * @param mainIngredient
	 * @param toping
	 */
	public AizbergInOcean(String liquid, String mainIngredient, String toping) {
		super();
		this.liquid = liquid;
		this.mainIngredient = mainIngredient;
		this.toping = toping;
	}
    
	public AizbergInOcean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getLiquid() {
		return "Milk";
	}

	@Override
	public String getMainIngredient() {
		return "Icecream";
	}

	@Override
	public String getToping() {
		return "Vishnevoe Varenie";
	}

}
