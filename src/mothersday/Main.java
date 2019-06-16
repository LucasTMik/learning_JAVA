package mothersday;

import javax.swing.*;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.awt.Desktop;
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
      //função abrirlink();
      //new PanelLogin();   
      
   }
}


