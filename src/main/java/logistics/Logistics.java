package logistics;

public abstract class Logistics {
    public abstract Transport createTransport();

    public void planDelivery(String cargo, String destination) {
        System.out.println("Planning delivery...");
        Transport transport = createTransport();
        transport.deliver(cargo, destination);
    }
}
