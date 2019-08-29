package SnehalW;

import java.lang.reflect.Array;

public class Arraycommonum {

public static void main(String[] args) {
		
		int array1[] = {1,3,6,9,7};
		int array2[] = {2,5,6,9,8};
		int i ,j;
		if(array1.length==array2.length)
		{
			System.out.print("The common numbers are : ");
			for(i=0;i<array1.length;i++)
			{
				for(j=0;j<array2.length;j++)
				{	
					if(array1[i]==array2[j])
					{
						System.out.print(array1[i]+",");
					}
					i++;
				}
			}
		}	
	}
}
