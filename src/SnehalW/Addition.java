package SnehalW;

/*6. Create a class Addition and write add method for:
a) add two integers
b) add two decimal
c) add two String*/
public class Addition {
	int addinteger;
	double adddecimal;
	String addstring;

	void addinteger(int x, int y) {
		addinteger = x + y;
		System.out.println("Addition of two integer is :" + addinteger);
	}

	void adddecimal(double p, double q) {
		adddecimal = p + q;
		System.out.println("Addition of two Decimal is :" + adddecimal);
	}

	void addstring(String a, String b) {
		addstring = a + b;
		System.out.println("Addition of two Stirng is : " + addstring);
	}

	public static void main(String[] args) {
		Addition addition = new Addition();
		addition.addinteger(4, 5);
		addition.adddecimal(2.5, 3.5);
		addition.addstring("Snehal", "Wayakole");
	}

}
