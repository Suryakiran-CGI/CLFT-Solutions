package Lab06_Assignments;

import java.util.*;

class CollectionDemo5{
	
	public int getSecondSmallest(int[] arr) {
		
		Arrays.sort(arr);
		return arr[1];
	}
}

public class Excersice_5 {

	public static void main(String[] args) {
		
		CollectionDemo5 cd = new CollectionDemo5();
		Scanner sc = new Scanner(System.in);
		
		System.err.print("Enter the Size of Array : ");
		int Size = sc.nextInt();
		int[] arr = new int[Size];
		
		for(int i=0;i<Size;i++) {
			System.err.print("Enter "+i+"-th element of Array : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Second Smallest of given Array is : "+cd.getSecondSmallest(arr));
	}

}


/**OUTPUT : 
 * 
 * Enter the Size of Array : 5
   Enter 0 th element of Array : -23
   Enter 1 th element of Array : -12
   Enter 2 th element of Array : 12
   Enter 3 th element of Array : 21
   Enter 4 th element of Array : 100
   Second Smallest of given Array is : -12

 * **/
