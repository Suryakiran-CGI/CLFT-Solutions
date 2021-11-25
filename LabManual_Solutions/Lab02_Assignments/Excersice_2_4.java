package Lab02_Assignments;

class Person2 {

	private String fname;
	private String Lname;
	private char gender;
	private int phoneNo;

	public Person2() {
		this.fname = "Surya";
		this.Lname = "Kiran";
		this.gender = 'M';
		this.phoneNo = 987654321;

		System.out.println("Initiating default Constructor Values...");
	}

	public Person2(String fname, String Lname, char gender,int phoneNo) {
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

}

public class Excersice_2_4 {

	public static void main(String[] args) {

        
		Person2 p = new Person2();
		p.setFname("Ajay");
		p.setGender('M');
		p.setLname("Kumar");
		p.setPhoneNo(986745321);
		p.PersonalDetails();;
	}

}
