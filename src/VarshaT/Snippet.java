package loopExample;

public class LoopEx1 
{
	void display()
	{
	   for(int i = 1;i<=10; i++)
	   {
		   for(int j=1;j<=10;j++) 
		   {
	           if (i*j % 3 == 0)
	   	       System.out.println(i + "*" + j + "*" +(i*j));	
	       }
	   }
  }  
   public static void main(String[] args) 
   {
	 LoopEx1 loopex1 =new LoopEx1();
	 loopex1.display();
	   
     }
 }
