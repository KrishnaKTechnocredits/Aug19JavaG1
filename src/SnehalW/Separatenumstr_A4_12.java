package SnehalW;

/*WAP to separate numeric and string value from the array
input:- String array[] = {"xyz", "77", "101", "99", "abc”}
output:- numeric → 77, 101, 99
string →xyz, abc*/

public class Separatenumstr_A4_12 {
		
	public static void main(String[] args) {
		String number  = "";
		String letter = "";
		String array[] = {"xyz", "77", "101", "99", "abc"};

		for(int i=0; i<array.length; i++)
		{
			if(array[i].contains("0")||array[i].contains("1")||array[i].contains("2")||array[i].contains("3")||array[i].contains("4")
			||array[i].contains("5")||array[i].contains("6")||array[i].contains("7")||array[i].contains("8")||array[i].contains("9"))
			{
				number = number +array[i]+" , ";
			}
			else
			{
				letter = letter+array[i]+" , ";
			}
		}
		System.out.println("Alphabets in the Array : "+ letter );
		System.out.println("Numbets in the Array : "+ number );
	}

}
