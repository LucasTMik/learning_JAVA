package mothersday.views;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import mothersday.controllers.*;
import mothersday.users.*;

public class PanelLogin
{
   private JFrame jFrame;
   private JPanel panel1;
   private JPanel panel2;
   private JPanel panelBtns;
   private JButton btn1;
   private JButton btn2;
   private JButton btn3;
   private JTextField textFieldNome;
   private JTextField textFieldSenha;
   private JFrame jFrame2;
   private JPanel panelc1;
   private JPanel panelc2;
   private JPanel panelc3;
   private JPanel panelc4; 
   private JButton btn4; //Botão criar conta
   private JTextField textFieldNome2;
   private JTextField textFieldEmail2;
	 private JTextField textFieldSenha2;

	 UserController userController = new UserController();

   public PanelLogin() {
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
        btn3 = new JButton("Criar Conta");

        textFieldNome = new JTextField(25);
        textFieldSenha = new JTextField(25);

        panel1.add(new JLabel("Nome: "));
        panel1.add(textFieldNome);

        panel2.add(new JLabel("Senha: "));
        panel2.add(textFieldSenha);

        panelBtns.add(btn1);
        panelBtns.add(btn2);
        panelBtns.add(btn3);

        jFrame.add(panel1);
        jFrame.add(panel2);
        jFrame.add(panelBtns);
        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(jFrame.DISPOSE_ON_CLOSE);
        jFrame.setVisible(true);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String email = textFieldNome.getText();
               int pass = Integer.parseInt(textFieldSenha.getText().trim());

               Son currentUser = userController.login(email,pass);
               System.out.println(currentUser);
              
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


        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                jFrame2 = new JFrame("Tela Criar Conta");
                jFrame2.setLayout(new GridLayout(0,1));

                panelc1 = new JPanel();
                panelc1.setLayout(new GridLayout(0,1));

                panelc2 = new JPanel();
                panelc2.setLayout(new GridLayout(0,1));

                panelc3 = new JPanel();
                panelc3.setLayout(new GridLayout(0,1));

                panelc4 = new JPanel();
                panelc4.setLayout(new GridLayout(0,1));

                btn4 = new JButton("Criar");

                textFieldNome2 = new JTextField(25);
                textFieldEmail2 = new JTextField(25);
                textFieldSenha2 = new JTextField(25);

                panelc1.add(new JLabel("Nome: "));
                panelc1.add(textFieldNome2);

                panelc2.add(new JLabel("Email: "));
                panelc2.add(textFieldEmail2);

                panelc3.add(new JLabel("Senha: "));
                panelc3.add(textFieldSenha2);

                panelc4.add(btn4);

                jFrame2.add(panelc1);
                jFrame2.add(panelc2);
                jFrame2.add(panelc3);
                jFrame2.add(panelc4);
                jFrame2.pack();
                jFrame2.setLocationRelativeTo(null);
                jFrame2.setDefaultCloseOperation(jFrame.DISPOSE_ON_CLOSE);
                jFrame2.setVisible(true);
                btn4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String nome2 = textFieldNome2.getText();
                        String email2 = textFieldEmail2.getText();
                        int pass2 = Integer.parseInt(textFieldSenha2.getText().trim());
                        Son test = userController.NewUser(nome2,email2,pass2); 
												System.out.println(test);
												//jFrame2.setVisible(false);
                    }
                  }
                );  
            }
          }
        );
        
    } 
 
}