package freshjava;

class A1 {
	static void m1() {
		int a = 10;
		int b = 11;
		System.out.println(a + b);
	}

	void m2() {
		int c = 12;
		int d = 15;
		System.out.println(c + d);
	}
}

public class Staticandnonstaticin_one_class {

	static void m3() {
		int e = 15;
		int f = 5;
		System.out.println(e - f);
	}

	void m4() {
		int g = 7;
		int h = 3;
		System.out.println(g + h);
	}

	public static void main(String[] args) {
		A1.m1();
		A1 zobj = new A1();
		zobj.m2();
		Staticandnonstaticin_one_class.m3();
		Staticandnonstaticin_one_class xobj = new Staticandnonstaticin_one_class();
		xobj.m4();

	}

}
