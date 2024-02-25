package factorymethod.factory;

import factorymethod.button.Transport;

public abstract class Logistic {

    public void executeLogisticsOrder() {
        // ... other code ...
        Transport transport = createTransport();
        transport.start();
    }

    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */
    public abstract Transport createTransport();
}
