
package Hemali;
class A2_Program5
{
	int array[]={15,5, 2, 3, 13,1};
	void secondLarge(){
		
		
	int largest=array[0];
	int secondlargest=0;
	
	for(int i=1;i<array.length;i++)
{
		if(array[i]>largest)
		{
			secondlargest=largest;
			largest=array[i];
		}
		else if(array[i]>secondlargest && secondlargest<largest)
		{
			secondlargest=array[i];
		}
		
}
		System.out.println("Largest and second largest no is" +largest +"and  " +secondlargest);
		
		
		
	}
	
public static void main(String[] args)
	{

		
		A2_Program5 a2_Program5=new A2_Program5();
		a2_Program5.secondLarge();
	}	
}




