
public class Order {
     private float totalPrice;
     int orderId;
     int nProducts;
    int customerId;
    public Order(float totalPrice, int orderId, int nProducts, int customerId, Product[] products) {
        this.totalPrice = totalPrice;
        this.orderId = orderId;
        this.nProducts = nProducts;
        this.customerId = customerId;
        this.products = products;
    }
    Product[] products = new Product[nProducts];
    public float getTotalPrice() {
        for(Product product:products){
            totalPrice+=product.getPrice();}
        return totalPrice;
    }
    public void setTotalPrice(float totalPrice) {
        this.totalPrice = Math.abs(totalPrice);
    }
    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = Math.abs(orderId);
    }
    public int getnProducts() {
        return nProducts;
    }
    public void setnProducts(int nProducts) {
        this.nProducts = Math.abs(nProducts);
    }
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }
    public Product[] getProducts() {
        return products;
    }
    public void setProducts(Product[] products) {
        this.products = products;
    }
    public void printOrderInfo(){
        totalPrice=0;
        System.out.println("Customer ID is : "+customerId);
        System.out.println("Order ID : "+orderId);
        for(Product product:products){
            totalPrice+=product.getPrice();
            System.out.println(product.getName()+"-"+product.getPrice());
        }
        System.out.println("the total price is  : "+totalPrice);
    }
}

