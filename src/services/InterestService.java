package services;

import java.security.InvalidParameterException;

public interface InterestService {
    
    double getInterestRate();
    
    /* Mesmo com a implementação da interface é possivel identificar que há ainda a repetição de código 
     para que não seja repetido, foi copiado o método pagamento de uma classe, e estabelecido
     como padrão (default) dentro da interface */
    
     default double payment(double amount, int months) {
        if(months < 1) {
            throw new InvalidParameterException("Months must be greater than zero");
        }
        return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
    }
}
