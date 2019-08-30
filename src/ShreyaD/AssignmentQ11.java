package ShreyaD;

public class AssignmentQ11
{
	void Unique(int a[],int b[])
		{
			int c[] = new int[a.length + b.length];
			int cnt=0,k=0;
			for(int i=0;i<a.length;i++){
				c[k]=a[i];
			    k++;
			}
				
					for(int i=0;i<b.length;i++){
						cnt=0;
						for(int j=0;j<a.length;j++)
						{
							if(b[i]==a[j])
								cnt++;
					}
					
				if(cnt == 0)
				{
					c[k] = b[i];
					k++;
				}
	         }
			for(int i=0;i<k;i++)
				System.out.println(c[i]);
		
	}
	public static void main(String []args)
{
	AssignmentQ11 Q11 = new AssignmentQ11();
	int a[] = {1,3,6,9,7}; 
	int b[]= {2,5,6,9,8}; 
	Q11.Unique(a,b);
}
}
