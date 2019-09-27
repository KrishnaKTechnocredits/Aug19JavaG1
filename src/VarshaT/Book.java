/*
 Create a class Book having Title, Book Publisher, Author with parameterized constructor 
 using this keyword. Write a method to display the details of the Book and Test the class by creating objects. 
 
 */



//REFER TestBook Class for class calling


package VarshaT;

public class Book {
	private String title,publisher,author;
	Book(String title, String publisher, String author)
	{
		this.title=title;
		this.publisher=publisher;
		this.author=author;
	}
	void display()
	{
		System.out.println("------------DETAILS-----------");
		System.out.println("BOOK TITLE: "+title);
		System.out.println("BOOK PUBLISHER: "+publisher);
		System.out.println("BOOK AUTHOR: "+ author);
	}

}
