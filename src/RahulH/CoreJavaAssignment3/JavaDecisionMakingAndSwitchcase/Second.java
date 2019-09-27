package coreJavaAssignment3;

public class Second {
	
	int max;
	
	void maxNo(int num1, int num2)
	{
		max = num1>num2? num1:num2;
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		
		Second s = new Second();
		s.maxNo(30, 40);
	}
}
