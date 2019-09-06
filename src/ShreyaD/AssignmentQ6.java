package ShreyaD;

public class AssignmentQ6 {
  void Equality(int a[],int b[])
  {
	  int cnt=0;
	  if(a.length==b.length)
	  {
	  for(int i=0;i<a.length;i++)
	  {
			  if(a[i]==b[i])
				  cnt++;
		  }
			  if(cnt==a.length)
				  System.out.println("array are equal");
			  else
				  System.out.println("array are not equal");
	  }
	          else 
	        	  System.out.println("array are not eqaul");
		  }
       public static void main(String []args)
       {
	       AssignmentQ6 Q6 = new AssignmentQ6();
	       int a[] = {21, 57, 11, 37, 24};
	       int b[] = {21, 57, 11, 37, 24};
	       Q6.Equality(a,b);
} 
}