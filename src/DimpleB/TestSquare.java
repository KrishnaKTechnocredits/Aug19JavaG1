/*
 Create a Square class with field side, one parameterized constructor which accept side value . Write a method to find the area of a square. Write a TestSquareClass to verify Square class functionality.
NOTE : square method should not take any parameter, constructor should set side value in instance variable and square method should use that instance variable.
(area=side*side)
 */
package DimpleB;

public class TestSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square c=new Square((float) 15.1);
		c.calculatearea();
		c.display();
	}
}
