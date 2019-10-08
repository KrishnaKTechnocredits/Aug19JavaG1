package VishakhaP;

import java.util.Scanner;

public class StudentMarks {
	 public static void main(String args[]) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter marks:");
	      int marks = sc.nextInt();
	      String grade;

	      if( marks >=76 && marks<=100){
	         grade = "Distinction";
	      }
	      else if(marks >=50 && marks <76){
	         grade = "1st Class";
	      }
	      else if(marks>=0 && marks<50){
	         grade = "Failed";
	      }
	      else {
	         grade = "Invalid input";
	      }
	      System.out.println(" grade is " + grade);

}
}



