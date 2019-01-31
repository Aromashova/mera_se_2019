package task4_2.ru.mera.pechenkina.task4.part2;


public class Recept {

	
	/*static CoctailMaker[] coctailMachines = new CoctailMaker[6];
	
	public CoctailMaker[] addNewCoctailMachine( CoctailMaker cocMake) {
      for (int makemach=0; makemach<6; makemach++) {
    	  coctailMachines[makemach] = cocMake;
      }
 
		return coctailMachines;	
	}

	public static CoctailMaker[] getCoctailMachines() {
		return coctailMachines;
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        /*Recept recept = new Recept();*/
       
		/*CoctailMaker makedrink = new AizbergInOcean("fhf", "ddd", "fhfhd");
		CoctailMaker makedrink1 = new Mohito("fhf", "ddd", "fhfhd");
		CoctailMaker makedrink2 = new AizbergInOcean("fhf", "ddd", "fhfhd");
		CoctailMaker makedrink3 = new SaffronLady("fhf", "ddd", "fhfhd");
		CoctailMaker makedrink4 = new Mohito("fhf", "ddd", "fhfhd");*/
		
		
		/*recept.addNewCoctailMachine(new AizbergInOcean());
		recept.addNewCoctailMachine(new Mohito());
		recept.addNewCoctailMachine(new AizbergInOcean());
		recept.addNewCoctailMachine(new Mohito());
		recept.addNewCoctailMachine(new AizbergInOcean());
		recept.addNewCoctailMachine(new SaffronLady());*/
		
		/*recept.addNewCoctailMachine(makedrink);
		recept.addNewCoctailMachine(makedrink1);
		recept.addNewCoctailMachine(makedrink2);
		recept.addNewCoctailMachine(makedrink3);
		recept.addNewCoctailMachine(makedrink4);
		//recept.addNewCoctailMachine(makedrink5);
        */
        
        
        CoctailMaker[] coctailMachines1 = new CoctailMaker[5];
        coctailMachines1[0]=new Mohito();
        coctailMachines1[1]=new AizbergInOcean();
        coctailMachines1[2]=new SaffronLady();
        coctailMachines1[3]=new Mohito();
        coctailMachines1[4]=new SaffronLady();
		
		
		for (int i=0; i< coctailMachines1.length; i++) {
			coctailMachines1[i].mixCoctail();		
		}
	}	   
}

