package prototype;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Product a = new Sofa("large", "1000 euro");
//        Product a = new Table("XB45", "200,120");
        List<Product> productLine = Production.massProduceFromPrototype(a, 30);

        for (Product product : productLine) {
            System.out.println(product);
        }


    }
}
