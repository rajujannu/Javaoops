package freshjava;

class Persson {
	private int age;

	void setage(int age) {    
		if (age < 0)
			this.age = 0;  
		else if (age > 100)
			this.age = 100;
		else
			this.age = age;

	}

	int getage() {
		return age;
	}
}

public class Encapsulations {
	public static void main(String[] args) {

		Persson qa = new Persson();
		qa.setage(25);
		int x = qa.getage();
		System.out.println(x);
	}

}
