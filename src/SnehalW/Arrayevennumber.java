package SnehalW;
//14) WAP to print even number from the array
public class Arrayevennumber {

	public static void main(String[] args) {
		int a[] = {15, 24, 52, 49, 62, 10};
		System.out.println("The Even numbers in the array are : ");
		for (int i =0; i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(+a[i]);
			}
		}

	}

}
