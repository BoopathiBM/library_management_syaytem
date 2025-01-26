public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();


        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456");
        Book book2 = new Book("1984", "George Orwell", "789012");
        library.addBook(book1);
        library.addBook(book2);


        Librarian librarian = new Librarian("L1", "Alice", "alice@example.com", "E1001");
        Member member = new Member("M1", "Bob", "bob@example.com");
        library.addUser(librarian);
        library.addUser(member);

        library.displayBooks();
        library.displayUsers();

        member.borrowBook(book1);
        member.borrowBook(book2);

        member.returnBook(book1);

        library.displayBooks();



    }
}
