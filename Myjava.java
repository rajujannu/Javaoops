package freshjava;
public class Myjava {

	public static void main(String[] args) {

		String a = "selenium";
		String b = "Testing";
		int x = 100;
		byte y = 20;
		char z = 'A';
		char c = '&';
		boolean d = true;
		double e = 100.5;
		float g = 152.2f;
		short m=12;
		long  k=10;

		String firstName = "John ";
		String lastName = "Doe";
		System.out.println(firstName.concat(lastName));
		System.out.println(firstName + lastName +k +m);

		String txt = "Hello Everybody";
		System.out.println(txt.indexOf("e"));

		int x1 = 5;
		int y1 = 10;
		System.out.println(Math.max(x1, y1));

		int x2 = 10;
		int y2 = 5;
		System.out.println(Math.min(x2, y2));
		
		int x3 = 16;
		System.out.println(Math.sqrt(x3));
//if
		Math.random();
		int x4 = 50;
		int y4 = 10;
		if (x4 > y4) {
		System.out.println("Hello World");
		}
//switch 
		int day = 3;
		switch (day) {
		case 1:
			System.out.println("Saturday");
			break;
		case 2:
			System.out.println("Sunday");
			break;
		case 3:
			System.out.println("monday");
		}
		int day1 = 4;
		switch (day1) {
		case 1:
			System.out.println("Saturday");
			break;
		case 2:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Weekend");
		}
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= 6);
		System.out.println(a + c + b);
		System.out.println(a + b + e);
		System.out.println(x + y);
		System.out.println(y + c);
		System.out.println(x + z);
		System.out.println(x < y);
		System.out.println(x > y);
		System.out.println(e + g);
		System.out.println(a + c + b + x + z + c + (e + g) + c + d);
		System.out.println(c);

	}

}
