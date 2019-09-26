/*
 Create a Circle class with fields radius as float Initialize the radius through method .Also create separate method to calculate Area and Circumference of a Circle. Create another class as ClientCircle and call the respective methods.
 */
package DimpleB;
public class CircleClient {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle((float) 10.2);
		c.calculateareacircumference();
		c.display();
	}
}
