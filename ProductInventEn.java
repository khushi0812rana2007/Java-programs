public class ProductInventEn {
    private String name;
    private int quantity;

    public void setProduct(String n, int q) { name = n; quantity = q; }
    public void show() { System.out.println(name + " has " + quantity + " items"); }
}

class ProductDemo {
    public static void main(String[] args) {
        ProductInventEn p = new ProductInventEn();
        p.setProduct("Laptop", 15);
        p.show();
    }
}
