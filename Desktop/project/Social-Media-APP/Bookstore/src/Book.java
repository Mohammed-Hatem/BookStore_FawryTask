public abstract class Book {
    private final String isbn;
    private final String title;
    private final String year;
    private final double price;
    private final String author;

    public Book(String isbn, String title, String year, double price, String author) {
        this.isbn = isbn;
        this.title = title;
        this.year = year;
        this.price = price;
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public abstract double handlePurchase(int qty, String email, String address);
}
