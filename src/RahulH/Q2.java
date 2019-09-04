package assignment_2;

public class Q2 {
	
	int dup[] = {0, 3, 1, 2, 3};
	boolean flag = true;
	

	void duplicate()
	{
		for (int i=0; i<dup.length; i++)
		{
			for (int j=i+1; j<dup.length; j++)
			{
				if (dup[i] == dup[j])
				{
					flag = false;
					System.out.println("The duplicate number is: " +dup[i]);
				}
			}
		}
		if (flag == true)
		{
			System.out.println("There is no duplicate number");
		}
	}
	
	public static void main(String[] args) {
		
		new Q2().duplicate();	
	}
}
