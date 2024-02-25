package strategy.strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreditCardStrategy implements PayStrategy {

    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    @Override
    public boolean pay(int paymentAmount) {
        return false;
    }

    @Override
    public void collectPaymentDetails() throws IOException {
        System.out.println("Digite o número do cartão de crédito: ");
        int creditCardNumber = Integer.parseInt(READER.readLine());
        System.out.println("Digite a data de validade 'mm/yy': ");
        String date = READER.readLine();
        System.out.println("Digite o código de segurança: ");
        int cvv = Integer.parseInt(READER.readLine());
        System.out.println("Realizando o pagamento usando o cartão de crédito.");
    }
}
