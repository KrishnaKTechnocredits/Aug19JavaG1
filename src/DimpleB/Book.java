/*
 Create a class Book having Title, Book Publisher, Author with parameterized constructor using this
keyword. Write a method to display the details of the Book and Test the class by creating objects.
 */
package DimpleB;

public class Book {

	String booktitle="";
	String publisher="";
	String author="";
	Book(String title,String publisher,String writer)
	{
		this.author=writer;
		this.booktitle=title;
		this.publisher=publisher;
	}
	void displaybookinfo()
	{
		if(author!=" " || author!=null||booktitle!=""||booktitle!=null|| publisher !=null|| publisher!="")
		{
		System.out.println("Book details ");
		System.out.println("Book Title :"+booktitle);
		System.out.println("Book Author :"+author);
		System.out.println("Book Publisher :"+publisher);
		}
		else
			System.out.println("Something went wrong");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b=new Book("The unexpected guest","Harper collins","Agatha Christie");
		b.displaybookinfo();
	}
}
