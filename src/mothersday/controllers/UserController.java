package mothersday.controllers;
import mothersday.users.*;
import mothersday.contracts.IDefaultUser;

public class UserController 
{
    public static User NewUser(String name, String password) 
    {
        return new User();
    }

    public static User SetNewAdmin(User currentUser, IDefaultUser user, User adminType) 
    {
        // return user.setAsAdmin(adminType);
        System.out.println("creating a admin");
        return new Admin();
    }
}