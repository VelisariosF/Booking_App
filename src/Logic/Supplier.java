package Logic;

import java.util.ArrayList;
import java.util.Scanner;

public class Supplier extends User{

   private InfoCard supplierInfoCard;
   ArrayList<HostPlace> hostPlaces;
   private int rentals, cancellations, incomingMessages;

    public Supplier(String usrm, String pass){
        super(usrm,pass,"supplier" );

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

    public int supplierChoice(){
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do{
        System.out.println("a) Press 1 to add a host place.");
        System.out.println("b) Press 2 to edit a host place.");
        System.out.println("c) Press 3 to delete a host place.");
        System.out.println("d) Press 4 to search a host place.");
        System.out.println("e) Press 5 to show the number of rentals.");
        System.out.println("f) Press 6 to show the number of cancellations.");
        System.out.println("g) Press 7 to show the number of incoming messages.");
    }while (choice != 1 && choice != 3 && choice != 3 && choice != 4 && choice != 5 && choice !=6  && choice != 7);

    //continue admin
        return choice;
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
