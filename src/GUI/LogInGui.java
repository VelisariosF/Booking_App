package GUI;

import Logic.*;

import java.util.Scanner;

public class LogInGui {
    public static void showMenu(){
        boolean flag = false;
        do{
            String username, password, role;
            Scanner scanner = new Scanner(System.in);
            System.out.println("----- Logic.Login -----");
            System.out.println("Insert username: ");
            username = scanner.nextLine();
            System.out.println("Insert password: ");
            password = scanner.nextLine();
            do{
                System.out.println("Insert role: customer or supplier or administrator ");
                role = scanner.nextLine().toLowerCase();
            }while (!role.equals("customer") && !role.equals("supplier") && !role.equals("administrator"));


            User user = Logic.Login.checkUserCredentials(new User(username, password, role));
            if(user != null){
                GUI.HomePage.showUserOptions(user);
                flag = true;
            }else{
                System.out.println("User does not exist.");
            }

        } while(flag == false);
    }
}
