package Lab02_Assignments;

class Checker{
	
	private int num;

	public Checker() {
		this.num = -10;
		System.out.println("Initiating default Constructor Values...");
	}
	
	public Checker(int x) {
		this.num = x;
		System.out.println("Initiating Parameterized Constructor Values...");
	}
	
	public void checkNumber() {

		System.out.println("Calling default Method...\n");
		if (this.num > 0) {
			System.out.println(this.num + " is a positive number");
		} else {
			System.out.println(this.num + " is a neagtive number");
		}

	}
	
	public void checkNumber(int x) {
		
		System.out.println("Calling parameterized Method...\n");
		
			if(x > 0) {
				System.out.println(x+" is a positive number");
			}else {
				System.out.println(x+" is a neagtive number");
			}

	}
}


public class Excersice_2_2 {

	public static void main(String[] args) {

//		Checker c = new Checker();
//		c.checkNumber();
		Checker c = new Checker();
		c.checkNumber(23);
	}

}
