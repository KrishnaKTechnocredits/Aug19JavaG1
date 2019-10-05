/*
 Create a class Book having Title, Book Publisher, Author with parameterized constructor 
 using this keyword. Write a method to display the details of the Book and Test the class by creating objects. 
 
 */


package VarshaT;

import java.util.Scanner;

public class TestBook {
	private String title,publisher,author;
	TestBook()
	{
		System.out.println("---------enter details---------");
		Scanner sc= new Scanner(System.in);
		System.out.println("enter book title: ");
		title=sc.nextLine();
		System.out.println("enter book publisher: ");
		publisher=sc.nextLine();
		System.out.println("enter book author: ");
		author=sc.nextLine();
		sc.close();
		
	}
	public static void main(String[] args) {
		TestBook testBook= new TestBook();
		Book book= new Book(testBook.title,testBook.publisher,testBook.author);
		book.display();
		
	}

}
