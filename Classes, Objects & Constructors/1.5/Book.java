
public class Book {
	String bookName;
    int noOfCopies;
    String authorName;
    Book(String bookName, int noOfCopies, String authorName) {
        this.bookName = bookName;
        this.noOfCopies = noOfCopies;
        this.authorName = authorName;
    }
    void display() {
        System.out.println("Book Name: " + bookName + ", Author Name: " + authorName  +  ", No. of Copies: " + noOfCopies);
    }
}
