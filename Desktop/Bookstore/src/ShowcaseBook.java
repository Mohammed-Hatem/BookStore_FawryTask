public class ShowcaseBook extends Book {
    public ShowcaseBook(String isbn, String title, int year, double price, String author) {
        super(isbn, title, year, price, author);
    }


    @Override
    public double handlePurchase(int qty, String email, String address) {
        throw new UnsupportedOperationException("book is not for sale");
    }
}
