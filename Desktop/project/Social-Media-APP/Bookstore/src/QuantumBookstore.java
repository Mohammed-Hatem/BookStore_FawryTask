public class QuantumBookstore {
        private Inventory inventory;

        public QuantumBookstore() {
            this.inventory = new Inventory();
        }

        public void addBook(Book book) {
            inventory.addBook(book);
            System.out.println("book added to inventory.");
        }

        public void removeOutdatedBooks(int year) {
            inventory.updateInventory(year);
        }

        public double buyBook(String isbn, int qty, String email, String address) {
            return inventory.removeBook(isbn, qty, email, address);
        }
    }





