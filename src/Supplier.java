import java.util.ArrayList;
import java.util.Locale;

public class Supplier extends User{

   private InfoCard supplierInfoCard;
   ArrayList<HostPlace> hostPlaces;
   private int rentals, cancellations, incomingMessages;

    public Supplier(String usrm, String pass){
        super(usrm,pass,"Supplier" );

    }
    public InfoCard getSupplierInfoCard() {
        return supplierInfoCard;
    }

    public void setSupplierInfoCard(InfoCard supplierInfoCard) {
        this.supplierInfoCard = supplierInfoCard;
    }

    public ArrayList<HostPlace> getHostPlaces() {
        return hostPlaces;
    }

    public void setHostPlaces(ArrayList<HostPlace> hostPlaces) {
        this.hostPlaces = hostPlaces;
    }

    public int getRentals() {
        return rentals;
    }

    public void setRentals(int rentals) {
        this.rentals = rentals;
    }

    public int getCancellations() {
        return cancellations;
    }

    public void setCancellations(int cancellations) {
        this.cancellations = cancellations;
    }

    public int getIncomingMessages() {
        return incomingMessages;
    }

    public void setIncomingMessages(int incomingMessages) {
        this.incomingMessages = incomingMessages;
    }

    private HostPlace getHostPlaceByNumOfPeopleThatCanAccommodate(int numOfPeople){
        for(HostPlace hostPlace: hostPlaces){
            if(numOfPeople == hostPlace.getNumOfPeopleThatCanBeAccommodated()){
                return hostPlace;
            }
        }
        return null;
    }

    private HostPlace getHostPlaceByTitle(String title){
        String templateTitle = title.toLowerCase();
        for(HostPlace hostPlace: hostPlaces){
            if(templateTitle.equals(hostPlace.getTitle())){
                return hostPlace;
            }
        }
        return null;
    }

    public void addHostPlace(HostPlace hostPlace){
        //getInfoAboutHostPlace
        hostPlaces.add(hostPlace);
    }

    public void editHostPlace(HostPlace hostPlace){
        //insert code here
    }

    public void deleteHostPlace(HostPlace hostPlace){
        hostPlaces.remove(hostPlace);
    }
}
