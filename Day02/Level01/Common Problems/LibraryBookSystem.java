class Book{
    private String title;
    private String author;
    private int price;
    private boolean isAvailable;

    public Book(){
        title = "Death : An Inside Story";
        author = "Sadhguru";
        price = 299;
        isAvailable = true;
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    //getter and setter methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }
    
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    //method to borrow a book
    public void borrowBook(){
        if(isAvailable){
            isAvailable = false;
            System.out.println("Book borrowed successfully");
        }else{
            System.out.println("Book is not available");
        }
    }

    //method to display details
    public void display() {
        System.out.println("Book 1: " + title + " by " + author + " costs " + price);
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Let Us C", "Yashwant Karnekar", 399);
        book1.display();
        book2.display();
    }
}

public class LibraryBookSystem {
    
}
