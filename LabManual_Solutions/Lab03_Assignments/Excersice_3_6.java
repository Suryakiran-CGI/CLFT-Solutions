package Lab03_Assignments;

import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

class Display{
	public void getStatus(String id) {
		
		Date now = new Date();
		TimeZone.setDefault(TimeZone.getTimeZone(id));
		System.out.println("Zone ID : "+id);
	    System.out.println("Current Time : "+now.getHours()+":"+now.getMinutes()+":"+now.getSeconds());
	    
	    TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
		System.out.println("GMT Time Zone "+now);
		
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
		System.out.println("UTC Time Zone "+now);

	}
}

public class Excersice_3_6{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Zone ID here{EG: Asia/Kolkata}: ");
		String ZoneID = sc.nextLine();
		
		Display d = new Display();
		d.getStatus(ZoneID);
	}
}

/**
 * OUTPUT : 
 * 
 * Enter Zone ID here{EG: Asia/Kolkata}: Asia/Delhi
   Zone ID : Asia/Delhi
   Current Time : 7:36:10
   GMT Time Zone Tue Nov 23 07:36:10 GMT 2021
   UTC Time Zone Tue Nov 23 07:36:10 UTC 2021 
 * 
 **/
