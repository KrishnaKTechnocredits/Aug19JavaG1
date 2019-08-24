package SnehalW;
//package loopExamples;

public class PrimeCheck
{
	static void isPrime(int start, int end)
	{
		int sum=0,count1=0,avg=0;
		for(int number=start;number<=end;number++)
		{
			 int count = 0;
			 for(int i=2;i<=number/2;i++)//Max number should be run till : number /2(if number 16 then it should be run until 16/2= means till 8)
			 {
				 if(number%i==0)
				 {
					 count=1;
					 //System.out.println(number + " is not prime number ");
					 break;
				 }
			 }
			 if(count==0)
			 {
				 //System.out.println(number  +" is prime number");
				 count1++;
				 sum = sum + number;
				 avg = sum / count1;
			 }
		}
		System.out.println("Sum of all prime number : " +sum);
		//System.out.println("count of all prime number : " +count1);
		System.out.println("From " +start+ " to "+ end +" total prime numbers are " +count1);
		System.out.println("Average  of all prime number : " +avg);
}	
	public static void main(String[] args) 
	{
		isPrime(2,100);		
	}
}
