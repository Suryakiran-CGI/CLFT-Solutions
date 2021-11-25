package Lab02_Assignments;


enum Gender{
	//M - > MALE
	//F - >  FEMALE
	M,F;
}

class Person3 {

	private String fname;
	private String Lname;
	private Gender gender;
	private int phoneNo;

	public Person3() {
		this.fname = "";
		this.Lname = "";
		this.gender = null;
		this.phoneNo = 0;

		System.out.println("Initiating default Constructor Values...");
	}

	public Person3(String fname, String Lname, Gender gender,int phoneNo) {
		this.fname = fname;
		this.Lname = Lname;
		this.gender = gender;
		this.phoneNo = phoneNo;

		System.out.println("Initiating Parameterized Constructor Values...");
	}

	public void PersonalDetails() {

		System.out.println("Calling default method...\n");
		System.out.println("Personal Details : ");

		System.out.println("\t"+"First Name : " + getFname());
		System.out.println("\t"+"Last Name : " + getLname());
		System.out.println("\t"+"Gender : " + getGender());
		System.out.println("\t"+"Phone Number : " + getPhoneNo() );

	}

	public void PersonalDetails(String fname, String Lname, char gender) {

		System.out.println("Calling Parameterized method...\n");
		System.out.println("Personal Details : ");
		
		System.out.println("\t"+"First Name : " + getFname());
		System.out.println("\t"+"Last Name : " + getLname());
		System.out.println("\t"+"Gender : " + getGender());
		System.out.println("\t"+"Phone Number : " + getPhoneNo() );
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void setGender(char c) {
		
			switch(c) {
			
			    case 'M' :
			    	setGender(Gender.M);
			    	break;
			    case 'F' :
			    	setGender(Gender.F);
			    	break;
			    default :
			    	System.out.println("Error! Enter valid Gender...");
			    	break;
			
			}
		
	}

}

public class Excersice_2_5 {

	public static void main(String[] args) {

		Person3 p = new Person3();
		p.setFname("Ajay");
		p.setGender('M'); // - > (101)
		p.setLname("Kumar");
		p.setPhoneNo(986745321);
		p.PersonalDetails();;
	}

}
