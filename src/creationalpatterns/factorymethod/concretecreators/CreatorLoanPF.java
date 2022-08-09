package creationalpatterns.factorymethod.concretecreators;

import creationalpatterns.factorymethod.concreteproducts.LoanPF;
import creationalpatterns.factorymethod.creator.CreatorLoans;
import creationalpatterns.factorymethod.product.Loan;

public class CreatorLoanPF extends CreatorLoans {

    @Override
    public Loan create() {
        return new LoanPF();
    }
}
