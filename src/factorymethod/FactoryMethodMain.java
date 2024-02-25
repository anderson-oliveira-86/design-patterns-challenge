package factorymethod;

import factorymethod.factory.Logistic;
import factorymethod.factory.RoadLogistic;
import factorymethod.factory.SeaLogistic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Date: 2024/02/24
 * Author: anderson-oliveira-86
 * Factory Method: Define uma interface para criar um objeto, mas deixa as subclasses alterarem o tipo de objetos que serão criados.
 */
public class FactoryMethodMain {
    private static Logistic logistic;

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        boolean repeat;
        do {
            System.out.println("========== COMPANHIA LOGISTICA ==========");
            System.out.println("1 - Logística Rodoviária");
            System.out.println("2 - Logística Marítima");
            System.out.println("Por favor, escolha o meio de transporte desejado: ");
            int choiceTransport = Integer.parseInt(reader.readLine());
            switch (choiceTransport) {
                case 1:
                    System.out.println("Logística Rodoviária selecionada ");
                    logistic = new RoadLogistic();
                    break;
                case 2:
                    System.out.println("Logística Marítima selecionada");
                    logistic = new SeaLogistic();
                    break;
                default:
                    break;
            }
            logistic.executeLogisticsOrder();
            System.out.println("Deseja realizar uma nova operação? (S/N)");
            repeat = reader.readLine().equalsIgnoreCase("S");
        }while (repeat);

        System.out.println("Obrigado por utilizar nossos serviços!");

    }
}
