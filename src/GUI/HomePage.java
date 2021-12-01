package GUI;
import Logic.*;
public class HomePage {
    public static void showUserOptions(User user){
            int userChoice = 0;
            User tempUser = (Logic.Login.userExistsInTheSystem(user));
            if(tempUser != null){
                if(tempUser instanceof Customer){
                    Customer customer = ((Customer)tempUser);
                    userChoice = customer.customerChoice();
                }if(tempUser instanceof Supplier){
                    Supplier supplier = ((Supplier) tempUser);
                    userChoice = supplier.supplierChoice();
                }else {
                    Administrator administrator = ((Administrator) tempUser);
                    userChoice = administrator.administratorChoice();
                }

            }
        }
}


