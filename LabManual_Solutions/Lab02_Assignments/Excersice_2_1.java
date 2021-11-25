package Lab02_Assignments;

class Persn {

	private static String fname;
	private static String Lname;
	private static char gender;
	private static double weight;
	private static int age;

	public Persn(String fname, String Lname, char gender,int age, double weight) {
		Persn.fname = fname;
		Persn.Lname = Lname;
		Persn.gender = gender;
		Persn.age = age;
		Persn.weight = weight;
	}

	public Persn() {
		Persn.fname = "Surya";
		Persn.Lname = "Kiran";
		Persn.gender = 'M';
		Persn.age = 22;
		Persn.weight = 75.23;
	}

	public void info() {

		System.out.println("First Name : " + Persn.fname);
		System.out.println("Last Name : " + Persn.Lname);
		System.out.println("Gender : " + Persn.gender);
		System.out.println("Age : " +Persn.age);
		System.out.println("Weight : " + Persn.weight);
	}

	public void info(String fname, String Lname, char gender, double weight) {

		System.out.println("First Name : " +fname);
		System.out.println("Last Name : " +Lname);
		System.out.println("Gender : " +gender);
		System.out.println("Age : " + age);
		System.out.println("Weight : " +weight);
	}
}

public class Excersice_2_1 {

	public static void main(String[] args) {

		//Persn p = new Persn();
		Persn p = new Persn("Divya","Bharathi",'F',20,65.55);
		p.info();
	}

}
