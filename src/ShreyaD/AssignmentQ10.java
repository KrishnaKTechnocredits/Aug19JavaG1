package ShreyaD;

public class AssignmentQ10 {
	void Maxdiffindex(int arr1[],int arr2[])
	{
		if(arr1.length==arr2.length)
		{
			for(int i=0;i<arr1.length;i++){
				if(arr1[i]!=arr2[i])
				{
					System.out.println("values are not match at index:"+i);
					if(arr1[i]>arr2[i])
					    System.out.println("max value is:"+arr1[i]);
					else
						System.out.println("max value is:"+arr2[i]);
				}
	    }
	}
	else
	    System.out.println("Arrays are not match");
}
     public static void main(String []args)
  { 
	AssignmentQ10 Q10 = new AssignmentQ10();
    int  arr1[] = {10,2,9,14,3};     
    int  arr2[] = {10,2,18,14,3}; 
    Q10.Maxdiffindex(arr1,arr2);
 
}
}
