import java.util.Scanner;

public class Registration {
    public static void registerMenu(){
        String username, password, confirmation_password, role;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("----- Registration -----");
            System.out.println("Insert username: ");
            username = scanner.nextLine();
            System.out.println("Insert password: ");
            password = scanner.nextLine();
            System.out.println("Confirm new password: ");
            confirmation_password = scanner.nextLine();
            System.out.println("Insert role: ");
            role = scanner.nextLine();
        }while (role != "customer" && role != "supplier");
        User user = new User(username, password, role);
        Helper.getUsers().add(user);
    }
}
