public class Administrator extends User{
    public Administrator(String usrm, String pass){
        super(usrm,pass,"Administrator" );
    }

    public void administratorMenu(){
        System.out.println("a) Press 1 to search bookings .");
        System.out.println("b) Press 2 to search users .");
        //when a user is accepted send them a confirmation message
        System.out.println("c) Press 3 to check incoming and accept users.");
        System.out.println("d) Press 4 to send a message to a user");
    }
}
