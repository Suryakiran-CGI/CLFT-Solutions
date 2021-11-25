package Lab01_Assignments;

import java.util.*;

class NaturalSum{
	public int calculateSum(int n) {
		int sum=0;
		for(int i=1;i<n+1;i++) {
			if(i%3==0 || i%5==0) {
				sum+=i;
			}
		}
		return(sum);
	}
}

public class Excersice_5 {
	public static void main(String[] args) {
		NaturalSum ns = new NaturalSum();
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the value : ");
		int num = sc.nextInt();
		System.out.println("Sum of "+num+" natural numbers divisible by 3 or 5 is : "+ns.calculateSum(num));
	}

}
