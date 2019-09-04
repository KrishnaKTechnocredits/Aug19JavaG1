package RahulH;

public class Q3 {
	
	int nos[] = {2, 5 ,9 ,7, 4, 6};
	int checkNumber = 8;
	int cnt = 0;
	
	void check()
	{
		for (int i=0; i<nos.length; i++)
		{
			if (nos[i] == checkNumber)
			{
				cnt = 1;
				System.out.println("The number is present in the array");
				break;
			}
		}
		if (cnt == 0)
		{
			System.out.println("The number is not present in the array");
		}
	}
		
	public static void main(String[] args) 
	{
		new Q3().check();
	}
}
