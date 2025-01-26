import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<User> users;

    public Library(){
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added: " + book.gettitle());

    }

    public void addUser(User user){
        users.add(user);
        System.out.println("User added: " + user.getname());

    }

    public void displayBooks() {
        System.out.println("Books in the Library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void displayUsers() {
        System.out.println("Users in the Library:");
        for (User user : users) {
            user.displayDetails();
        }
    }
    
}
