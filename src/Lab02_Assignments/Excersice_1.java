package Lab02_Assignments;

import java.util.Collections;
import java.util.*;

class Test{
	public int getSecondSmallest(int[] arr) {
		List<Integer>lst = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			lst.add(arr[i]);
		}
		Collections.sort(lst);
		return lst.get(1);
	}
}

public class Excersice_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int size = sc.nextInt();
        int[] arr  = new int[size];
        
        for(int i=0;i<size;i++) {
        	System.out.print("Enter "+i+" index element : ");
        	arr[i] = sc.nextInt();
        }
        Test t = new Test();
        System.out.println("Second Smallest element in given array is : "+t.getSecondSmallest(arr));
	}

}
