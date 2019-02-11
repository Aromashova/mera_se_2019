package ru.mera.pechenkina.task7;

public class Box<ELEMENT> {
	
	ELEMENT storedValue;

		
	/**
	 * @param storedValue
	 */
	public Box(ELEMENT storedValue) {
		this.storedValue = storedValue;
	}

	

	public ELEMENT unbox() {
		return storedValue;
	}

	
	
	public static class BoxUsing {
		
		
		
		public static void main(String[] args) {
			
			//As it was mentioned in task
			Box str = new Box("A");
			String resultstr = (String) str.unbox();
			System.out.println(resultstr);
			
			Box intvalue = new Box(34);
			Integer resultint = (Integer) intvalue.unbox();
			System.out.println(resultint);
			
			//In this case our generic doesn't work
			/*Box strrer = new Box(5);
			String resultstrds = (String) strrer.unbox();
			System.out.println(resultstrds);*/
			
			//As it should be used in generic,right?
			Box<String> strvalue = new Box<>("sdsds");
			System.out.println(strvalue.unbox());
			
			Box<Integer> intvalueSpecific = new Box<>(3465656);
			System.out.println(intvalueSpecific.unbox());
			
		}
		
		
	}



	

}
