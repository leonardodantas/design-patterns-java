package creationalpatterns.factorymethod;

import creationalpatterns.factorymethod.concretecreators.CreatorLoanPF;
import creationalpatterns.factorymethod.concretecreators.CreatorLoanPJ;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        final var customer = new Customer("487951221564", LocalDate.of(1995,10,3), BigDecimal.valueOf(1000));
        final var creatorLoanPF = new CreatorLoanPF();
        final var loanPF = creatorLoanPF.create();

        final var loanPFIsValid = loanPF.execute(customer);
        System.out.println("LoanPF: " + loanPFIsValid);

        final var creatorLoanPJ = new CreatorLoanPJ();
        final var loanPJ = creatorLoanPJ.create();
        final var loanPJIsValid = loanPJ.execute(customer);
        System.out.println("LoanPJ: " + loanPJIsValid);
    }
}
