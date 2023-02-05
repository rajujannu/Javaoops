package freshjava;
//constructor default
class Abc {
	int a; //instance variable or also called as Non-static global variable 

	Abc() { // No arguments or Default  
		a = 10;// it's a local variable with in the method. Local variable always Non-static variable 
		System.out.println(a);

	}
	public static void main(String[] args) {

		Abc qaz = new Abc(); // It's a default constructor ()
		Abc wsx = new Abc();

	}

}
