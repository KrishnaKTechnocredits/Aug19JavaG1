package SnehalW;
/*1. Create a Circle class with fields radius as float Initialize the radius through method .
 Also create separate method to calculate Area and Circumference of a Circle.
  Create another class as ClientCircle and call the respective methods.*/
public class Circle {
static float radius;
		void calculateArea(float radius)
		{
			double Areacircle = 3.4 * radius * radius;
			System.out.println(Areacircle);
		}
		void calculateCircumference(float radius)
		{
			double Areacircle = 2* 3.4 *  radius;
			System.out.println(Areacircle);
		}
	}

