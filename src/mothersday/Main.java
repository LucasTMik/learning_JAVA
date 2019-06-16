package mothersday;

import javax.swing.*;



import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.sound.sampled.*;



import java.awt.Desktop;
import javax.swing.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import mothersday.models.*;
import mothersday.controllers.*;
import mothersday.contracts.*;
import mothersday.lib.*;
import mothersday.views.*;


public class Main
{ 
   public static void main(final String[] arguments)
   {
      UserController userController = new UserController();
      MediaController mediaController = new MediaController();
      new PanelLogin(userController, mediaController);
      // new PanelHome(userController);
      
      // JFileChooser j = new JFileChooser(); 
      
      // Open the save dialog 
      // j.showSaveDialog(null);
   }
}


