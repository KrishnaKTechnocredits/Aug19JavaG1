package RahulH.Assignment_3;

import java.util.Scanner;

public class Q8 {
	
	int cnt1 =0;
	int cnt2 =0;
	int cnt3 =0;
	int cnt4 =0;
	int cnt5 =0;
	
	void vowels(String str)
	{
		for (int i=0; i<str.length(); i++)
		{
			if ((str.charAt(i) == 'a'))
				cnt1 ++;
			if ((str.charAt(i) == 'e'))
				cnt2++;
			if ((str.charAt(i) == 'i'))
				cnt3 ++;
			if ((str.charAt(i) == 'o'))
				cnt4++;
			if ((str.charAt(i) == 'u'))
				cnt5 ++;
		}
		System.out.println("Vowel count for " + str + " is " + (cnt1+cnt2+cnt3+cnt4+cnt5));
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine().toLowerCase();
		System.out.println("The entered string is " + str);
		
		new Q8().vowels(str);
		sc.close();
	}

}
