/*
 Create a Circle class with fields radius as float Initialize the radius through method .
 Also create separate method to calculate Area and Circumference of a Circle.
 Create another class as ClientCircle and call the respective methods.
 */
package VarshaT;

public class Circle1 {
	private float radius;
	Circle1(float radius)
	{
		this.radius= radius;
	}
	void area()
	{
		System.out.println("Area:= "+(3.14*radius*radius));
	}
	void circumf()
	{
		System.out.println("Circumference:= "+(2*3.14*radius));
	}

}
