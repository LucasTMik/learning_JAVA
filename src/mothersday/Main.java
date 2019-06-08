package mothersday;

import java.util.ArrayList;
import java.util.List;

import mothersday.users.*;
import mothersday.controllers.*;

public class Main
{
   public static void main(final String[] arguments)
   {
      // List<User> userArray = new ArrayList<User>();
      Son filho = UserController.NewUser("Lucas","lucascer", 234192);
      Son mae = UserController.setMother(filho, "lucascer", "Marcia", 1234);
      // UserController.setMother(filho, "Marcia", 1234);
      // filho.setMothersName("Marcia change");
      // System.out.println(filho.getMother());


      System.out.println(UserController.login("Lucas", 123));

   }
}