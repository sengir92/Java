import java.util.Comparator;

public class Book implements Comparator<Book> {

    // Override compare method
    @Override
    public int compare(Book b1, Book b2) {
        return b1.getBookName().compareTo(b2.getBookName());
    }

    private String bookName;
    private int pageNumber;
    private String author;
    private int publishYear;

    // Create Constructor method
    public Book(String bookName, int pageNumber, String author, int publishYear) {
        this.bookName = bookName;
        this.pageNumber = pageNumber;
        this.author = author;
        this.publishYear = publishYear;
    }

    //Getter setter methods
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }
}
