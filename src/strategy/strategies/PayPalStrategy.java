package strategy.strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayPalStrategy implements PayStrategy {
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    @Override
    public boolean pay(int paymentAmount) {
        return false;
    }

    @Override
    public void collectPaymentDetails() throws IOException {
        System.out.print("Digite seu email: ");
        email = READER.readLine();
        System.out.print("Digite sua Senha: ");
        password = READER.readLine();
        System.out.println("Realizando o pagamento usando o PayPal.");
    }
}
