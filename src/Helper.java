import java.util.ArrayList;

public class Helper {
    private static ArrayList<User> users = new ArrayList<User>();

    public static User userExistsInTheSystem(User user){
        for(User tempUser : users){
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

    public static ArrayList<User> getUsers() {
        return users;
    }

    public static void setUsers(ArrayList<User> users) {
        Helper.users = users;
    }
}
