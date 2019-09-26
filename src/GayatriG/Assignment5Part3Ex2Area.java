/*Create a class Area to find the area of Square, Rectangle and Circle by creating area() method . 
 * Using overloading concept here
*/
package GayatriG;

public class Assignment5Part3Ex2Area {
	double area ;
	String name;
	
	Assignment5Part3Ex2Area(int a){
	this.area=a*a;
	this.name="Square";
	}
	
	Assignment5Part3Ex2Area(float l, float b){
		this.area=l*b;
		this.name="Rectangle";
	}
	
	Assignment5Part3Ex2Area(float  r){
		this.area=3.14*r*r;
		this.name="Circle";
	}
	
	void display(){
		System.out.println("Area is "+area);
	}
	
	public static void main(String[] args) {
		Assignment5Part3Ex2Area area=new Assignment5Part3Ex2Area(4);      //constructor overloading
		area.display();
	}
}
