class Book{

    private String title;
    private String author;
    private String isbn;
    private double price;
    private boolean isBorrowed;

    public Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = true;

    }


    public String gettitle(){
        return title;
    }

    public String getauthor(){
        return author;
    }
    public String getisbn(){
        return isbn;
    }
    public double getprice(){
        return price;
    }
    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrow(){
        if(isBorrowed){
            throw new IllegalStateException("Book is already borrowed");
        }
        isBorrowed = false;
    }

    public void returnBook(){
        if(!isBorrowed){
            throw new IllegalStateException("Book is currently borrowed");
        }
        isBorrowed = false;
    }

    public String toString(){
        return "Book[Title = "+title+", Author ="+author+", ISBN = "+isbn+",Borrowed = "+isBorrowed+"]";
    }



}