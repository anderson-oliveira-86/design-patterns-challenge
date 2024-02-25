package strategy.model;

import strategy.strategies.PayStrategy;

public class Order {
    private String destination;
    private int totalCost = 0;

    public void processOrder(PayStrategy strategy) {
        try {
            strategy.collectPaymentDetails();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }
}
