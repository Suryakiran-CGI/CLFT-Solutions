package Lab02_Assignments;

class Person {

	private String fname;
	private String Lname;
	private char gender;

	public Person() {
		this.fname = "Surya";
		this.Lname = "Kiran";
		this.gender = 'M';
		
		System.out.println("Initiating default Constructor Values...");
	}

	public Person(String fname, String Lname, char gender) {
		this.fname = fname;
		this.Lname = Lname;
		this.gender = gender;
		
		System.out.println("Initiating Parameterized Constructor Values...");
	}

	public void showInfo() {

		System.out.println("Calling default method...\n");

		System.out.println("First Name : " +this.fname);
		System.out.println("Last Name : " + this.Lname);
		System.out.println("Gender : " + this.gender);

	}

	public void showInfo(String fname, String Lname, char gender) {

		System.out.println("Calling Parameterized method...\n");

		System.out.println("First Name : " + fname);
		System.out.println("Last Name : " + Lname);
		System.out.println("Gender : " + gender);

	}
	
}

public class Excersice_2_3_a {

	public static void main(String[] args) {

		//(a)
		Person p = new Person("Kalyan","Amara",'M');
		p.showInfo();
		
		
	}

}
