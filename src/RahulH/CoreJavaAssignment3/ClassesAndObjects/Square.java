package RahulH.CoreJavaAssignment3.ClassesAndObjects;

public class Square {
	
	int side;
	
	protected Square(int side)
	{
		findSquare(side);
	}
	
	protected void findSquare(int side)
	{
		int area = side*side;
		System.out.println("The are f square is: " +area);
	}
}
