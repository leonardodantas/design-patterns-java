package creationalpatterns.factorymethod;

import java.math.BigDecimal;
import java.time.LocalDate;

public record Customer (
        String cpf,
        LocalDate birthDate,
        BigDecimal amount
) {

}
