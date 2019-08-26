package technoCredits;

public class DoWhileEx1 {

	static void m1(int count) // -2
	{
		
		do{
			System.out.println("Maulik - " + count);
			count--;
		}while(count>=0);
	}
	
	public static void main(String[] args) {
		m1(10);
	}
}
