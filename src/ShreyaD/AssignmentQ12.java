package ShreyaD;

public class AssignmentQ12 {
	void Common(int a1[],int a2[])
	{
		for(int i=0;i<a1.length;i++){
			for(int j=0;j<a2.length;j++)
			{
				if(a1[i]==a2[j])
					System.out.println(a1[i]);
					
			}
		}
	}
public static void main(String []args)
{
	AssignmentQ12 Q12 =  new AssignmentQ12();
	int a1[] = {1, 3, 6, 9, 7};
	int a2[]= {2, 5, 6, 9, 8};
	Q12.Common(a1,a2);
}
}