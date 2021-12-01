package GUI.Customer;


import Logic.*;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerSearchPage {
    private Customer customer;

    public CustomerSearchPage(){
        //
    }
    public CustomerSearchPage(Customer customer){
        this.customer = customer;
    }
    public void searchHostPlaceByCriteria(){
        Scanner scanner = new Scanner(System.in);
        int criteriaChoice = getCriteriaChoice();


        switch (criteriaChoice){
            case 1:
                Scanner scannerTitle = new Scanner(System.in);
                System.out.println("Give title: ");
                String title = scannerTitle.nextLine().toLowerCase();
                HostPlace hostPlaceByTitle = customer.searchByTitle(title);
                if(hostPlaceByTitle != null){
                    Helper.printHostPlaceInfo(hostPlaceByTitle);

                }
            case 2:
                Scanner scannerLocation = new Scanner(System.in);
                System.out.println("Give location: ");
                String location = scannerLocation.nextLine().toLowerCase();
                ArrayList<HostPlace> hostPlacesByLocation = customer.searchByLocation(location);
                if(hostPlacesByLocation != null){
                    for(HostPlace hostPlace : hostPlacesByLocation){
                        Helper.printHostPlaceInfo(hostPlace);

                    }
                }
            case 3:
                Scanner scannerAddress = new Scanner(System.in);
                System.out.println("Give address: ");
                String address = scannerAddress.nextLine().toLowerCase();
                HostPlace hostPlaceByAddress = customer.searchByAddress(address);
                if(hostPlaceByAddress != null){
                    Helper.printHostPlaceInfo(hostPlaceByAddress);
                }
            case 4:
                Scanner scannerSpace = new Scanner(System.in);
                System.out.println("Give space: ");
                double space = scannerSpace.nextDouble();
                ArrayList<HostPlace> hostPlacesBySpace = customer.searchBySpace(space);
                if(hostPlacesBySpace != null) {
                    for (HostPlace hostPlace : hostPlacesBySpace) {
                        Helper.printHostPlaceInfo(hostPlace);
                    }
                }

            case 5:
                Scanner scannerPeople = new Scanner(System.in);
                System.out.println("Give number of people to accommodate: ");
                int numOfPeople = scannerPeople.nextInt();
                ArrayList<HostPlace> hostPlacesByPeople = customer.searchByPeople(numOfPeople);
                if(hostPlacesByPeople != null) {
                    for (HostPlace hostPlace : hostPlacesByPeople) {
                        Helper.printHostPlaceInfo(hostPlace);

                    }
                }
            case 6:
                Scanner scannerPrice = new Scanner(System.in);
                System.out.println("Give price: ");
                double price = scannerPrice.nextDouble();
                ArrayList<HostPlace> hostPlacesByPrice = customer.searchByPrice(price);
                if(hostPlacesByPrice != null) {
                    for (HostPlace hostPlace : hostPlacesByPrice) {
                        Helper.printHostPlaceInfo(hostPlace);
                    }
                }
            default:
                break;
        }

    }

    public int getCriteriaChoice(){
        Scanner scanner = new Scanner(System.in);
        int criteriaChoice = 0;
        do{
            //title, location, address, space, price, num of people
            System.out.println("a) Press 1 to search by title");
            System.out.println("b) Press 2 to search by location");
            System.out.println("c) Press 3 to search by address.");
            System.out.println("d) Press 4 to search by space.");
            System.out.println("e) Press 5 to search by num of people to accommodate.");
            System.out.println("f) Press 6 to search by price");
            criteriaChoice = scanner.nextInt();
        }while(criteriaChoice != 1 && criteriaChoice != 2 && criteriaChoice != 3 && criteriaChoice != 4 && criteriaChoice != 5 && criteriaChoice != 6);
        return criteriaChoice;
    }


}
