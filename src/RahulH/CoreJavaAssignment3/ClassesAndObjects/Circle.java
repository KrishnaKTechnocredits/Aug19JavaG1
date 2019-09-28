package RahulH.CoreJavaAssignment3.ClassesAndObjects;

public class Circle {
	
	float radius;
	
	private void initialise()
	{
		radius = 20;
	}
	
	void CalculateArea()
	{
		initialise();
		double area = 3.14 *radius*radius;
		System.out.println("The area of circle is: "+area);
	}
}
