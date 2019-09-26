package SnehalW;

/*Create a Square class with field side, one parameterized constructor which accept side value .
 *  Write a method to find the area of a square. Write a TestSquareClass to verify Square class functionality.
NOTE : square method should not take any parameter, constructor should set side value in instance variable and square method 
should use that instance variable.
(area=side*side)*/
public class Square {
	int side;
	int areasquare;

	Square(int side) {
		this.side = side;
	}

	Square() {
	}

	void calareasquare() {
		areasquare = side * side;
		System.out.println("The area of square is : " + areasquare);
	}

}
