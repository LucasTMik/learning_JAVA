package mothersday.views;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import mothersday.controllers.*;
import mothersday.users.*;


public class JPanelExemplo
{
   private JFrame jFrame;
   private JPanel panel1;
   private JPanel panel2;
   private JPanel panelBtns;
   private JButton btn1;
   private JButton btn2;
   private JTextField textFieldNome;
   private JTextField textFieldSenha;

  
   public JPanelExemplo() {
        iniciarComponentes();
    }


   private void iniciarComponentes()
   {
        jFrame = new JFrame("Dia das Mães");
        jFrame.setLayout(new GridLayout(0,1));

        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(0,1));

        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(0,1));  

        panelBtns = new JPanel();
        panelBtns.setLayout(new GridLayout(1,0));

        btn1 = new JButton("Logar");
        btn2 = new JButton("Cancel");

        textFieldNome = new JTextField(25);
        textFieldSenha = new JTextField(25);

        panel1.add(new JLabel("Nome: "));
        panel1.add(textFieldNome);

        panel2.add(new JLabel("Senha: "));
        panel2.add(textFieldSenha);

        panelBtns.add(btn1);
        panelBtns.add(btn2);

        jFrame.add(panel1);
        jFrame.add(panel2);
        jFrame.add(panelBtns);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String email = textFieldNome.getText();

               int pass = Integer.parseInt(textFieldSenha.getText().trim());

               Son currentUser = UserController.login(email,pass);
               System.out.println(currentUser);
               try {
                JOptionPane.showInputDialog(currentUser.getName());
               } catch(Exception error) {

               }

          }
        }
        );

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               System.exit(0);                
            }
          }
        );

        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(jFrame.DISPOSE_ON_CLOSE);
        jFrame.setVisible(true);
    } 
 
}