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
      System.out.println("Usuario inserido: " + usuarioMateus);
      System.out.println("Email do usurio: " + usuarioMateus.getEmail());
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
      //REALIZANDO SETS EM USUARIO LOGADO
      System.out.println("Trocando Nome de usuario logado");
      userController.setName(currentUser, currentUser, "Lukinhas");
      System.out.println("Nome trocado: " + currentUser);      
      //
      System.out.println("Trocando senha de usuario logado");
      System.out.println(userController.setPass(currentUser, currentUser, 12345));
      //


      //
      //ATRIBUINDO UMA MAE AO USUARIO LOGADO
      // função setMother cria um usuario que é filho e mãe e atribui ao usuario logado
      System.out.println("\n\nAtribuindo mae ao usuario:" + currentUser);
      Son lucasMother = userController.setMother(currentUser, "Marcia", "mar.cer@gmail.com", 12345);
      System.out.println("Mãe do usuario " + currentUser + ": " + currentUser.getMother());
      System.out.println("Email da mae do usuario " + currentUser + ": " + currentUser.getMother().getEmail());
      //
      userController.setMother(usuarioMateus, "Adriana","adri@gmail.com",1234);

      //
      //REALIZANDO ATIVIDADES DE MEDIA
      //
      System.out.println("\n\nAgendando midia de Frase para data de 20/11/2019 com o usuario logado");
      Calendar data = new GregorianCalendar(2019,10,20);
      String frase = "No seu ventre carrega o milagre da vida, no coracao o amor incondicional. Para toda mulher que e Mae, feliz dia das Maes!";
      mediaController.scheduleMedia(currentUser, MediaTypes.FRASE, "Primeira midia", frase, data);

      //------------//
      mediaController.scheduleMedia(usuarioMateus, MediaTypes.VIDEO, "Primeira midia do mateus", "https://www.youtube.com/watch?v=7BTcpwW0Sxs", data);
      mediaController.scheduleMedia(currentUser, MediaTypes.AUDIO, "Segunda midia", "music.wav", data);
      //-----------//      


      //BUSCA DE TODAS AS MIDIAS
      System.out.println("\nBuscando todas as midias");
      ArrayList<Media> medias = mediaController.getMedias();
      System.out.println(medias);
      
      //BUSCA DE MIDIA POR USUARIO
      System.out.println("\nBuscando todas as midias do usuario logado");
      ArrayList<Media> currentUserMedias = mediaController.getMediaByParam("userEmail", currentUser.getEmail());
      System.out.println(currentUserMedias);
      
      //DANDO NOTA PARA UMA MIDIA
      System.out.println("\nDando nota para a midia do usuario logado");
      mediaController.rateMedia(lucasMother.getAsMother(), currentUserMedias.get(0), 8.0f);
      System.out.println("Nota da primeira midia do usuairo logado: " + mediaController.getMediaByParam("userEmail", currentUser.getEmail()).get(0).getGrade());
      //-------//
      mediaController.rateMedia(lucasMother.getAsMother(), mediaController.getMediaByParam("userEmail", currentUser.getEmail()).get(1), 6.0f);
      //------//   

      //BUSCA DE MIDIA POR NOTA
      System.out.println("\nBuscando todas as midias por nota maior ou igual a 8");
      System.out.println(mediaController.getMediaByParam("notaGtEq", "8.0"));
      System.out.println("\nBusca todas as midias por nota menor ou igual a 8");
      System.out.println(mediaController.getMediaByParam("notaLtEq", "8.0"));


      




      //PLAY MEDIA DE AUDIIO
      // ((Audio)mediaController.getMediasByParam("type", "Audio").get(0)).playMedia();
  
      // new PanelLogin(userController, mediaController);
   }
}


