//Create a class Book having Title, Book Publisher, Author with parameterized constructor using this      
//keyword. Write a method to display the details of the Book and Test the class by creating objects. 

package GayatriG;

public class Assignment5Part2Ex5Book {
	String title;
	String publisher;
	String author;
	
	public Assignment5Part2Ex5Book(String title, String publisher, String author) {
	this.title=title;
	this.publisher=publisher;
	this.author=author;
	}
	
	void displayDetails(){
		System.out.println("Title of the book is: "+title+"\nPublisher of the book is: "+publisher+"\nAuthor of the book is: "+author);
	}
	
	public static void main(String[] args) {
		Assignment5Part2Ex5Book book = new Assignment5Part2Ex5Book("Secrets of life","Gayatri","Abc");
		book.displayDetails();
	}
}
