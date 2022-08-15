package creationalpatterns.builders.exampleotwo;

import java.math.BigDecimal;

public class Product {

    private String id;
    private String code;
    private String name;
    private BigDecimal price;
    private boolean promotionActive;

    private Product(final String id, final String code, final String name, final BigDecimal price, final boolean promotionActive) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.price = price;
        this.promotionActive = promotionActive;
    }

    public String getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public boolean isPromotionActive() {
        return promotionActive;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", promotionActive=" + promotionActive +
                '}';
    }

    public static Builder builder(final String name) {
        return new Builder(name);
    }

    public static class Builder {

        private String id;
        private String code;
        private final String name;
        private BigDecimal price;
        private boolean promotionActive;


        private Builder(final String name) {
            this.name = name;
        }

        public Builder id(final String id) {
            this.id = id;
            return this;
        }


        public Builder code(final String code) {
            this.code = code;
            return this;
        }


        public Builder price(final BigDecimal price) {
            this.price = price;
            return this;
        }

        public Builder promotionActive(final boolean promotionActive) {
            this.promotionActive = promotionActive;
            return this;
        }

        public Product build() {
            return new Product(id, code, name, price, promotionActive);
        }
    }
}
