package strategy.strategies;

import java.io.IOException;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails() throws IOException;
}
