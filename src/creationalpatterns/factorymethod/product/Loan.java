package creationalpatterns.factorymethod.product;

import creationalpatterns.factorymethod.Customer;

public interface Loan {

    boolean execute(final Customer customer);
}
