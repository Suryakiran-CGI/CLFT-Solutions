package Lab03_Assignments;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class DateCal{
	
	private int year1,year2;
	private int month1,month2;
	private int day1,day2;

	public void DateCal() {
		this.day1 = day1;
		this.month1 = month1;
		this.year1 = year1;
		this.day2 = day2;
		this.month2 = month2;
		this.year2 = year2;
	}
	
	public void DateCal(int days,int months,int years) {
		this.day1 = day1;
		this.month1 = month1;
		this.year1 = year1;
		this.day2 = day2;
		this.month2 = month2;
		this.year2 = year2;
	}
	
	public void Duration(int day1,int month1,int year1,int day2,int month2,int year2) {
		
		LocalDate GivenDate1 = LocalDate.of(year1, month1, day1);
		LocalDate GivenDate2 = LocalDate.of(year2, month2, day2);
		
		Period diff = Period.between(GivenDate1, GivenDate2);
		
		System.out.println("Duration in Days : "+diff.getDays());
		System.out.println("Duration in Months : "+diff.getMonths());
		System.out.println("Duration in Years : "+diff.getYears());
	}
}

public class Excersice_3_4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Date-1 Day : ");
		int day1 = input.nextInt();
		System.out.print("Enter the Date-1 Month : ");
		int month1 = input.nextInt();
		System.out.print("Enter the Date-1 year : ");
		int year1 = input.nextInt();
		
		System.out.print("Enter the Date-2 Day : ");
		int day2 = input.nextInt();
		System.out.print("Enter the Date-2 Month : ");
		int month2 = input.nextInt();
		System.out.print("Enter the Date-2 year : ");
		int year2 = input.nextInt();
		DateCal dc = new DateCal();
		
		System.err.println("Calulated duration below : ");
		dc.Duration(day1,month1,year1,day2,month2,year2);
	}

}


/** OUTPUT :
 * 
 *Enter the Date-1 Day : 23
  Enter the Date-1 Month : 08
  Enter the Date-1 year : 2000
  Enter the Date-2 Day : 27
  Enter the Date-2 Month : 05
  Enter the Date-2 year : 2030
  Calulated duration below : 
  Duration in Days : 4
  Duration in Months : 9
  Duration in Years : 29  
 *  
 *  
 **/
