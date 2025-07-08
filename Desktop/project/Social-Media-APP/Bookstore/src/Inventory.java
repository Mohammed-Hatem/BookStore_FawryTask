import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Inventory {
    private HashMap<String, Book> booksStock;

    public Inventory() {
        this.booksStock = new HashMap<>();
    }

    public void addBook(Book book) {
        booksStock.put(book.getIsbn(), book);
    }


    public void updateInventory(int year) {
        Iterator<Map.Entry<String, Book>> iterator = booksStock.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Book> entry = iterator.next();
            if (entry.getValue().getYear() < year) {
                iterator.remove();
                System.out.println(" removed outdated book: " + entry.getKey());
            }
        }
    }


    public double removeBook(String isbn, int qty, String email, String address) {
        Book book = booksStock.get(isbn);

        if (book == null) {
            throw new IllegalArgumentException("Book not found");
        }

        double total = book.handlePurchase(qty, email, address);
        System.out.println("book available total price = $" + total);
        return total;
    }
}
