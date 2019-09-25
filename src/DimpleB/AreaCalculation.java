
/*Create a class Area to find the area of Square, Rectangle and Circle by creating area() method . Using overloading concept here.*/
package overloadingconceptassignment;

public class AreaCalculation {

	double radius;
	double length=0.0;
	double width=0.0;
	double totalarea= 0.0;
	double pi=3.14;
	String shape="";
	
	public void area(float radius,String shape)
	{
		if(radius>0&(shape!=""||shape!=null))
		{
			this.shape=shape;
			this.totalarea=pi*radius*radius;
		}
		else
			System.out.println("Oops..Something went wrong!");
	}
	
	public void area(double length,double width,String shape)
	{
		if(length>0 &width>0 &(shape!=""||shape!=null))
		{
			this.shape=shape;
			this.totalarea=length*width;
		}
		else
			System.out.println("Oops..Something went wrong!");
	}
	public void area(double length,String shape)
	{
		if(length>0 &(shape!=""||shape!=null))
		{
			this.shape=shape;
			this.totalarea=length*length;
		}
		else
			System.out.println("Oops..Something went wrong!");
	}

	public void displayinfo()
	{
		if((length>0 ||width>0 ||radius>0)&(shape!=""||shape!=null))
		{
			System.out.println("Area of "+this.shape+" is equal to "+this.totalarea+" (centimeter*centimeter)");
		}
		else
			System.out.println("Try Again!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaCalculation a=new AreaCalculation();
		a.area(2.4, "Circle");
		a.displayinfo();
		a.area(4.8, "Square");
		a.displayinfo();
		a.area(5.5, 7, "Rectangle");
		a.displayinfo();
		
	}

}
