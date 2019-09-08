package AtulS;

//print the absolute difference between two numbers i.e. |N−M|
class AbsDiff
{
	int absolutediff(int x, int y)
	{
		int diff = 0;
		diff = x - y;
		if(diff<0)
			diff = diff * (-1);
		return diff;
	}
	
	public static void main(String a[])
	{
		AbsDiff diff = new AbsDiff();
		System.out.println("Difference between two given numbers is : " + diff.absolutediff(5,10));
	}
}