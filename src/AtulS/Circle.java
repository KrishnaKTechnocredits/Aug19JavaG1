//Create a Circle class with fields radius as float Initialize the radius through method
package AtulS;

public class Circle {
	float radius;

	void initialise(float radius) {
		this.radius = radius;
	}

	double area() {
		return 3.14 * radius * radius;
	}

	double circumference() {
		return 2 * 3.14 * radius;
	}
}
