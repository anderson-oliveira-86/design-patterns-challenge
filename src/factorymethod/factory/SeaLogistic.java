package factorymethod.factory;

import factorymethod.button.Transport;
import factorymethod.button.Ship;

public class SeaLogistic extends Logistic {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
