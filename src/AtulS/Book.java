//Create a class Book having Title, Book Publisher, Author with parameterized constructor using this keyword
package AtulS;

public class Book {

	String title, publisher, author;

	Book(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}

	public void display() {
		System.out.println("Title:" + title + " " + "Publisher:" + publisher + " " + "Author:" + author);
	}

	public static void main(String[] args) {
		Book book = new Book("Java", "Technocredits", "Maulik");
		book.display();

	}

}
