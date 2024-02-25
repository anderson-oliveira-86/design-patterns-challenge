package strategy.model;

public class Travel {
    private long id;
    private String destination;
    private int price;

    public Travel(long id, String destination, int price) {
        this.id = id;
        this.destination = destination;
        this.price = price;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return id + " - " + destination + " - Valor: " + price;
    }
}
