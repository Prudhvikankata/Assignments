public class Book {
    String title;
    String author;
    static int bookCount = 0;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        bookCount++;
    }

    public void printBookInfo() {
        int serialNumber = bookCount;
        System.out.println("Book Serial Number: " + serialNumber);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Ramayanam", "Valmiki");
        Book b2 = new Book("Bhagavadgita", "Vyasa Maharshi");
        Book b3 = new Book("Harry Potter", "J.K. Rowling");

        b1.printBookInfo();
        System.out.println("-----");
        b2.printBookInfo();
        System.out.println("-----");
        b3.printBookInfo();
        System.out.println("-----");

        System.out.println("Total Books in Inventory: " + Book.bookCount);
    }
}
