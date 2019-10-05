package Hemali;

public class A5_Problem1 {
	
	
	void greater(int n1,int n2,int n3)
	{
	if(n1>n2 && n1>n3)
	{
		System.out.println(n1  +" is greater");
	}
	else if(n2>n1 && n2>n3)
	{
		System.out.println(n2  +" is greater");
	}
	else
	{
		System.out.println(n3 +" is greater");
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A5_Problem1 prob1=new A5_Problem1();
		prob1.greater(42, 12, 10);
	}

}
