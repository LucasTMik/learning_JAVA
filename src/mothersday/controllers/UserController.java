package mothersday.controllers;
import mothersday.users.*;
import mothersday.contracts.IDefaultUser;

import java.util.ArrayList;
import java.util.List;

public class UserController 
{
    //CRIA NOVO USUARIO SON
    public static User newUser(String name, String email, int password) 
    {
        Son auxSon = new Son();
        return new User(name, email, password, auxSon);
    }

    

}