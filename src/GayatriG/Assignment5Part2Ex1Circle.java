//Create a Circle class with fields radius as float Initialize the radius through method .
//Also create separate method to calculate Area and Circumference of a Circle. 
//Create another class as ClientCircle and call the respective methods. 

package GayatriG;

public class Assignment5Part2Ex1Circle {
	float radius;
	
	double areaOfCircle(float rad){
		radius=rad;
		double area=3.14*radius*radius;
		return area;
	}
	
	double circumferenceOfCircle(float rad){
		radius=rad;
		double circumference=2*3.14*radius;
		return circumference;
	}

}
