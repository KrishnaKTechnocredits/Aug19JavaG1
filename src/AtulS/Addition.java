//Create a class Addition and write add method for
package AtulS;

public class Addition {

	private int sum(int x,int y)
	{
		return x+y;
	}
	private double sum(double x,double y)
	{
		return x+y;
	}
	private String sum(String x,String y)
	{
		return x+y;
	}
	public static void main(String[] args) {
		Addition obj = new Addition();
		System.out.println(obj.sum(23, 25));
		System.out.println(obj.sum(2.5, 2.654));
		System.out.println(obj.sum("Atul","Shrivastava"));
	}

}
