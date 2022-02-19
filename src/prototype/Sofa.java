package prototype;

public class Sofa implements Product {

    private String size;
    private String price;


    public Sofa(String size, String price) {
        this.size = size;
        this.price = price;
    }

    public Product clone() {
        return new Sofa(this.size, this.price);
    }

    @Override
    public String toString() {
        return "Sofa{" +
                "size='" + size + '\'' +
                ", price='" + price + '\'' +
                "} hashcode: " + this.hashCode();
    }
}
