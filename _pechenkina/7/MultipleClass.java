package ru.mera.pechenkina.task7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultipleClass {

	
	//Using Generic Method
	public static <ELEM_TYPE> ELEM_TYPE getCentralInList(List<ELEM_TYPE> someargs) { 

        ELEM_TYPE centralArg = null;
        System.out.println(someargs.size());
		if (someargs.size() == 0) {	
			System.out.println("Enter args");			
		} else {
			for (Object somearg : someargs) 
	            System.out.println("Entered list of arguments " + somearg);
			
			centralArg =  (ELEM_TYPE)someargs.get((int) Math.ceil(someargs.size()/2));
			
		}
		return centralArg;
	    } 
	 


	//Using mask or WildCards
	@SuppressWarnings("unchecked")
	static <ELEM_TYPE> ELEM_TYPE getCentralInListWild(List<?> someargs) { 
        
        ELEM_TYPE centralArg = null;
        System.out.println(someargs.size());
		if (someargs.size() == 0) {	
			System.out.println("Enter args");			
		} else {
			for (Object somearg : someargs) 
	            System.out.println("Entered list of arguments " + somearg);
			
			centralArg =  (ELEM_TYPE)someargs.get((int) Math.ceil(someargs.size()/2));
			
		}
		return centralArg;
    } 
 
    public static void main(String[] args) { 

    	//Using mask or WildCards
    	List<Integer> list = new ArrayList<>(); 
        list.add(10); 
        list.add(100); 
        Integer middlearg = getCentralInListWild(list);
        System.out.println(middlearg); 

        List<String> strList = Arrays.asList("56","df","sd"); 
        String middleargstr = getCentralInListWild(strList);
        System.out.println(middleargstr); 
 
        List<Double> dblList = new ArrayList<>();
        dblList.add(10787878D); 
        dblList.add(10067D); 
        Double middleargdbl = getCentralInListWild(dblList);
        System.out.println(middleargdbl); 
        
        
        //Using generic method
        List<Integer> intList = Arrays.asList(1,5,7,5,2); 
        Integer central = getCentralInList(intList); 
        System.out.println("Central is : " + central); 
    } 
}
