package ShreyaD;

public class Area {
 
	void calculateArea(float x)
    {
        System.out.println("Area of the square: "+x*x);
    }
    void calculateArea(float x, float y)
    {
        System.out.println("Area of the rectangle: "+x*y);
    }
    void calculateArea(double r)
    {
        double area = 3.14*r*r;
        System.out.println("Area of the circle: "+area);
    }
    public static void main(String args[]){
    	Area obj = new Area();
    	obj.calculateArea(6.1f);
    	obj.calculateArea(10,22);
    	obj.calculateArea(6.1);
     }
}
