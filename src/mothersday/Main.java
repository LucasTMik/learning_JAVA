package mothersday;

import java.util.ArrayList;
import java.util.List;

import mothersday.users.*;
import mothersday.controllers.*;
import mothersday.contracts.*;
import mothersday.lib.SonDatabase;
import javax.swing.*;


public class Main
{
   public static void main(final String[] arguments)
   {
      // Son currentUser = UserController.login("lucascerun", 1234);
      // System.out.println(currentUser);
      UserController controller = new UserController();

      controller.NewUser("Lucas", "lucascer", 1234);
      controller.NewUser("Mateus", "mateus", 1234);
      controller.NewUser("Zé", "ze", 1234);

      Son test = controller.login("lucascer", 1234);
      System.out.println(test);


   }
}