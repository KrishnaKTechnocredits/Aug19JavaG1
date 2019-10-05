package ManojN.Manoj_Assignment5_OOPS;

public class Q1_Circle {
	float radius;
		
	void setRadius(float r){
		radius = r;
	}
	double circleArea(){
		double area = 3.14 * (Math.pow(radius, 2));
		return area;
	}
	
	float circumference(){
		float circumference = (float)(2 * 3.14 * radius);
		return circumference;
	}
}
