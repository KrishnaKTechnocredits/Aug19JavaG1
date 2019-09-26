/*
 Create a class Area to find the area of Square, Rectangle and
  Circle by creating area() method . Using overloading concept here. 
 */



package VarshaT;

public class Area {
	
	void area(float radius)
	{
		System.out.println("Area of circle= "+(3.14*radius*radius));
		
	}
	void area(float l, float b)
	{
		System.out.println("Area of reectangle= "+(l*b));
	}
	void area(int side)
	{
		System.out.println("Area of square: "+(side *side));
	}
	public static void main(String[] args) {
		Area area= new Area();
		area.area(12.2f);
		area.area(12.2f,10f);
		area.area(12);

	}

}
