import java.util.Scanner;

class Publisher {
    private String name;

    public Publisher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Book {
    private String title;
    private Publisher publisher;

    public Book(String title, Publisher publisher) {
        this.title = title;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public Publisher getPublisher() {
        return publisher;
    }
}

class Literature extends Book {
    public Literature(String title, Publisher publisher) {
        super(title, publisher);
    }
}

class Fiction extends Book {
    public Fiction(String title, Publisher publisher) {
        super(title, publisher);
    }
}

public class BookPublisher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create some books
        Book book1 = new Literature("To Kill a Mockingbird", new Publisher("Harper Lee"));
        Book book2 = new Fiction("Harry Potter and the Sorcerer's Stone", new Publisher("J.K. Rowling"));
        Book book3 = new Fiction("The Great Gatsby", new Publisher("F. Scott Fitzgerald"));
        Book book4 = new Literature("Pride and Prejudice", new Publisher("Jane Austen"));

        Book[] books = {book1, book2, book3, book4};

        // Prompt the user to select a category
        System.out.println("Select a category:");
        System.out.println("1. Literature");
        System.out.println("2. Fiction");

        int categoryChoice = scanner.nextInt();

        // Print the details of books from the selected category
        System.out.println("\nBooks in the selected category:");

        for (Book book : books) {
            if (categoryChoice == 1 && book instanceof Literature) {
                System.out.println("Title: " + book.getTitle());
                System.out.println("Publisher: " + book.getPublisher().getName());
                System.out.println("------------------------");
            } else if (categoryChoice == 2 && book instanceof Fiction) {
                System.out.println("Title: " + book.getTitle());
                System.out.println("Publisher: " + book.getPublisher().getName());
                System.out.println("------------------------");
            }
        }

        //scanner.close();
    }
}
