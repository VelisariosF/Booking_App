public class Customer extends User {

    public Customer(String usrm, String pass){

            super(usrm,pass,"Customer" );

    }

    public void customerMenu(){
        System.out.println("a) Press 1 to search a host place by criteria.");
        System.out.println("b) Press 2 to book a host place.");
        System.out.println("c) Press 3 to cancel a book of a host place.");
        System.out.println("d) Press 4 to show info about you.");
    }

}
