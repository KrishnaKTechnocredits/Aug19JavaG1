package RahulH.CoreJavaAssignment3.UsingOverloadingConceptHere;

public class Area {
	
	void square(int area)
	{
		int areaSquare = area * area;
		System.out.println("Area of square is: " + areaSquare);
	}

	void rectangle(int length, int breadth )
	{
		int areaRectangle = length * breadth;
		System.out.println("Area of Rectangle: " + areaRectangle);
	}
	
	void circle(double radius)
	{
		double areaCircle = 3.14 * radius * radius;
		System.out.println("Area of circle: " + areaCircle);
	}
}

