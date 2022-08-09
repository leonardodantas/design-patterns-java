package creationalpatterns.factorymethod.concretecreators;

import creationalpatterns.factorymethod.concreteproducts.LoanPJ;
import creationalpatterns.factorymethod.creator.CreatorLoans;
import creationalpatterns.factorymethod.product.Loan;

public class CreatorLoanPJ extends CreatorLoans {

    @Override
    public Loan create() {
        return new LoanPJ();
    }
}
