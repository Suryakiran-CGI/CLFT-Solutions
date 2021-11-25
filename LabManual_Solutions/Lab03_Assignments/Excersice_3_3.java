package Lab03_Assignments;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class DateCalc{
	
	private int years;
	private int months;
	private int days;

	public void DateCalc() {
		this.days = days;
		this.months = months;
		this.years = years;
	}
	
	public void DateCalc(int days,int months,int years) {
		this.days = days;
		this.months = months;
		this.years = years;
	}
	
	public void Duration(int days,int months,int years) {
		
		LocalDate GivenDate = LocalDate.of(years, months, days);
		LocalDate currentDate = LocalDate.now();
		
		Period diff = Period.between(GivenDate, currentDate);
		
		System.out.println("Duration in Days : "+diff.getDays());
		System.out.println("Duration in Months : "+diff.getMonths());
		System.out.println("Duration in Years : "+diff.getYears());
	}
}

public class Excersice_3_3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Day : ");
		int day = input.nextInt();
		System.out.print("Enter the Month : ");
		int month = input.nextInt();
		System.out.print("Enter the year : ");
		int year = input.nextInt();
		DateCalc dc = new DateCalc();
		dc.Duration(day,month,year);
	}

}


/*
 * OUTPUT : 
 * 
 * Enter the Day : 01
   Enter the Month : 01
   Enter the year : 2012
   Duration in Days : 9
   Duration in Months : 10
   Duration in Years : 9

 */


