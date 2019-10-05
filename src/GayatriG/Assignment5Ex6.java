//WAP to input student marks by condition : 
//Marks is greater than 0 and less than 50--FAIILED
//Marks is greater than 50 and less than 75--1st Class 
//Marks greater than 75 –and less than 100 Distinction

package GayatriG;

public class Assignment5Ex6 {
	static void studentResult(double input){
		if(input>=75 && input<100){
			System.out.println("Student passed with distinction");
		}else if (input>=50  && input<75) {
			System.out.println("Student passed with 1st class");
		}else if(input>0 && input<50){
			System.out.println("Student failed");
		}
	}
	public static void main(String[] args) {
		studentResult(99);
		
	}
}
