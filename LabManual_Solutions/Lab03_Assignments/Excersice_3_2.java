package Lab03_Assignments;

import java.util.*;

class PositiveStr{
	
	public boolean check(String str) {
		
		boolean flag = false;
		char[] charArray = str.toCharArray();
		
		for(int i=0;i<charArray.length-1;i++) {
			char temp1 = charArray[i];
			char temp2 = charArray[i+1];
			int ascii_temp1 = (int) temp1;
			int ascii_temp2 = (int) temp2;
			
			if(ascii_temp1 < ascii_temp2==true) {
				flag = true;
				break;
			}
		}
		return flag;
	}
}

public class Excersice_3_2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = input.nextLine();
		PositiveStr ps = new PositiveStr();
		if(ps.check(str)) {
			System.out.println(str+" is a Positive String");
		}else {
			System.out.println(str+" is not a Positive String");
		}
	}

}


/*
 * OUTPUT : 
 * Enter the String : ANT
   ANT is a Positive String
*/