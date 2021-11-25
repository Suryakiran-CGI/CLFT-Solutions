package Lab05_Assignments;

import java.util.*;
import com.cg.eis.exception.EmployeeException;


public class Excersice_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter salary of the Employee : ");
		int salary = sc.nextInt();
		
		try {
			if(salary < 3000) {
				throw new EmployeeException("Sorry! Salary entry should be above 3000...");
			}
			else {
				System.out.println("Entered Salary is : "+salary);
			}
		}
		catch(EmployeeException e) {
			System.out.println(e);
		}
	}

}
