package assignment_4_String;

public class Q12 {
	
	String array[] = {"xyz", "77", "101", "99", "abc"};
	
	void numberString()
	{
		for (int i=0; i<array.length; i++)
		{
			if (array[i].contains("7"))
					System.out.print("Numeric -> " + array[i] + ",");
			if (array[i].contains("1"))
					System.out.print(array[i] + ",");
			if (array[i].contains("9"))
				System.out.println(array[i]);
		}
		for (int a=0; a<array.length; a++)
		{
			if (array[a].contains("x"))
				System.out.print("string  -> " + array[a] + ",");
			if (array[a].contains("a"))
				System.out.print(array[a]);
		}
	}
	
	public static void main(String[] args) {
		new Q12().numberString();
	}
}
