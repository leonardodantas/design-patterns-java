package creationalpatterns.factorymethod.concreteproducts;

import creationalpatterns.factorymethod.Customer;
import creationalpatterns.factorymethod.product.Loan;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LoanPJ implements Loan {

    @Override
    public boolean execute(final Customer customer) {
        final var now = LocalDate.now();
        final var days = ChronoUnit.YEARS.between(customer.birthDate(), now);

        return days > 29 && days < 66;
    }
}
