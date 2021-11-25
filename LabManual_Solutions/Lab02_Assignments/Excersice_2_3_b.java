package Lab02_Assignments;

class Person1 {

	private String fname;
	private String Lname;
	private char gender;

	public Person1() {
		this.fname = "Surya";
		this.Lname = "Kiran";
		this.gender = 'M';

		System.out.println("Initiating default Constructor Values...");
	}

	public Person1(String fname, String Lname, char gender) {
		this.fname = fname;
		this.Lname = Lname;
		this.gender = gender;

		System.out.println("Initiating Parameterized Constructor Values...");
	}

	public void showInfo() {

		System.out.println("Calling default method...\n");

		System.out.println("First Name : " + getFname());
		System.out.println("Last Name : " + getLname());
		System.out.println("Gender : " + getGender());

	}

	public void showInfo(String fname, String Lname, char gender) {

		System.out.println("Calling Parameterized method...\n");

		System.out.println("First Name : " + getFname());
		System.out.println("Last Name : " + getLname());
		System.out.println("Gender : " + getGender());

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

}

public class Excersice_2_3_b {

	public static void main(String[] args) {

        //(b)
		Person1 p = new Person1();
		p.setFname("Amaranath");
		p.setGender('M');
		p.setLname("Kalyan");
		p.showInfo();;
	}

}
