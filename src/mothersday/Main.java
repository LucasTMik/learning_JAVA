package mothersday;

import java.util.ArrayList;
import java.util.List;

import mothersday.users.*;
import mothersday.controllers.*;
import mothersday.contracts.*;

public class Main
{
   public static void main(final String[] arguments)
   {
      Son currentUser;
      try {
         currentUser = UserController.login("marcer", 123);
         System.out.println("Usuario logado " + currentUser.getName());
         System.out.println("Filho do usuario logado " + currentUser.getAsMother().getSon().getName());
      } catch(Exception err) {
         System.out.println("ERROR:" + err);
      }
   }
}