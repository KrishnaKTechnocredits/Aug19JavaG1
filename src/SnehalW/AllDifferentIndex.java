package SnehalW;

public class AllDifferentIndex {

	int array1[] = {10,2,9,14,3};
	int array2[] = {10,2,18,14,3};
	int i ,j;
		void differIndex()
		{
			for(i=0;i<array1.length;i++)
			{
				for(j=i;j<array2.length;j++)
				{
					if(array1[i]!=array2[j])
					{
						System.out.println("The arrays is not equal at the index : "+i +" is "+array1[i]+","+array2[j]);			
					}
					break;
				}
			}
		}
		
	public static void main(String[] args) {
		AllDifferentIndex alldifferentindex = new AllDifferentIndex();
		alldifferentindex.differIndex();
	}

}
