package Logic;

import java.util.Scanner;

public class Customer extends User {

    public Customer(String usrm, String pass){

            super(usrm,pass,"customer" );

    }
    // 1, search by title
    // 2, search by  location
    // 3, search by  address
    // 4, search by  space in m^2
    // 5, search by  num of people to accommodate
    // 6, search by  price per day
    public HostPlace getHostPlaceByCriteria(int criteria){
        return null;
    }
}
