/*
 Create a Circle class with fields radius as float Initialize the radius through method .Also create separate method to calculate Area and Circumference of a Circle. Create another class as ClientCircle and call the respective methods.
 */
package DimpleB;

public class Circle {

	private float radius;
	float pi=(float) 3.14;
	private float area;
	private float circumference;
	public Circle()
	{
		//default constructor of class circle
	}
	public Circle(float r)
	{
		if(r>=0)
			this.radius=r;
		
	}
	public void calculateareacircumference()
	{
		area=pi*radius*radius;
		circumference=2*pi*radius;
		
	}
	public void display()
	{
		if(radius>0.0  & area>0.0)
		{
			System.out.println("Area of circle is equal to "+area+" (centimeter*centimeter)");
			System.out.println("Circumference of circle is equal to "+circumference+" (centimeter)");
		}
		else
			System.out.println("Something went wrong");
	}
}
