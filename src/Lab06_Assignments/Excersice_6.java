package Lab06_Assignments;

import java.util.*;


class CollectionsDemo6{
	
	static final int year = 2021;
	
	public List voterList(Map mp) {
		
		ArrayList<Integer> dob = new ArrayList<Integer>(mp.values());
		ArrayList<Integer> Id = new ArrayList<Integer>(mp.keySet());
		
		List<Integer> lst = new ArrayList<>();
		
		for(int i=0;i<Id.size();i++) {
			if((year - dob.get(i)) > 18){
				lst.add(Id.get(i));
			}
//			else {
//				lst.add(-1);
//			}
		}
		
		return lst;
	}
}

public class Excersice_6 {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		CollectionsDemo6 cd = new  CollectionsDemo6();
		Map<Integer,Integer> mp = new HashMap<>();
		
		int num,Id,dateOfBirth;
		System.err.print("Enter Number of Voter's : ");
		num = sc.nextInt();
		
		for(int i=0;i<num;i++) {
			System.err.print("Enter Voter ID no : ");
			Id = sc.nextInt();
			System.err.print("Enter Voter no-"+Id+" 's Birth Year : ");
			dateOfBirth = sc.nextInt();
			
			mp.put(Id,dateOfBirth);
		}
		
	    System.out.println("Eligible VoterID List : "+cd.voterList(mp));
		
	}

}


/**OUTPUT : 
 * 
 *Enter Number of Voter's : 3
  Enter Voter ID no : 101
  Enter Voter no-101 Birth Year : 1998
  Enter Voter ID no : 102
  Enter Voter no-102 Birth Year : 2005
  Enter Voter ID no : 103
  Enter Voter no-103 Birth Year : 1987
  Eligible VoterID List : [101, 103]
 * 
 * 
 **/
