package strategy;

import strategy.model.Order;
import strategy.model.Travel;
import strategy.strategies.CreditCardStrategy;
import strategy.strategies.PayPalStrategy;
import strategy.strategies.PayStrategy;
import strategy.util.DestinationsRepository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Date: 2024/02/24
 * Author: anderson-oliveira-86
 * Strategy: Define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis.
 * Permite que o algoritmo varie independentemente dos clientes que o utilizam.
 */
public class StrategyMain {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static PayStrategy strategy;

    public static void main(String[] args) throws IOException {
        boolean repeat;

        do {
            List<Travel> travelOptions = DestinationsRepository.getTravelOptions();

            System.out.println("========== COMPANHIA AEREA ==========");
            travelOptions.forEach(System.out::println);
            System.out.println("Por favor, escolha o destino desejado: ");
            int choiceTravel = Integer.parseInt(reader.readLine());

            Order order = new Order();
            System.out.println("========== FORMA DE PAGAMENTO ==========");
            travelOptions.stream().filter(travel -> travel.getId() == choiceTravel).findFirst().ifPresent(travel -> {
                System.out.println("O destino escolhido foi: " + travel.getDestination());
                System.out.println("O valor da passagem é: " + travel.getPrice());
                order.setDestination(travel.getDestination());
                order.setTotalCost(travel.getPrice());
            });

            System.out.println("Por favor, escolha a forma de pagamento: ");
            System.out.println("1. Cartão de crédito");
            System.out.println("2. PayPal");
            int choicePayment = Integer.parseInt(reader.readLine());
            switch (choicePayment) {
                case 1:
                    strategy = new CreditCardStrategy();
                    break;
                case 2:
                    strategy = new PayPalStrategy();
                    break;
                default:
                    break;
            }
            order.processOrder(strategy);

            System.out.println("Deseja realizar outra compra? (s/n)");
            String continuar = reader.readLine();
            repeat = continuar.equalsIgnoreCase("s");
        }while (repeat);
        System.out.println("Obrigado por voar conosco!");
    }
}
