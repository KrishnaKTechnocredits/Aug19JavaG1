package SnehalW;
/*15)	WAP to find string which has length more than 7 characheter.
a.	Input array ={“krishna”, “maulik”, “aakash”, “harsh”, “aakansha”, ”abhishek”}\
b.	Output :- Krishna, aakansha, abhishek*/
import java.util.Scanner;

public class Morethanseven_A3_15 {

	public static void main(String[] args) {
		String s = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of words :");
		int size = sc.nextInt();
		String[] newstr1 = new String[size];
		
		System.out.println("Please enter "+ size +" word :" );
		
		for(int i=0; i<newstr1.length; i++)
		{	
			newstr1[i] = sc.next();
		}
		for (int j=0 ;j<newstr1.length; j++)
		{
			if(newstr1[j].length() >= 7)
			{
				String sevenchar = newstr1[j];
			    System.out.println(sevenchar);
			}
		}
	}
}