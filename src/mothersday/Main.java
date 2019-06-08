package mothersday;

import mothersday.users.*;
import mothersday.controllers.*;
public class Main
{
   public static void main(final String[] arguments)
   {
      User test = UserController.NewUser("Lucas", 234192);

      System.out.println(test);
   }
}