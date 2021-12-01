package Logic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    public static User checkUserCredentials(User user){
       User tempUser = (Login.userExistsInTheSystem(user));
       if(tempUser != null){
           if(tempUser instanceof Customer){
               Customer customer = ((Customer)tempUser);
               return customer;
           }if(tempUser instanceof Supplier){
               Supplier supplier = ((Supplier) tempUser);
               return supplier;
           }else {
               Administrator administrator = ((Administrator) tempUser);
               return administrator;
           }            //change to new page

       }else{
           return null;
           //show message to inset again the credentials
       }
   }

    public static User userExistsInTheSystem(User user){
        ArrayList<User> systemUsers = Helper.getUsers();
        for(User tempUser : systemUsers){
            if(tempUser.getUsername().equals(user.getUsername())){
                if(tempUser.getRole().equals(user.getRole())){
                    return tempUser;
                }else {
                    return null;
                }
            }
        }
        return null;
    }





}
