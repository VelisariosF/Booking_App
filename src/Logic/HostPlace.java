package Logic;

import java.util.Scanner;

public class HostPlace {
    private  String title, location, address;
    private double pricePerDay, space;
    private int firstDayOfRent, lastDayOfRent, daysToBeRent, numOfPeopleThatCanBeAccommodated;
    private boolean isRented;

    public HostPlace(){

    }
    public HostPlace(String title, String location, String address, double space, int numOfPeopleThatCanBeAccommodated, double pricePerDay){
        this.title = title;
        this.location = location;
        this.address = address;
        this.space = space;
        this.numOfPeopleThatCanBeAccommodated = numOfPeopleThatCanBeAccommodated;
        this.pricePerDay = pricePerDay;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title.toLowerCase();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSpace() {
        return space;
    }

    public void setSpace(double space) {
        this.space = space;
    }

    public int getNumOfPeopleThatCanBeAccommodated() {
        return numOfPeopleThatCanBeAccommodated;
    }

    public void setNumOfPeopleThatCanBeAccommodated(int numOfPeopleThatCanBeAccommodated) {
        this.numOfPeopleThatCanBeAccommodated = numOfPeopleThatCanBeAccommodated;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public int getFirstDayOfRent() {
        return firstDayOfRent;
    }

    public void setFirstDayOfRent(int firstDayOfRent) {
        this.firstDayOfRent = firstDayOfRent;
    }

    public int getLastDayOfRent() {
        return lastDayOfRent;
    }

    public void setLastDayOfRent(int lastDayOfRent) {
        this.lastDayOfRent = lastDayOfRent;
    }

    public int getDaysToBeRent() {
        return daysToBeRent;
    }

    public void setDaysToBeRent(int daysToBeRent) {
        this.daysToBeRent = daysToBeRent;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }


    public static HostPlace createHostPlace(){

        Scanner scanner = new Scanner(System.in);
        String title, location, address;
        double pricePerDay, space;
        int numOfPeopleThatCanBeAccommodated;

        System.out.println("Insert title: ");
        title = scanner.nextLine();
        System.out.println("Insert location: ");
        location = scanner.nextLine();
        System.out.println("Insert address: ");
        address = scanner.nextLine();
        System.out.println("Insert space in m^2: ");
        space = scanner.nextDouble();
        System.out.println("Insert numOfPeopleThatCanBeAccommodated: ");
        numOfPeopleThatCanBeAccommodated = scanner.nextInt();
        System.out.println("Insert price per day: ");
        pricePerDay = scanner.nextDouble();

        return new HostPlace(title, location, address, space, numOfPeopleThatCanBeAccommodated, pricePerDay);
    }



}
