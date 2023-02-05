package freshjava;

public class Abcd {
	int x = 10; //Non-Static or instance variables 

	Abcd(String x) { // Parameters Constructor ( x is local variable
		
		System.out.println(x);
		System.out.println(this.x); // Local variable and global is same. So you call to instance variable use this keyword
 
	}

	public static void main(String[] args) {
		Abcd wsw = new Abcd("Raju");
		Abcd qaq = new Abcd("udaya");
		Abcd qaz = new Abcd("fijhb");

	}

}
