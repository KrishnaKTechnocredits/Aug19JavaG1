//Create a class Area to find the area of Square, Rectangle and Circle by creating area() method
package AtulS;

public class DifferentAreas {
	public double area(double radius) {
		return 3.14 * radius * radius;
	}

	public double area(double len, double breadth) {
		return len * breadth;
	}

	public int area(int radius) {
		return radius * radius;
	}

	public static void main(String[] args) {
		DifferentAreas obj = new DifferentAreas();
		System.out.println(obj.area(25.4));
		System.out.println(obj.area(15, 15));
		System.out.println(obj.area(5));
	}

}
