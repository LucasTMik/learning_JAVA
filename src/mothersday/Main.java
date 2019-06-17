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
      //Inserindo exemplos de usuario
      Son ma = userController.newUser("Mateus","mateusladeira79@gmail.com",1234);
      Son lu = userController.newUser("Lucas","lucascercun@gmail.com",4567);
      Son le = userController.newUser("Leandro","lend@gmail.com",7891);

      //Inserindo exemplo de mãe
      userController.setMother(le,"Adrina","adrina@gmail.com",5566);
      
      Calendar calend = new GregorianCalendar(2019,6,30);
      
      mediaController.scheduleMedia(le,MediaTypes.FRASE,"No puedo más","Mi corazón",calend);
      mediaController.scheduleMedia(le,MediaTypes.VIDEO,"Viral","https://www.youtube.com/watch?v=hl4w8-cqA_8",calend);
      // new PanelHome(userController);
      
      System.out.println(userController.getUsers()); 
      System.out.println(mediaController.getMedias());
      
      new PanelLogin(userController, mediaController);
      // JFileChooser j = new JFileChooser(); 
      
      // Open the save dialog 
      // j.showSaveDialog(null);
   }
}


