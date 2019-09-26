/*
 Create a Square class with field side, one parameterized constructor which accept side value . Write a method to find the area of a square. Write a TestSquareClass to verify Square class functionality.
NOTE : square method should not take any parameter, constructor should set side value in instance variable and square method should use that instance variable.
(area=side*side)
 */

package DimpleB;

public class Square {
	private float side;
	
	private float area;

	Square(float s)
	{
		if(s>0)
			this.side=s;
	}
	void calculatearea()
	{
		area=side*side;
		
	}
	void display()
	{
		if(area>0 & side>0)
			System.out.println("Area of square is equal to "+area+" (centimeter*centimeter)");
		else
			System.out.println("Something went wrong");
	}
}
