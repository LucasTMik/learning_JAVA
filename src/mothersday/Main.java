package mothersday;

import javax.swing.*;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
<<<<<<< HEAD
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.sound.sampled.*;



=======
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
>>>>>>> b27a9a231fcb141f7a61a9acd7d4d7e4df6f0995
import mothersday.models.*;
import mothersday.controllers.*;
import mothersday.contracts.*;
import mothersday.lib.*;
import mothersday.views.*;


public class Main
{ 
   public static void abrirlink() {
        try {
          URI uri = new URI("https://www.youtube.com/watch?v=C3kJRvq3toA");
          Desktop desktop = null;
          if (Desktop.isDesktopSupported()) {
            desktop = Desktop.getDesktop();
          }
    
          if (desktop != null)
            desktop.browse(uri);
        } catch (IOException ioe) {
          ioe.printStackTrace();
        } catch (URISyntaxException use) {
          use.printStackTrace();
        }
    };

   public static void main(final String[] arguments)
   {
<<<<<<< HEAD
      // Son currentUser = UserController.login("lucascerun", 1234);
      // System.out.println(currentUser);
      UserController controller = new UserController();

      MediaDatabase dbMedia = new MediaDatabase();

      controller.NewUser("Lucas", "lucascer", 1234);
      // controller.NewUser("Mateus", "mateus", 1234);
      Son currentUser = controller.login("lucascer", 1234);
      // System.out.println(currentUser.getName());

      // controller.setName(currentUser, currentUser, "Lukinha");

      Son motherAsSon = controller.setMother(currentUser, "Marcia", "marcunha" , 123);
      // System.out.println(motherAsSon.getAsMother().getSon().getName());

      String frase = "Hello tudo bem to testando essa midia que eh so uma frase boba";
      String link = "https://google.com.br";

      MediaController mediaController = new MediaController();

      Calendar cal = new GregorianCalendar(2019, 10, 18);



      mediaController.scheduleMedia(currentUser, MediaTypes.FRASE, "MothersDAy", frase, cal );
      mediaController.scheduleMedia(currentUser, MediaTypes.VIDEO, "MothersDayVideo", link, cal );
      mediaController.scheduleMedia(currentUser, MediaTypes.AUDIO, "MothersDayAudio", "music.wav", cal );

      System.out.println(mediaController.getMedias());

      ((Audio)mediaController.getMediaByParam("type", "").get(0)).playMedia();

      // playSound("music.wav"); 
      // while(true) {}
=======
      //função abrirlink();
      //new PanelLogin();   
      
>>>>>>> b27a9a231fcb141f7a61a9acd7d4d7e4df6f0995
   }


}


