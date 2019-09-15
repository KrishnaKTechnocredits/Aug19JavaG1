package SnehalW;
//7) You are given two numbers N and M, print the absolute difference between two numbers i.e. |N−M|
class AbsoluteDiff
{
	int n,m,diff=0,absdiff;
	
	int difference(int n,int m)
	{	
		for(int i=0;i<n;i++)
		{
			diff=n-m;
		}
		if(diff<0)
		{
			absdiff = diff*(-1);
		}
		return absdiff;
	}
	public static void main(String a[])
	{
		AbsoluteDiff absolutediff = new AbsoluteDiff();
		int diff = absolutediff.difference(2,7);			
		System.out.println("The Absolute difference of two integers is : " +diff);
	}
}
