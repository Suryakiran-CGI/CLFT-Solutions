package Lab01_Assignments;
import java.util.*;

/*
public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
*/


/*Non Recursive Solution*/
//import java.util.Scanner;
//public class Lab3{
//	public static void main(String args[ ]) {
//		Scanner input=new Scanner(System.in);
//		int i,a=1,b=1,c=0,t;
//		System.out.print("Enter the value :");
//		t=input.nextInt();
//		for(i=0;i<t-2;i++) {
//			c=a+b;
//			a=b;
//			b=c;
//		}
//		System.out.print(t+"th value of Fibonacci series is: "+c);
//	}
//}


/* Recursive Solution*/

import java.io.*;
import java.lang.*;
class RecursiveFibonacci{
	int fib(int n) {
		if(n==1)
			return (1);
		else if(n==2)
			return (1);
		else
			return (fib(n-1)+fib(n-2));
	}
}
public class Excersice_3 {
	public static void main(String args[])throws IOException {
		InputStreamReader obj=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(obj);
		System.out.print("Enter the number : ");
		int n=Integer.parseInt(br.readLine());
		RecursiveFibonacci ob=new RecursiveFibonacci();
		int res=0;
		for(int i=1;i<=n;i++) {
			res=ob.fib(i);
			System.out.println(" "+res);
		}
		System.out.println();
		System.out.println(n+"th value of Fibonacci series is : "+res);
	}
}