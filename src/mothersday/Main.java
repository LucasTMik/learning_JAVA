package mothersday;

import javax.swing.*;

import java.util.ArrayList;
import java.util.List;


import mothersday.users.*;
import mothersday.controllers.*;
import mothersday.contracts.*;
import mothersday.lib.*;
import mothersday.views.*;

public class Main
{  
   public static void main(final String[] arguments)
   {
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
             new Panelhome().setVisible(true);
         }
     });
   }
}


