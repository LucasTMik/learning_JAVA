package mothersday.controllers;
import mothersday.users.*;
import mothersday.contracts.IDefaultUser;

import java.util.ArrayList;
import java.util.List;

public class UserController 
{
    //CRIA NOVO USUARIO SON
    public static Son NewUser(String name, String email, int password) 
    {
        return new Son(name, email,password);
    }

    //CRIA USUARIO MAE PARA SON
    public static Son setMother(Son son, String email, String name, int password) 
    {
        //IF SON NAO TEM MAE 
        //CRIA SON SETA MAE
        //SAVE NO BANCO E RETORNA MAE
        if(son.getMother() == null) {
            Son motherAsSon = UserController.NewUser(name, email, password);
            Mother mother = new Mother(name, email, password);
            mother.setSon(son);
            son.setMother(mother);
            return motherAsSon;
        } else {
            System.out.println("JÁ EXISTE UMA MAE COM ESTE USUARIO");
            return son.getMother().getSon();
        }
    }

    //SET NAME E PASS E SALVA NO BANCO
    public static boolean setName(User user, String name) 
    {
        return user.setName(name);
    }

    public static boolean setPass(User user, int pass) 
    {
        return user.setPass(pass);
    }


    ////////////////////////////////////////
    //////           LOGIN            //////
    ////////////////////////////////////////

    public static IDefaultUser login(String email, int pass) {
        List<IDefaultUser> users = new ArrayList<IDefaultUser>();
        users.add(UserController.NewUser("Lucas","email", 123));
        users.add(UserController.NewUser("Mateus", "email",123));
        users.add(UserController.NewUser("Tiago","email", 123));

        for(IDefaultUser son : users) {
            if(son.getEmail() == email && son.tryPass(pass))
                return son.getMother();
        }
        return null;
    }

}