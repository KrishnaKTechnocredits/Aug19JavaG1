//Create a class Addition and write add method for: a) add two integers b) add two decimal c) add two String 

package GayatriG;

public class Assignment5Part2Ex6Addition {
	
	
	 int addInteger(int a, int b){	 
		 int add=a+b;
		 return add;
	 }
	 
	 float addInteger(float a, float b){
		 float add=a+b;
		 return add;
	 }
	 
	 String addInteger(String a, String b){
		 String add=a+b;
		 return add;
	 }
	 
	 public static void main(String[] args) {
		 Assignment5Part2Ex6Addition add=new Assignment5Part2Ex6Addition();
		 
		 //int additionInt=add.addInteger(4, 3);
		 //float additionInt= add.addInteger(4.6f, 5f);
		 String s=add.addInteger("dsd", "sfdsf");
		 System.out.println(s);
		 
	}
}
