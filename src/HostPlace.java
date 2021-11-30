public class HostPlace {
    private  String title, location, address, space;
    private double pricePerDay;
    private int firstDayOfRent, lastDayOfRent, daysToBeRent, numOfPeopleThatCanBeAccommodated;
    private boolean isRented;

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

    public String getSpace() {
        return space;
    }

    public void setSpace(String space) {
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


}
