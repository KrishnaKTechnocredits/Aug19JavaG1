package VarshaT;

public class Asngmt2_Ques2 {
	static void duplicate(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
		
				if(a[i]==a[j])
				{
					System.out.println("duplicate number:"+a[i]);
					break;
				}
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,3,3}; //array with duplicate element
		duplicate(a);
		
	}

}
