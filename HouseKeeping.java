public class HouseKeeping implements HotelService {
    
    private int roomNumber;

    public void cleanRoom(int roomNumber) {
        this.roomNumber = roomNumber;
        pService();
    }
    
    @Override
    public void pService() {
        System.out.println("Housekeeping cleaning room number: " + roomNumber);
    }
}
