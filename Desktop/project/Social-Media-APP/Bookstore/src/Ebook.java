public class Ebook extends Book  implements MailingService{
    String fileType;
    Ebook(String isbn, String title, int year, double price, String author,String fileType) {
        super(isbn, title, year, price, author);
        this.fileType = fileType;
    }
    public String getFileType() {
        return fileType;
    }



    @Override
    public double handlePurchase(int qty, String email, String address) {
        sendMail(email);
        return this.getPrice();
    }

    @Override
    public void sendMail(String Mail) {
        System.out.println("Book was successfully sent to: " + Mail);
    }
}
