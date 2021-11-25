package Lab01_Assignments;
import java.util.*;

class primeSeries{
	public void print(int n) {
		for(int i=2;i<n;i++) {
			int cnt = 0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					cnt = 1;
				}
			}
			if(cnt==0) {
				System.out.print(i+" ");
			}
		}
	}
}

public class Excersice_4 {

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		primeSeries ps = new primeSeries();
		System.out.print("Enter the value : ");
		int num = scan.nextInt();
		System.out.print("Prime numbers below "+num+" are : ");
		ps.print(num);
	}

}
