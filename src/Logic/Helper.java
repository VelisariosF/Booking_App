package Logic;

import java.util.ArrayList;

public class Helper {
    private static ArrayList<User> users = new ArrayList<User>();
    private static ArrayList<HostPlace> hostPlaces = new ArrayList<>();
    public static ArrayList<User> getUsers() {
        return users;
    }

    public static void setUsers(ArrayList<User> users) {
        Helper.users = users;
    }

    public static ArrayList<HostPlace> getHostPlaces() {
        return hostPlaces;
    }

    public static void setHostPlaces(ArrayList<HostPlace> hostPlaces) {
        Helper.hostPlaces = hostPlaces;
    }

    public static void createRandomUser(){
        Customer customer = new Customer("John_cust", "1234");
        Supplier supplier = new Supplier("Mike_sup", "1234");
        Administrator administrator = new Administrator("Daniel_admin", "1234");
        users.add(customer);
        users.add(supplier);
        users.add(administrator);
    }

    public static void printHostPlaceInfo(HostPlace hostPlace){
        System.out.println("Title: " + hostPlace.getTitle());
        System.out.println("Location: " + hostPlace.getLocation());
        System.out.println("Address: " + hostPlace.getAddress());
        System.out.println("space in m^2 : " + hostPlace.getSpace());
        System.out.println("Number of People : " + hostPlace.getNumOfPeopleThatCanBeAccommodated());
        System.out.println("price per day : " + hostPlace.getPricePerDay());
        System.out.println("===============");

    }

}
