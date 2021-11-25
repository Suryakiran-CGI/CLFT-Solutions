package Lab06_Assignments;

import java.util.*;

class CollectionDemo7{
	
	public static int reverseNum(int x) {
		
		int digit;
		String num="";
		
		while(x>0) {
			digit = x % 10;
			num += digit;
			x /= 10;
		}
		int res = Integer.parseInt(num);
		
		return res;
	}
	
	public int[] getSorted(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = reverseNum(arr[i]);
		}
		
		Arrays.sort(arr);
		return arr;
	}
}

public class Excersice_7 {

	public static void main(String[] args) {
		
        CollectionDemo7 cd = new CollectionDemo7();
        Scanner sc = new Scanner(System.in);
        
        System.err.print("Enter the Size of Array : ");
		int Size = sc.nextInt();
		int[] arr = new int[Size];
		
		for(int i=0;i<Size;i++) {
			System.err.print("Enter "+i+"-th element of Array : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Resulting Reverse Sort of Array : ");
		for(int i : cd.getSorted(arr)) {
			System.out.print(i+" ");
		}
		
	}

}


/**
 * OUTPUT : 
 * 
 * Enter the Size of Array : 5
   Enter 0 th element of Array : 2
   Enter 1 th element of Array : 12
   Enter 2 th element of Array : 24
   Enter 3 th element of Array : 36
   Enter 4 th element of Array : 48
   Resulting Reverse Sort of Array : 2 21 42 63 84  
 * 
 **/
