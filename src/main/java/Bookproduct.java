
public class Bookproduct extends Product {
     String author;
   String publisher;
    public Bookproduct(int productId, String name, float price,String author,String publisher) {
        super(productId, name, price);
        this.author=author;
        this.publisher=publisher;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
