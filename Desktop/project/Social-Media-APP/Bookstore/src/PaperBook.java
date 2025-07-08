public class PaperBook extends Book implements ShippingService{
    private int Stock;

    PaperBook(String isbn, String title, String year, double price, String author, int stock) {
        super(isbn, title, year, price, author);
        this.Stock = stock;
    }

    public int getStock() {
        return Stock;
    }

    public void reduceStock(int qty) {
        Stock-=qty;
    }

    public void setStock(int stock) {
        this.Stock = stock;
    }
    @Override
    public void Ship(String address){
        System.out.println("Shipped to "+address);
    }


    public boolean isAvailable(int qty) {
        return qty <= Stock;
    }

    @Override
    public double handlePurchase(int qty, String email, String address) {
        if(isAvailable(qty)) {
            reduceStock(qty);
            Ship(address);
            return qty * this.getPrice();
        }
        else
            throw new IllegalStateException("Not enough stock");

    }
}
