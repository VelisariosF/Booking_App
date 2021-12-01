import java.util.Scanner;

public class Login {
    public static void showMenu(){
        Scanner scanner = new Scanner(System.in);
        String username, password, role;
        System.out.println("----- Login -----");
        System.out.println("Insert username: ");
        username = scanner.nextLine();
        System.out.println("Insert password: ");
        password = scanner.nextLine();
        System.out.println("Insert role: ");
        role = scanner.nextLine();


        User tempUser = new User(username, password, role);
        User user = (Helper.userExistsInTheSystem(tempUser);
        if(user != null){
            if(user instanceof Customer){
                ((Customer)user).customerMenu();

            }if(user instanceof Supplier){
                Supplier supplier = ((Supplier) user);
                supplier.supplierMenu();
                int choice = scanner.nextInt();
                switch (choice){
                    case 1:
                        HostPlace newHostPlace = HostPlace.createHostPlace();
                        supplier.addHostPlace(newHostPlace);

                }


            }else {
                ((Administrator) user).administratorMenu();

            }            //change to new page

        }else{
            //show message to inset again the credentials
            System.out.println("User does not exist.");
        }
    }

}
