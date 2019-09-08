package Hemali;


public class Program7 {
	
		void absoluteDiff(int a,int b)
		{
			int diff=a-b;
			if(diff>0)
			{
				System.out.println("Absolute difference between two numbers "+a+" and "+b+" is : "+diff);
			}
			else
			{
				diff=diff*(-1);
				System.out.println("Absolute difference between two numbers "+a+" and "+b+" is : "+diff);
			}
		}
		public static void main(String args[])
		{ 
			
			new Program7().absoluteDiff(19,22);
		}
	}


