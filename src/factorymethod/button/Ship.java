package factorymethod.button;

public class Ship implements Transport {

    @Override
    public void start() {
        System.out.println("O Navio está no porto!");
        delivery();
    }

    @Override
    public void delivery() {
        System.out.println("O Navio está entregando os containers!");
    }
}
