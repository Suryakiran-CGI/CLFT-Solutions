package Lab03_Assignments;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class DateCalculator{
	
	private int years;
	private int months;
	private int days;

	public void DateCalculator() {
		this.days = days;
		this.months = months;
		this.years = years;
	}
	
	public void DateCalculator(int days,int months,int years) {
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

public class Excersice_9 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Day : ");
		int day = input.nextInt();
		System.out.print("Enter the Month : ");
		int month = input.nextInt();
		System.out.print("Enter the year : ");
		int year = input.nextInt();
		DateCalculator dc = new DateCalculator();
		dc.Duration(day,month,year);
	}

}


/*
 * Enter the Day : 01
   Enter the Month : 01
   Enter the year : 2012
   Duration in Days : 9
   Duration in Months : 10
   Duration in Years : 9

 */

