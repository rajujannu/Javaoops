package freshjava;

public class Doublep {

	String name;
	int age;

	Doublep(String name, int age) { // parameters constructor with global variable and Local variable is same 
                                    // initialization the local variable use the [this.variable name]
		System.out.println(name);  

		this.age = age;
		System.out.println(this.age);

		// System.out.println(this.age=age);

	}

	public static void main(String[] args) {

		Doublep qaz = new Doublep("Raju", 25);
		Doublep eaz = new Doublep("aju", 21);

	}

}
