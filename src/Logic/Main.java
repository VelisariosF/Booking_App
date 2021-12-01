package Logic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
     //  GUI.LogInGui.showMenu();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println("a) Press 1 to search bookings .");
            System.out.println("b) Press 2 to search users .");
            //when a user is accepted send them a confirmation message
            System.out.println("c) Press 3 to check incoming and accept users.");
            System.out.println("d) Press 4 to send a message to a user");
            choice = scanner.nextInt();
        }while (choice != 1 && choice != 3 && choice != 3 && choice != 4);
    }
}
