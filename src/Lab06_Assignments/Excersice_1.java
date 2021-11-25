package Lab06_Assignments;

import java.util.*;


class CollectionDemo1{
	
	public List getValues(Map<String, Integer> hm) {
		
		ArrayList<Integer> values = new ArrayList<Integer>(hm.values());
		
		Collections.sort(values);
		return  values;
	}

	//Optional as Per Question
	public List getKeys(Map<String, Integer> hm) {

		ArrayList<String> Keys = new ArrayList<String>(hm.keySet());

		Collections.sort(Keys);
		return Keys;
	}
}


public class Excersice_1 {

	public static void main(String[] args) {
		
		Map <String,Integer> hm = new HashMap<String,Integer>();
		hm.put("Surya", 1);
		hm.put("Kiran",4);
		hm.put("Vini",3);
		hm.put("Sai",2);
		
		CollectionDemo1 cd = new CollectionDemo1();
		System.out.println("Sorted Order of Values are : "+cd.getValues(hm));
		System.out.println("Sorted Order of Keys are : "+cd.getKeys(hm));
	}

}


/**OUTPUT : 
 * 
 * Sorted Order of Values : [1, 2, 3, 4]
   Sorted Order of Keys : [Kiran, Sai, Surya, Vini]
 * 
 * 
 **/
