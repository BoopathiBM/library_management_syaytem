import java.util.*;

public class Member extends User implements Loanable {

    private List<Book> borrowedBooks;

    public Member(String userId, String name, String email){
        super(userId, name, email);
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book){
        if(book.isBorrowed()){
            System.out.println("Book is alrady borrowed: "+ book.gettitle());
            return;
        }
        borrowedBooks.add(book);
        System.out.println("book vorrowed: "+ book.gettitle());
    }

    public void returnBook(Book book) {
        if (!borrowedBooks.contains(book)) {
            System.out.println("This book was not borrowed by the member: " + book.gettitle());
            return;
        }
        borrowedBooks.remove(book);
        book.returnBook();
        System.out.println("Book returned: " + book.gettitle());
    }

    public void displayDetails() {
        System.out.println("Member[UserID=" + userId + ", Name=" + name + ", Email=" + email + ", BorrowedBooks=" + borrowedBooks.size() + "]");
    }
    
}
