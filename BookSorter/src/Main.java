import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        //Crate new treeset and implement comparator class and override compare method
        TreeSet<Book> booksName = new TreeSet<>(new Comparator<Book>() {
            @Override

            // Sort books by name
            public int compare(Book o1, Book o2) {
                return o1.getBookName().compareTo(o2.getBookName());
            }
        });

        // add elements treeset
        booksName.add(new Book("Futbol Taktikleri Tarihi", 592, "Jonathon Wilson", 2017));
        booksName.add(new Book("Futbol Asla Sadece Futbol Değildir", 384, "Simon Kuper", 2022));
        booksName.add(new Book("Doktor Socrates", 392, "Andrew Downie", 2021));
        booksName.add(new Book("Cantona Kral Olacak Asi", 560, "Philippe Auclair", 2020));
        booksName.add(new Book("Benim Oyunum", 304, "Johan Cruyff", 2022));

        // Create for loop for the print books sorted by name
        System.out.println("Sort Books by Book Name: ");
        for (Book b : booksName) {
            System.out.println(b.getBookName());
        }

        // Create new treeset
        TreeSet<Book> booksPage = new TreeSet<>(new Comparator<Book>() {
            @Override

            //Sort books by page number
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber() - o2.getPageNumber();
            }
        });

        // Adding an existing treeset to a new treeset
        booksPage.addAll(booksName);

        // Create for loop for the print books sorted by page number

        System.out.println("Sort Books by Page Number: ");
        for (Book b : booksPage) {
            System.out.println(b.getPageNumber());
        }
    }
}