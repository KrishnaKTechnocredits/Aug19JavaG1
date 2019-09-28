//Create a Square class with field side, one parameterized constructor which accept side value
package AtulS;

public class Square {
	double side;

	Square(double side) {
		this.side = side;
	}

	protected double calculateArea() {
		return side * side;
	}

}
