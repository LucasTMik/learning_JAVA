package mothersday;

import java.util.ArrayList;
import java.util.List;

import mothersday.users.*;
import mothersday.controllers.*;

public class Main
{
   public static void main(final String[] arguments)
   {
      User user = UserController.newUser("Lucas", "lucascer", 123);
      System.out.println(user.getAsMother());
   }
}