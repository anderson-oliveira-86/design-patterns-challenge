package factorymethod.button;

public class Truck implements Transport {
    @Override
    public void start() {
        System.out.println("O Caminhão está carregando!");
        delivery();
    }

    @Override
    public void delivery() {
        System.out.println("O Caminhão está entregando a carga!");
    }
}
