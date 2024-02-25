package factorymethod.factory;

import factorymethod.button.Transport;
import factorymethod.button.Truck;

public class RoadLogistic extends Logistic {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
