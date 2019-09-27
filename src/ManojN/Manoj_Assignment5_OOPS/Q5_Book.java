package ManojN.Manoj_Assignment5_OOPS;
import java.util.Scanner;
public class Q5_Book {
	String title, bookPublisher, author;
	Q5_Book (String title,String bookPublisher,String author){
		this.title = title;
		this.bookPublisher = bookPublisher;
		this.author = author;
	}
	void bookDetails(){
		System.out.println("Title = "+this.title);
		System.out.println("Book Publisher = "+this.bookPublisher);
		System.out.println("Author = "+this.author);
	}
	public static void main(String[] args) {
		System.out.println("Enter Book Title, Publisher, Author ");
		Scanner sc = new Scanner (System.in);
		Q5_Book q5 = new Q5_Book(sc.next(), sc.next(),sc.next() );
		q5.bookDetails();
		sc.close();
	}
}
