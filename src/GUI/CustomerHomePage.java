package GUI;
import Logic.*;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerHomePage {
    Customer customer;
    int choice;
    public CustomerHomePage(Customer customer){
        this.customer = customer;
        choice = customerChoice();
        beginAction(choice);
    }

    public int customerChoice(){
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do{
            System.out.println("a) Press 1 to search a host place by criteria.");
            System.out.println("b) Press 2 to book a host place.");
            System.out.println("c) Press 3 to cancel a book of a host place.");
            System.out.println("d) Press 4 to show info about you.");
            choice = scanner.nextInt();
        }while (choice != 1 && choice != 3 && choice != 3 && choice != 4);

        //continue
      return choice;
    }
    public void beginAction(int choice){
        switch (choice){
            case 1:
                  searchHostPlaceByCriteria();
        }
    }

    public void searchHostPlaceByCriteria(){
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do{
            //title, location, address, space, price, num of people
            System.out.println("a) Press 1 to search by title");
            System.out.println("b) Press 2 to search by location");
            System.out.println("c) Press 3 to search by address.");
            System.out.println("d) Press 4 to search by space.");
            System.out.println("e) Press 5 to search by num of people to accommodate.");
            System.out.println("f) Press 6 to search by price");
            choice = scanner.nextInt();
        }while(choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5 && choice != 6);

       switch (choice){
           case 1:
               Scanner scannerTitle = new Scanner(System.in);
               System.out.println("Give title: ");
               String title = scannerTitle.nextLine().toLowerCase();
               HostPlace hostPlaceByTitle = searchByTitle(title);
               if(hostPlaceByTitle != null){
                    Helper.printHostPlaceInfo(hostPlaceByTitle);

               }
           case 2:
               Scanner scannerLocation = new Scanner(System.in);
               System.out.println("Give location: ");
               String location = scannerLocation.nextLine().toLowerCase();
               ArrayList<HostPlace> hostPlacesByLocation = searchByLocation(location);
               if(hostPlacesByLocation != null){
                   for(HostPlace hostPlace : hostPlacesByLocation){
                       Helper.printHostPlaceInfo(hostPlace);

                   }
               }
           case 3:
               Scanner scannerAddress = new Scanner(System.in);
               System.out.println("Give address: ");
               String address = scannerAddress.nextLine().toLowerCase();
               HostPlace hostPlaceByAddress = searchByAddress(address);
               if(hostPlaceByAddress != null){
                   Helper.printHostPlaceInfo(hostPlaceByAddress);
               }
           case 4:
               Scanner scannerSpace = new Scanner(System.in);
               System.out.println("Give space: ");
               double space = scannerSpace.nextDouble();
               ArrayList<HostPlace> hostPlacesBySpace = searchBySpace(space);
               if(hostPlacesBySpace != null) {
                   for (HostPlace hostPlace : hostPlacesBySpace) {
                       Helper.printHostPlaceInfo(hostPlace);
                   }
               }

           case 5:
               Scanner scannerPeople = new Scanner(System.in);
               System.out.println("Give number of people to accommodate: ");
               int numOfPeople = scannerPeople.nextInt();
               ArrayList<HostPlace> hostPlacesByPeople = searchByPeople(numOfPeople);
               if(hostPlacesByPeople != null) {
                   for (HostPlace hostPlace : hostPlacesByPeople) {
                       Helper.printHostPlaceInfo(hostPlace);

                   }
               }
           case 6:
               Scanner scannerPrice = new Scanner(System.in);
               System.out.println("Give price: ");
               double price = scannerPrice.nextDouble();
               ArrayList<HostPlace> hostPlacesByPrice = searchByPrice(price);
               if(hostPlacesByPrice != null) {
                   for (HostPlace hostPlace : hostPlacesByPrice) {
                       Helper.printHostPlaceInfo(hostPlace);
                   }
               }
           default:
               break;
       }

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
