package SnehalW;
/*
 4)	WAP to find sum of user given number.:return answer:answer print in main()
a.	Input:- 159753
b.	Sum of given number:- 30
* */
public class SumOfNumber_A3_4 {
	static int sum;
	int num = 159753; 
	
	int  sumofnumber()
	{
		while (num>0)
		{
			int rem  = num%10;
			sum = sum + rem;
			num = num/10;
		}
	 return sum;		
	}
	public static void main(String[] args) {
		
		SumOfNumber_A3_4 sumofnumber_A3_4 = new SumOfNumber_A3_4();
		sumofnumber_A3_4.sumofnumber();
		System.out.println("The sum of given number is : " + sum);		
	}

}
