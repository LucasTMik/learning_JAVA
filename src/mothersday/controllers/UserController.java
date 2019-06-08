package mothersday.controllers;
import mothersday.users.*;
import mothersday.contracts.IDefaultUser;

public class UserController 
{
    public static User NewUser(String name, int password) 
    {
        return new Son(name, password);
    }

    public static User[] setMother(User currentUser, User mother) 
    {
        mother.setSon(currentUser);
        currentUser.setMother(mother);
        return [
            mother,
            currentUser
        ];
    }

    private static User NewMother(String name, User son)
    {
        return new Mother(son);
    }

    public static Admin 
}