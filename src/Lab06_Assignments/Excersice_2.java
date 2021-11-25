package Lab06_Assignments;

import java.util.*;

class  CollectionDemo2{
	
	public Map<Character, Integer> countChars(char[] arr){
		
		int count[] = new int[arr.length];
		Map<Character,Integer> mp = new HashMap<Character,Integer>();
		
		for(int i=0;i<arr.length-1;i++) {
			count[i] = 1;
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count[i]++;
					arr[j] = 0;
				}
			}
			
			mp.put(arr[i], count[i]);
		}
		
		return mp;
	}
}

public class Excersice_2 {

	public static void main(String[] args) {
		
		CollectionDemo2 cd = new CollectionDemo2();
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
		
		char[] str_arr = str.toCharArray();
		System.err.println("Character Occurance are : "+cd.countChars(str_arr));
		
	}

}


/**OUTPUT : 
 * 
 * Enter the String : capgemini
   Character Occurance : {p=1, a=1, c=1, e=1, g=1, i=2, m=1, n=1}
 * 
 **/
