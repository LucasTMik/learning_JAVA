package mothersday.controllers;
import mothersday.users.*;
import mothersday.contracts.IDefaultUser;
import mothersday.lib.SonDatabase;

import java.util.ArrayList;
import java.util.List;

public class UserController 
{

    SonDatabase dbUser = new SonDatabase();

    //CRIA NOVO USUARIO SON
    public Son NewUser(String name, String email, int password) 
    {

        List<Son> users = dbUser.getItems();                

        for(Son user : users) {
            if(user.getEmail().equals(email)) {
                System.out.println("Conta já existente");
                return null;
            } 
        }

        System.out.println(users);

        return dbUser.insert(new Son(name, email,password));
        // return new Son(name, email,password);
    }

    //CRIA USUARIO MAE PARA SON
    public Son setMother(Son son, String name, String email, int password) 
    {
        //IF SON NAO TEM MAE 
        //CRIA SON SETA MAE
        //SAVE NO BANCO E RETORNA MAE
        if(son.getMother() == null) {
            System.out.println("Nao tem mae cadastrada");
            Son motherAsSon = this.NewUser(name, email, password);
            Mother mother = new Mother(name, email, password, motherAsSon);
            motherAsSon.setAsMother(mother);
            mother.setSon(son);
            son.setMother(mother);
            return motherAsSon;
        } else {
            System.out.println("Ja EXISTE UMA MAE COM ESTE USUARIO");
            return null;
        }
    }

    //SET NAME E PASS E SALVA NO BANCO
    public boolean setName(User currentUser, User user, String name) 
    {
        
        return user.setName(name);
    }

    public boolean setPass(User currentUser, User user, int pass) 
    {
        return user.setPass(pass);
    }

    public boolean setEmail(User currentUser, User user, String email) 
    {
        return user.setEmail(email);
    }

    


    ////////////////////////////////////////
    //////           LOGIN            //////
    ////////////////////////////////////////
    public Son login(String email, int pass) {

        List<Son> users = dbUser.getItems();
        
        for(Son user : users) {
            if(user.getEmail().equals(email) && user.tryPass(pass)) {
                return user;
            }
        }
        return null;
    }

}
    