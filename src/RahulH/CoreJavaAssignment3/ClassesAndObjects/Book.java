package coreJavaAssignment3.classAndObjects;

public class Book {
	
	String title = "Be focused";
	String BookPublisher = "MS Dhoni";
	String Author = "Rahul Hiremath";
	
	Book (String title, String BookPublisher, String Author)
	{
		String instanceTitle = this.title;
		String instanceBookPublisher = this.BookPublisher;
		String instanceAuthor = this.Author;
		
		System.out.println("Constructor called: " +instanceTitle + " " + instanceBookPublisher + " " +instanceAuthor);	
	}

	void displayBookDetails(String userTitle, String userBookPublisher, String userAuthor)
	{
		System.out.println("DisplayBookDetails method called " + userTitle + " " + userBookPublisher + " " + userAuthor);
	}
}
