package Hemali;

public class Array1 {

	
	
	static void m1()
	{
		int pcount=0;
		int ncount=0;
		int psum=0;
		int nsum=0;
		int[] num={10,-9,-3,-4,14,19,-23};
	
	for(int i=0;i<num.length;i++)
	{
	if(num[i]>0)	
	{
		pcount++;
		
		psum=psum+num[i];
		
	}
	else
	{
		ncount++;
	nsum=nsum+num[i];
	}
	
	}
	System.out.println("positive no is: " +pcount);
	System.out.println("negative no is: " +ncount);
	System.out.println("positive no is: " +psum);
	System.out.println("negative no is: " +nsum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array1 array1=new Array1();
		m1();
	}

}
