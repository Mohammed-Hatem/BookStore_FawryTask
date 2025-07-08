
public class Test {
    public static void main(String[] args) {

        QuantumBookstore shop = new QuantumBookstore();

        Book paperBook = new PaperBook("111", "ajf", 2000, 100.0, "wrfwrf", 5);
        Book eBook = new Ebook("222", "etgartg", 2021, 60.0, "rewfgerft", "PDF");
        Book demoBook = new ShowcaseBook("333", "etwgatg", 2018, 0.0, "tewgarft");

        shop.addBook(paperBook);
        shop.addBook(eBook);
        shop.addBook(demoBook);

        System.out.println("\n--- Buying available Books ---");

        try {
            shop.buyBook("111", 2, "ewgtge@jj.vom", "sd;kfn");
            shop.buyBook("222", 1, "ewgtge@jj.vom", "");
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }

        System.out.println("\n--- trying to buy showcase book ---");

        try {
            shop.buyBook("333", 1, "ewgtge@jj.vom", "");
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }

        System.out.println("\n--- Updating Inventory ---");
        shop.removeOutdatedBooks(2005);
    }
}
