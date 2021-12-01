package GUI;
import Logic.*;
public class HomePage {
    public static void showUserHomePage(User user){
            User tempUser = (Logic.Login.userExistsInTheSystem(user));
            if(tempUser != null){
                if(tempUser instanceof Customer){
                    Customer customer = ((Customer)tempUser);
                    CustomerHomePage customerHomePage = new CustomerHomePage(customer);
                }if(tempUser instanceof Supplier){
                    Supplier supplier = ((Supplier) tempUser);
                    SupplierHomePage supplierHomePage = new SupplierHomePage(supplier);
                }else {
                    Administrator administrator = ((Administrator) tempUser);
                    AdministratorHomePage administratorHomePage = new AdministratorHomePage(administrator);
                }

            }
        }
}


