package ShreyaD;

public class AssignmentQ2 {
	void duplicate(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
					System.out.println(a[i]);
			}
		}
	}

public static void main(String []args)
{
	int a[] = {0,3,1,2,3};
    AssignmentQ2 Q2 = new AssignmentQ2();
    Q2.duplicate(a);
}
}
