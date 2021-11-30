import java.util.ArrayList;

public class Helper {
    private static ArrayList<User> users = new ArrayList<User>();

    public static boolean userExistsInTheSystem(User user){
        for(User tempUser : users){
            if(tempUser.getUsername().equals(user.getUsername())){
                if(tempUser.getRole().equals(user.getRole())){
                    return true;
                }else {
                    return false;
                }
            }
        }
        return false;
    }
}
