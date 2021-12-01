package GUI;
import Logic.*;

import java.util.Scanner;

public class CustomerHomePage {
    Customer customer;
    int choice;
    public CustomerHomePage(Customer customer){
        this.customer = customer;
        choice = customerChoice();
        beginAction(choice);
    }

    public int customerChoice(){
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do{
            System.out.println("a) Press 1 to search a host place by criteria.");
            System.out.println("b) Press 2 to book a host place.");
            System.out.println("c) Press 3 to cancel a book of a host place.");
            System.out.println("d) Press 4 to show info about you.");
        }while (choice != 1 && choice != 3 && choice != 3 && choice != 4);

        //continue
        return choice;
    }
    public void beginAction(int choice){
        switch (choice){
            case 1:
            //     customer.
        }
    }

}
