package InnerClass;

class Library {
    private String name;

    public Library(String name) {
        this.name = name;
    }

    class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public void displayDetails() {
            System.out.println("Book: " + title + " by " + author + ", available at " + name);
        }
    }
}

public class Main3 {
    public static void main(String[] args) {
        Library myLibrary = new Library("Central Library");
        Library.Book book1 = myLibrary.new Book("1984", "George Orwell");
        Library.Book book2 = myLibrary.new Book("To Kill a Mockingbird", "Harper Lee");
        book1.displayDetails();
        book2.displayDetails();
    }
}
