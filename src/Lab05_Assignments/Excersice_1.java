package Lab05_Assignments;

import java.util.*;

class AgeException extends Exception{
	
	AgeException(String str){
		System.out.println(str);
	}
	
}

public class Excersice_1 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter You'r Age : ");
        int age = sc.nextInt();
        
        try {
        	if(age < 18) {
        		throw new AgeException("Oops! Invalid age please enter valid Age..");
        	}else {
        		System.out.println("Entered Valid Age...");
        	}
        }
        catch(Exception e) {
        	System.out.println(e);
        }
	}

}
