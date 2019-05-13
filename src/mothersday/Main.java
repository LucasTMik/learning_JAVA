package mothersday;

import mothersday.users.*;
import mothersday.controllers.*;
public class Main
{
   public static void main(final String[] arguments)
   {
        User user = UserController.NewUser("", "");
        System.out.println("Hello main");
        System.out.println(user.toString());
   }
}