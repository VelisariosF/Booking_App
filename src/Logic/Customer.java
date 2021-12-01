package Logic;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer extends User {

    public Customer(String usrm, String pass){

            super(usrm,pass,"customer" );

    }

    public HostPlace searchByTitle(String title){
        ArrayList<HostPlace> hostPlacesInTheSystem = Helper.getHostPlaces();
        for(HostPlace hostPlace : hostPlacesInTheSystem){
            if(hostPlace.getTitle().equals(title)){
                return hostPlace;
            }
        }
        return null;
    }

    public ArrayList<HostPlace> searchByLocation(String location){
        ArrayList<HostPlace> hostPlacesInTheSystem = Helper.getHostPlaces();
        ArrayList<HostPlace> hostPlacesThatBelongToTheLocationGiven = new ArrayList<>();
        for(HostPlace hostPlace : hostPlacesInTheSystem){
            if(hostPlace.getLocation().equals(location)){
                hostPlacesThatBelongToTheLocationGiven.add(hostPlace);
            }
        }
        if(hostPlacesThatBelongToTheLocationGiven.size() != 0){
            return hostPlacesThatBelongToTheLocationGiven;
        }
        return null;
    }

    public HostPlace searchByAddress(String address){
        ArrayList<HostPlace> hostPlacesInTheSystem = Helper.getHostPlaces();
        for(HostPlace hostPlace : hostPlacesInTheSystem){
            if(hostPlace.getAddress().equals(address)){
                return hostPlace;
            }
        }
        return null;
    }

    public ArrayList<HostPlace> searchBySpace(double space){
        ArrayList<HostPlace> hostPlacesInTheSystem = Helper.getHostPlaces();
        ArrayList<HostPlace> hostPlacesThatBelongToTheSpaceGiven = new ArrayList<>();
        for(HostPlace hostPlace : hostPlacesInTheSystem){
            if(hostPlace.getSpace() == space){
                hostPlacesThatBelongToTheSpaceGiven.add(hostPlace);
            }
        }
        if(hostPlacesThatBelongToTheSpaceGiven.size() != 0){
            return hostPlacesThatBelongToTheSpaceGiven;
        }
        return null;
    }

    public ArrayList<HostPlace> searchByPeople(int people){
        ArrayList<HostPlace> hostPlacesInTheSystem = Helper.getHostPlaces();
        ArrayList<HostPlace> hostPlacesThatCanFitTheGivenPeople = new ArrayList<>();
        for(HostPlace hostPlace : hostPlacesInTheSystem){
            if(hostPlace.getNumOfPeopleThatCanBeAccommodated() == people){
                hostPlacesThatCanFitTheGivenPeople.add(hostPlace);
            }
        }
        if(hostPlacesThatCanFitTheGivenPeople.size() != 0){
            return hostPlacesThatCanFitTheGivenPeople;
        }
        return null;
    }

    public ArrayList<HostPlace> searchByPrice(double price){
        ArrayList<HostPlace> hostPlacesInTheSystem = Helper.getHostPlaces();
        ArrayList<HostPlace> hostPlacesThatCanFitThePriceGiven = new ArrayList<>();
        for(HostPlace hostPlace : hostPlacesInTheSystem){
            if(hostPlace.getPricePerDay() == price){
                hostPlacesThatCanFitThePriceGiven.add(hostPlace);
            }
        }
        if(hostPlacesThatCanFitThePriceGiven.size() != 0){
            return hostPlacesThatCanFitThePriceGiven;
        }
        return null;
    }
}
