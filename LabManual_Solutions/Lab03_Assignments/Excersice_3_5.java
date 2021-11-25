package Lab03_Assignments;

import java.io.*;
import java.util.*;

class ExpDate{
	
	private static String pDate;
	private static int wrn;
	private static int year;
	private static String fDate;
	
	static {
		pDate = "";
		wrn = 0;
		year = 0;
		fDate = "";
	}
	
	public ExpDate() {
		this.pDate = "27/08/2000";
		this.wrn = 3;
		this.year = Integer.parseInt(this.pDate.substring(6)) + this.wrn;
		this.fDate = String.format(pDate.substring(0,6)+"%d",this.year);
		
	}
	
	public ExpDate(String pDate,int wrn) {
		this.pDate = pDate;
		this.wrn = wrn;
		this.year = Integer.parseInt(this.pDate.substring(6)) + this.wrn;
		this.fDate = String.format(pDate.substring(0,6)+"%d",this.year);
		
	}
	
	public void printDate(String pDate,int wrn) {
		System.out.println("Your Product Purchase Date : "+pDate);
		System.out.println("Your Product Warranty Period : "+wrn);
		System.err.println("Your Product Expiry Date : "+ExpDate.fDate);
	}

	public void printDate() {
		System.out.println("Your Product Purchase Date : "+ExpDate.pDate);
		System.out.println("Your Product Warranty Period : "+ExpDate.wrn);
		System.err.println("Your Product Expiry Date : "+ExpDate.fDate);
	}
	
}

class Excersice_3_5 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product Purchase Date : ");
        String pDate = sc.nextLine();
        System.out.print("Enter Warranty Period : ");
        int wrn = sc.nextInt();
        
        ExpDate e = new ExpDate(pDate,wrn);
        e.printDate(pDate,wrn);
	}

}


/**
 * OUTPUT : 
 *
 * Enter Product Purchase Date : 22/08/2001
   Enter Warranty Period : 2
   Your Product Purchase Date : 22/08/2001
   Your Product Warranty Period : 2
   Your Product Expiry Date : 22/08/2003
 * 
 * 
 **/
