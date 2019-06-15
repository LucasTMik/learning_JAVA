package mothersday;

import javax.swing.*;

import java.util.ArrayList;
import java.util.List;


import mothersday.models.*;
import mothersday.controllers.*;
import mothersday.contracts.*;
import mothersday.lib.*;
import mothersday.views.*;

public class Main
{  
   public static void main(final String[] arguments)
   {
      // Son currentUser = UserController.login("lucascerun", 1234);
      // System.out.println(currentUser);
      UserController controller = new UserController();

      controller.NewUser("Lucas", "lucascer", 1234);
      controller.NewUser("Mateus", "mateus", 1234);
      Son currentUser = controller.login("lucascer", 1234);
      System.out.println(currentUser.getName());

      controller.setName(currentUser, currentUser, "Lukinha");

      Son motherAsSon = controller.setMother(currentUser, "Marcia", "marcunha" , 123);
      System.out.println(motherAsSon.getAsMother().getSon().getName());
   }
}


