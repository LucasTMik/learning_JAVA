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
    public static Son setMother(Son son, String name, String email, int password) 
    {
        //IF SON NAO TEM MAE 
        //CRIA SON SETA MAE
        //SAVE NO BANCO E RETORNA MAE
        if(son.getMother() == null) {
            System.out.println("Nao tem mae cadastrada");
            Son motherAsSon = UserController.NewUser(name, email, password);
            Mother mother = new Mother(name, email, password, motherAsSon);
            motherAsSon.setAsMother(mother);
            mother.setSon(son);
            son.setMother(mother);
            return motherAsSon;
        } else {
            System.out.println("JÁ EXISTE UMA MAE COM ESTE USUARIO");
            return null;
        }
    }

    //SET NAME E PASS E SALVA NO BANCO
    public static boolean setName(User currentUser, User user, String name) 
    {
        return user.setName(name);
    }

    public static boolean setPass(User currentUser, User user, int pass) 
    {
        return user.setPass(pass);
    }

    public static boolean setEmail(User currentUser, User user, String email) 
    {
        return user.setEmail(email);
    }

    


    ////////////////////////////////////////
    //////           LOGIN            //////
    ////////////////////////////////////////

    public static Son login(String email, int pass) {
        List<Son> users = new ArrayList<Son>();

        Son testUser = UserController.NewUser("Lucas","lucascer", 123);
        Son mother = UserController.setMother(testUser, "Marcia","marcer",123);
        users.add(testUser);
        users.add(mother);
        users.add(UserController.NewUser("Tiago","tiagosuter", 123));


        for(Son user : users) {
            if(user.getEmail() == email && user.tryPass(pass)) 
                return user;
        }
        return null;
    }

}