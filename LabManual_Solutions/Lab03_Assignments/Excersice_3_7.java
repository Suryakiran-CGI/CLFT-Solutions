package Lab03_Assignments;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

class ModifyA2{
	
	private String fname;
	private String lname;
	private String dob;
	private int age;
	private int day;
	private int month;
	private int year;
	
	public ModifyA2() {
		this.fname = "Surya";
		this.lname = "Kiran";
		this.dob = "26/07/1999";
		this.day = Integer.parseInt(this.dob.substring(0,2));
		this.month = Integer.parseInt(this.dob.substring(3,5));
		this.year = Integer.parseInt(this.dob.substring(6));

	}
	
	public ModifyA2(String fname,String lname,String dob) {
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		
		this.day = Integer.parseInt(this.dob.substring(0,2));
		this.month = Integer.parseInt(this.dob.substring(3,5));
		this.year = Integer.parseInt(this.dob.substring(6));
	
	}
	
	public int getAge() {
		
		LocalDate given = LocalDate.of(this.year, this.month, this.day);
		LocalDate current = LocalDate.now();
		Period diff = Period.between(given, current);
		
		this.age = diff.getYears();
		return this.age;
	}
	
	public String getName() {
		
		return this.fname+this.lname;
	}
	
}

public class Excersice_3_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First Name : ");
		String fname = sc.nextLine();
		System.out.print("Enter Last Name : ");
		String lname = sc.nextLine();
		System.out.print("Enter Date of Birth {dd/mm/yyyy} : ");
		String dob = sc.nextLine();
		
        ModifyA2 m = new ModifyA2(fname,lname,dob);
        System.err.println("Candidate FullName : "+m.getName());
        System.err.println("Candidate Age : "+m.getAge());
	}

}

/**
 * OUTPUT : 
 * 
 *Enter First Name : Surya
  Enter Last Name : Kiran
  Enter Date of Birth {dd/mm/yyyy} : 27/08/1999
  Candidate FullName : SuryaKiran
  Candidate Age : 22 
 * 
 * 
 **/
