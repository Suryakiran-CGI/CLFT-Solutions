package Lab03_Assignments;

import java.util.*;

class Demo1{
	
	public String modifyStr(String str) {
		
		//Step-1
		str+=str;
		
		//Step-2
		String new_str = "",out="",temp="";
		
		for(int i=0;i<str.length();i++) {
			if(i%2==0) {
				new_str += str.charAt(i);
			}
			else {
				new_str += '#';
			}
		}
		
		//Step-3
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<new_str.length();i++) {
			set.add(new_str.charAt(i));
		}
		
		//Step-4
		for(Character ch : set) {
			out += ch;
		}
		for(int i =0;i<out.length();i++) {
			if(i%2==1) {
				temp += out.toUpperCase().charAt(i);
			}
			else {
				temp += out.charAt(i);
			}
		}
				
		return temp;
	}
}

public class Excersice_3_1 {

	public static void main(String[] args) {
		
        Demo1 d = new Demo1();
        Scanner sc = new Scanner(System.in);
        System.err.print("Entered String is : ");
        String str = sc.nextLine();
        
        System.out.println("Modified String is : "+d.modifyStr(str));
	}

}

/**
 * OUPUT :
 * 
 * Entered String is : capgemini
   Modified String is : c#pEiAgMn
 **/
 