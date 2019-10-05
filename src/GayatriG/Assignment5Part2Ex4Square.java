/*Create a Square class with field side, one parameterized constructor which accept side value 
 Write a method to find the area of a square. Write a TestSquareClass to verify Square class functionality. 
NOTE :  square method should not take any parameter, constructor should set side value in instance variable 
and square method should use that instance variable.  
(area=side*side
*/
package GayatriG;

public class Assignment5Part2Ex4Square {
	int side;

	public Assignment5Part2Ex4Square(int d) {
		this.side = d;
	}

	double areaOfSquare() {
		double area = side * side;
		return area;
	}
}
