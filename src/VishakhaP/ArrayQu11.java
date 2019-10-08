package VishakhaP;

public class ArrayQu11 {
	        public static void main(String args[])
	        {
			int array1[] = {1,3,6,9,7};
			int array2[]= {2,5,6,9,8};
			for(int i=0;i<array1.length;i++)
			{
				for(int j=0;j<array2.length;j++)
				{
					if(array1[i]==array2[j]){
						System.out.println(array1[i]);
			    }
			}
			}
		}
	}

