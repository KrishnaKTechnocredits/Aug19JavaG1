package coreJavaAssignment3.classAndObjects;

import java.util.Scanner;

public class TestBook extends Book{
	
	TestBook(String title, String BookPublisher, String Author) {
		super(title, BookPublisher, Author);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Book title, book publisher name and Author name");
		String title = sc.next();
		String publisher = sc.next();
		String Aname = sc.next();
		
		Book bt = new TestBook(title, publisher, Aname);
		bt.displayBookDetails(title, publisher, Aname);
		
		sc.close();
	}

}
