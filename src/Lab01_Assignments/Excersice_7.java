package Lab01_Assignments;

import java.util.Scanner;

class Test{
	public boolean CheckNumber(int n) {
		boolean flag = false;
		int CurrentDigit = n % 10;
		n/=10;
		
		while(n>0) {
			if(CurrentDigit <=n) {
				flag = true;
				break;
			}
			CurrentDigit = n % 10;
			n /=10;
		}
		return flag;
	}
}

public class Excersice_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
	    Test t = new Test();
	    if(t.CheckNumber(num)==true) {
	    	System.out.println("Given "+num+" is an increasing Number");
	    }else {
	    	System.out.println("Given "+num+" is not an increasing Number");
	    }
	    
	}

}
