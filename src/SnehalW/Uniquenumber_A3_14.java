package SnehalW;
/*14)	WAP to find unique number from given array store that numbers in new array. 
a.	firstArray:- {1,2,3,4,2,5}
b.	secondArray:- {5,6,7,8,9,7}
c.	unique array = {1,2,3,4,5,6,7,8,9}
i.	order can be anything 
*/
public class Uniquenumber_A3_14 {

	static int index =0;
	static int[] getUniqueArray()
	{
		int[] num1 = {1,2,3,4,2,5};
		int[] num2 = {5,6,7,8,9,7};
		int[] outArray = new int[num1.length+num2.length];

		for(int i=0;i<num1.length;i++)
		{
			boolean flag = false;
			for(int j=0;j<index;j++)
			{
				if(num1[i] == outArray[j])
				{
					flag = true;
					break;
				}
			}
			if(flag == false)
			{
				outArray[index] = num1[i];
				index++;
			}
		}
		
		for(int i=0;i<num2.length;i++)
		{
			boolean flag = false;
			for(int j=0;j<outArray.length;j++)
			{
				if(num2[i] == outArray[j])
				{
					flag = true;
					break;
				}
			}
			if(flag == false)
			{
				outArray[index] = num2[i];
				index++;
			}
		}
		
		return outArray;		
 	}
	public static void main(String[] args) {
		int[] x = getUniqueArray();
		
		for(int i=0;i<index;i++)
		{
			System.out.println(x[i]);
		}
	}
}
