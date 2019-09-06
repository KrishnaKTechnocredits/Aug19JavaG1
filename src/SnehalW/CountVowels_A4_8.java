package SnehalW;

import java.util.Scanner;
/*
 8)	WAP to find vowels in given string 
a.	Input :- automation engineering
b.	Count :- 11
 */
public class CountVowels_A4_8 {
	
int count =0;
void countvowels()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string : ");
	String str= sc.nextLine();
			for(int i=0; i <str.length(); i++)
			{
				if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
				{
					count++;
				}
			}
			System.out.println("No of vowels in the given string is : " +count);
	}
	public static void main(String[] args) {
	CountVowels_A4_8 countvowels_A4_8 = new CountVowels_A4_8();
	countvowels_A4_8.countvowels();
		
	}

}
