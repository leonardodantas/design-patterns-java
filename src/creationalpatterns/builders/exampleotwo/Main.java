package creationalpatterns.builders.exampleotwo;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        /**
         * Builder for immutable objects with parameter name required
         */
        System.out.println("---------------------------------");
        final var product = Product.builder("Leonardo")
                .id("123")
                .code("LRD")
                .price(BigDecimal.valueOf(20))
                .promotionActive(false)
                .build();

        System.out.println(product.toString());
    }
}
