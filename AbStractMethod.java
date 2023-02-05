package freshjava;

    abstract class Ntg {
	abstract void msg(); // In abstract class you declare the method. write the business logic in other class 
                                                               // class to class    =extends 
	void love() {                                             // class to interface =Not possible 
		int a = 143;                                         //  interface to class =implements 
		System.out.print("Buji  "); 	                    //interface to interface=extends
		System.out.print(a);
	}
}

class Buji extends Ntg {

	void msg() {
		System.out.print("'S   Raju");

	}

}

public class AbStractMethod {
	public static void main(String[] args) {
		Buji qwe = new Buji(); 
		qwe.love();
		qwe.msg();

	}

}
