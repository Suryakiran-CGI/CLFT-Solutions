package Lab01_Assignments;

import java.util.Scanner;

class Test1{
	public boolean CheckNumber(int n) {
		boolean flag = false;
		if(n==0) { return flag=false; }
        while(n != 1)
        {
            n = n/2;
            if(n%2 != 0 && n != 1){ return flag=false; }
        }
        return flag=true;
	}
}

public class Excersice_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
	    Test1 t = new Test1();
	    if(t.CheckNumber(num)==true) {
	    	System.out.println("Entered number "+num+" is power of 2");
	    }else {
	    	System.out.println("Entered number "+num+" is not a power of 2");
	    }
	}

}
