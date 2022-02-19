package prototype;

public class Table implements Product {

    private final String material;
    private final String dimensions;


    public Table(String model, String dimensions) {
        this.material = model;
        this.dimensions = dimensions;
    }

    public Product clone() {
        return new Table(this.material, dimensions);
    }

    @Override
    public String toString() {
        return "Table{" +
                "material='" + material + '\'' +
                ", dimensions='" + dimensions + '\'' +
                "} hashcode: " + this.hashCode();
    }
}
