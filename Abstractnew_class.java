package freshjava;

class k implements smg { // method name and constructor as same so that is method override 

	@Override
	public void a() {

		double a1 = 10.2;
		System.out.println(a1);
	}
	@Override
	public void b() {
		int a2 = 143;
		System.out.println(a2);

	}

	@Override
	public void c() {
		char a3 = 'm';
		System.out.println(a3);
	}

	@Override
	public void d() {
		long a4 = 1472;
		System.out.println(a4);
	}

}
public class Abstractnew_class {

	public static void main(String[] args) {
		
	smg qaz=new k();
	qaz.a();
	qaz.b();
	qaz.c();
	qaz.d();

	}

}
