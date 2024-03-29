package mothersday.controllers;
import mothersday.models.*;
import mothersday.contracts.IDefaultUser;
import mothersday.lib.SonDatabase;

import java.util.ArrayList;
import java.util.List;

public class UserController 
{

    SonDatabase dbUser = new SonDatabase();

    public Son setAsAdmin(Son currentUser, Son user) {
        if(currentUser.getAsAdmin() != null)
            user.setAsAdmin(new Admin());
        return user;
    }

    public Son toggleBlock(Son currentUser, Son user) {
        if(currentUser.getAsAdmin() != null)
            user.toggleBlock(!user.isBlocked());
        return user;
    }

    //CRIA NOVO USUARIO SON
    public Son newUser(String name, String email, int password) 
    {

        List<Son> users = dbUser.getItems();                

        for(Son user : users) {
            if(user.getEmail().equals(email)) {
                System.out.println("Conta já existente");
                return null;
            } 
        }

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
            Son motherAsSon = this.newUser(name, email, password);
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

    //SET NAME, PASS E EMAIL E SALVA NO BANCO
    public boolean setName(Son currentUser, Son user, String name) 
    {
        ArrayList<Son> userList = dbUser.getByParam("email", user.getEmail());
        if(userList.size() != 0 && (currentUser.getAsAdmin() != null || userList.get(0) == currentUser || userList.get(0) == currentUser.getMother().getAsSon())) 
            return userList.get(0).setName(name);
        
        return false;
    }

    public boolean setPass(Son currentUser, Son user, int pass) 
    {
        ArrayList<Son> userList = dbUser.getByParam("email", user.getEmail());
        if(userList.size() != 0 && (currentUser.getAsAdmin() != null || userList.get(0) == currentUser || userList.get(0) == currentUser.getMother().getAsSon())) {
            return userList.get(0).setPass(pass);
        }
        return false;
    }

    public boolean setEmail(Son currentUser, Son user, String email) 
    {
        ArrayList<Son> userList = dbUser.getByParam("email", user.getEmail());
        if(userList.size() != 0 && (currentUser.getAsAdmin() != null || userList.get(0) == currentUser || userList.get(0) == currentUser.getMother().getAsSon())) {
            return userList.get(0).setEmail(email);
        }
        return false;
    }


    public ArrayList<Son> getUsers() {
        return dbUser.getItems();
    }

    public ArrayList<Son> getUsersByParam(String param, String val) {
        return dbUser.getByParam(param, val);
    }



    //ADMIN FUFNCRIONS 
    public boolean removeUser(Son currentUser, Son user) {
        if(currentUser.getAsAdmin() != null) {
            return dbUser.removeItem(user);          
        }
        return false;
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
    