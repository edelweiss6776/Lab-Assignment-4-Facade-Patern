public class Valet implements HotelService {
    
    private String plateNumber;

    public void pickUpVehicle(String plateNumber) {
        this.plateNumber = plateNumber;
        performService();
    }
    
    @Override
    public void pService() {
        System.out.println("Valet picking up vehicle with plate number: " + plateNumber);
    }
}
