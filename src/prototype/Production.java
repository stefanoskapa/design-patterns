package prototype;

import java.util.ArrayList;
import java.util.List;

public class Production {
    public static List<Product> massProduceFromPrototype(Product product, int copies) {
        List<Product> productionLine = new ArrayList<>();
        for (int i = 0; i < copies; i++) {
            productionLine.add(product.clone());
        }
        return productionLine;
    }
}
