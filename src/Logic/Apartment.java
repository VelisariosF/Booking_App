package Logic;

public class Apartment extends HostPlace{
    public Apartment(){
        super();
    }
    boolean hasWifi, haskitchen;

    public boolean isHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    public boolean isHaskitchen() {
        return haskitchen;
    }

    public void setHaskitchen(boolean haskitchen) {
        this.haskitchen = haskitchen;
    }
}
