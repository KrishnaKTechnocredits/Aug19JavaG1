package ManojN.Manoj_Assignment5_OOPS;

public class Q4_Square {
	int side;
	Q4_Square(int s){
		side = s;
	}
	double area(){
		double area = Math.pow(side, 2);
		return area;
	}
}
