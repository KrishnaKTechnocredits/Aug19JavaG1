package SnehalW;

/*5. Create a class Book having Title, Book Publisher, Author with parameterized constructor using this
keyword. Write a method to display the details of the Book and Test the class by creating objects.*/
public class Book {
	String Title;
	String BookPublisher;
	String Author;

	Book(String Title, String BookPublisher, String Author) {
	this.Title = Title;
	this.BookPublisher = BookPublisher;
	this.Author = Author;
	}
	void display()
	{
		System.out.println("Book details are :" );
		System.out.println("Title : "+Title+"\n"+"BookPublisher : "+BookPublisher+"\n"+"Authorname : "+Author);
	}
	public static void main(String[] args) {
		Book book = new Book("Hamlet", "BookPublisher", "Shakespeare");
		book.display();
	}
	
}
