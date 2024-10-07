public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();
        
       
        frontDesk.requestValet("ABC-1234");
        
        
        frontDesk.requestHouseKeeping(101);
        
        
        frontDesk.requestCart(2);
    }
}
