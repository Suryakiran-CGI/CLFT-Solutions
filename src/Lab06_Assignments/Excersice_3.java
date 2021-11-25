package Lab06_Assignments;

import java.util.*;

class CollectionDemo3{
	
	public Map<Integer,Integer> getSquares(int[] arr){
		
		Map<Integer,Integer> hMap = new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++) {
			hMap.put(arr[i], (int) Math.pow(arr[i], 2));
		}
		
		return hMap;
	}
}


public class Excersice_3 {

	public static void main(String[] args) {
		
		CollectionDemo3 cd = new CollectionDemo3();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Size of Array : ");
		int Size = sc.nextInt();
		int[] arr = new int[Size];
		
		for(int i=0;i<Size;i++) {
			System.out.print("Enter "+i+"-th element of Array : ");
			arr[i] = sc.nextInt();
		}
		
		System.err.println("Squares of Array : "+cd.getSquares(arr));
	}

}



/**OUTPUT : 
 * 
 * Enter the Size of Array : 5
   Enter 0 th element of Array : 5
   Enter 1 th element of Array : 4
   Enter 2 th element of Array : 3
   Enter 3 th element of Array : 2
   Enter 4 th element of Array : 1
   Squares of Array : {1=1, 2=4, 3=9, 4=16, 5=25}
 * 
 * 
 **/
