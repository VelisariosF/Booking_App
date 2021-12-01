package Logic;

import java.util.ArrayList;

public class Helper {
    private static ArrayList<User> users = new ArrayList<User>();

    public static ArrayList<User> getUsers() {
        return users;
    }

    public static void setUsers(ArrayList<User> users) {
        Helper.users = users;
    }

    public void createRandomUser(){
        Customer customer = new Customer("John_cust", "1234");
        Supplier supplier = new Supplier("Mike_sup", "1234");
        Administrator administrator = new Administrator("Daniel_admin", "1234");
        users.add(customer);
        users.add(supplier);
        users.add(administrator);
    }

}
