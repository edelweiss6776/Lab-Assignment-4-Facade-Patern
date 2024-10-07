public class Cart implements HotelService {
    
    private int numberOfCarts;

    public void requestCart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
        pService();
    }
    
    @Override
    public void pService() {
        System.out.println("Requesting " + numberOfCarts + " luggage carts.");
    }
}
