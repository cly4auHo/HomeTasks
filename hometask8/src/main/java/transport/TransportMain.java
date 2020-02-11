package transport;

public class TransportMain {
    public static void main(String[] args) {
        Source source = new Source();
        Cart cart = new Cart();

        Loader loader = new Loader(source, cart);
        Transporter transporter = new Transporter(loader, cart);
        Unloader unloader = new Unloader(transporter, cart);
    }
}
