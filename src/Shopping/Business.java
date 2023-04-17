package Shopping;

public class Business {
    private String address;
    private Product product;
    public static final double DISCOUNT = 0.25;

    public Business(String address, Product product) {
        this.address = address;
        this.product = product;
    }

    public String getAddress() {
        return address;
    }

    public Product getProduct() {
        return product;
    }
}
