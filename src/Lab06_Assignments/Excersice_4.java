package Lab06_Assignments;

import java.util.*;

class CollectionDemo4{
	
	public HashMap<Integer, String> getStudents(HashMap hm){
		
		ArrayList<Integer> marks = new ArrayList<Integer>(hm.values());
		ArrayList<Integer> Rollno = new ArrayList<Integer>(hm.keySet());
		
		HashMap<Integer, String> mp = new HashMap<Integer,String>();
		String[] medals = new String[Rollno.size()];
		
		for(int i=0;i<marks.size();i++) {
			
			if(marks.get(i)>=90) 
			{
				medals[i] = "GOLD";
				
			}else if(marks.get(i)>=80 && marks.get(i)<=90) {
				medals[i] = "SILVER";
			}
			else {
				medals[i] = "BRONZE";
			}
			
			mp.put(Rollno.get(i),medals[i]);
		}
		
		return mp;
	}
}

public class Excersice_4 {

	public static void main(String[] args) {
		
		CollectionDemo4 cd = new CollectionDemo4();
		Scanner sc  = new Scanner(System.in);
		HashMap<Integer, Integer> mp = new HashMap<Integer,Integer>();
		
		int num,rollno,marks;
		System.err.print("Enter Number of Student's : ");
		num = sc.nextInt();
		
		for(int i=0;i<num;i++) {
			System.err.print("Enter Student Roll no : ");
			rollno = sc.nextInt();
			System.err.print("Enter Student R.no :-"+rollno+" marks : ");
			marks = sc.nextInt();
			
			mp.put(rollno, marks);
		}
		
//		mp.put(121, 90);
//		mp.put(122,87);
//		mp.put(123,67);
		System.out.println("Winner's Details : "+cd.getStudents(mp));
	}

}


/**OUTPUT : 
 * 
 *  Enter Number of Student's : 3
    Enter Student Roll no : 121
    Enter Student-121 marks : 90
    Enter Student Roll no : 122
    Enter Student-122 marks : 82
    Enter Student Roll no : 123
    Enter Student-123 marks : 60
    Winner's Details : {121=GOLD, 122=SILVER, 123=BRONZE}
 * 
 * 
**/
