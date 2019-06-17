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
      
      //
      //INSERINDO USUARIOS
      //
      System.out.println("Inserindo usuario Mateus");
      Son usuarioMateus = userController.newUser("Mateus", "mfladeira@gmail.com", 4321);
      System.out.println("Usuario inserido: " + usuarioLucas);
      System.out.println("Email do usurio: " + usuarioLucas.getEmail());
      //.................//
      userController.newUser("Lucas", "lucascercun@gmail.com", 1234);
      userController.newUser("Leandro", "lend1@gmail.com", 123);
      userController.newUser("Marcos", "email@email.com", 4422);
      //................//      

      //
      //REALIZANDO LOGIN
      //retorna usuario filho, ou null
      System.out.println("\n\nLogando com usuario Lucas");
      Son currentUser = userController.login("lucascercun@gmail.com", 1234);
      System.out.println("Usuário logado: " + currentUser);
      System.out.println("Email do usuário logado: "+ currentUser.getEmail());

      //
      //ATRIBUINDO UMA MAE AO USUARIO LOGADO
      // função setMother cria um usuario que é filho e mãe e atribui ao usuario logado
      System.out.println("\n\nAtribuindo mae ao usuario:" + currentUser);
      userController.setMother(currentUser, "Marcia", "mar.cer@gmail.com", 12345);
      System.out.println("Mãe do usuario " + currentUser + ": " + currentUser.getMother());
      System.out.println("Email da mae do usuario " + currentUser + ":" + currentUser.getMother().getEmail());

      //
      //REALIZANDO ATIVIDADES DE MEDIA
      //
      //



      //PLAY MEDIA DE AUDIIO
      // ((Audio)mediaController.getMediasByParam("type", "Audio").get(0)).playMedia();
  
      // new PanelLogin(userController, mediaController);
   }
}


