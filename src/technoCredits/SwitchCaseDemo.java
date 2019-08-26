package technoCredits;

public class SwitchCaseDemo {

	static void m1(char ch)
	{
//		if(ch == 'A')
//			System.out.println("VGood");
//		else if(ch == 'B')
//			System.out.println("AVG");
//		else if(ch == 'C')
//			System.out.println("Bad");
//		else if(ch == 'D')
//			System.out.println("Join Technocredits");
//		else
//			System.out.println("Are you sure");
		
		switch(ch)
		{
			case 'A' :
				System.out.println("VGood");
				break;
				
			case 'B' :
				System.out.println("AVG");
			
			case 'C' :
				System.out.println("Bad");
				break;
				
			case 'D' :
				System.out.println("Join Technocredits");
				
			default :
				System.out.println("Are you sure");
		}
	}
	
	public static void main(String[] args) {
		m1('B');
	}
}
