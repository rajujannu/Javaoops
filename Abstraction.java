package freshjava;

//using interface class

class R implements smg { // Her using the implements because u initialization  the interface class variables ...

	public void a() {
		int x = 10;
		System.out.println(x);
	}

	
	public void b() {
	    
		String name="Raju";
		System.out.println(name);
		
	}

	@Override
	public void c() {
		int y=12;
		System.out.println(y);
	}

	@Override
	public void d() {
		String no="19";
		System.out.println(no);
		
	}
}
public class Abstraction {

	public static void main(String[] args) {
		
		smg qa=new R();
		qa.a();
		qa.b();
		qa.c();
		qa.d();
		

	}

}
