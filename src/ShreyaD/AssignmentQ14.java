package ShreyaD;

public class AssignmentQ14 {
	void Even(int a[]){
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				System.out.print(a[i]+" ");
		}		
	}
	
public static void main(String []args)
{
	int a[]= {15, 24, 52, 49, 62, 10};
	AssignmentQ14 Q14 = new AssignmentQ14();
	Q14.Even(a);
}
}
	