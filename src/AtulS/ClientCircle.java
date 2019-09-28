//Create a Circle class with fields radius as float Initialize the radius through method
package AtulS;

public class ClientCircle {

	public static void main(String[] args) {
		Circle obj = new Circle();
		obj.initialise(3);
		System.out.println(obj.area());
		System.out.println(obj.circumference());
	}

}
