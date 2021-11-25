package Lab03_Assignments;

import java.util.*;

class ConvertAlphabets{
	
	private static final String consonants = "BCDFGHJKLMNPQRSTVWXYZ";
	private int consLength = consonants.length();
	
	public String alterString(String str) {
		
		int index;
		char[] charArray = str.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			index = consonants.indexOf(charArray[i]);
			if(index != -1) {
				charArray[i] = consonants.charAt((index + 1) % consLength);
			}
		}
		return new String(charArray);
	}
}

public class Excersice_3 {

	public static void main(String[] args) {
		
		String stringInput;
		Scanner input = new Scanner(System.in);
		ConvertAlphabets c = new ConvertAlphabets();
		
		System.out.print("Enter the String value : ");
		stringInput = input.nextLine();
		System.out.println("Before altering String : "+stringInput);
		System.out.println("After altering String : "+c.alterString(stringInput.toUpperCase()));
	}

}


/*OUTPUT : 
 *       Enter the String value : JAVA
 *       Before altering String : JAVA
 *       After altering String : KAWA
 *  
*/
