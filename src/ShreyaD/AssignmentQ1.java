package ShreyaD;

public class AssignmentQ1 {
   void missing(int a[],int b[])
   {
	for(int i=0;i<a.length;i++)
	{
      int count=0;
	for (int j=0;j<b.length;j++){
		if(a[i]==b[j])
		{
			count++;
			break;
		}
   }
   if(count == 0)
	   System.out.println("missing no is:"+a[i]);  
}
   }
public static void main(String []args){
	AssignmentQ1 Q1 = new AssignmentQ1();
	int a[] = {1,2,3,4,5,6,7,8,9,10};
	int b[] = {4,6,7,8,1,2};
	Q1.missing(a, b);
}
   }
