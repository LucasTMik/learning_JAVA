package mothersday.views;

import javax.swing.event.*;  
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import mothersday.controllers.*;
import mothersday.models.*;

public class PanelHome {  
    private JFrame f;
    private JFrame frameEMon; // Frame editar mãe
    private JFrame frameESon; // Frame editar Filho 
    private JFrame frameAgen; // Frame Agendamento

    private JButton btnIn; //Inserir
    private JButton btnRe; //Remover
    private JButton btnE;  //Editar
    private JButton btnF;  //Filtrar
    private JButton btnEM;  //Editar mae
    private JButton btnEF;  //Editar filho

    private JTextField textFieldSearch; //Filtro 
    private JTextField textFieldMonName;
    private JTextField textFieldMonEname; // text box editar nome da mae
    private JTextField textFieldMonEsenha;  // text box editar senha da mae

    private JTextField textFieldSonEname; // text box editar nome do filho
    private JTextField textFieldSonEsenha;  // text box editar senha do filho
    private JTextField textFieldSonEconfirmasenha;  // text box editar confirmar senha do filho

    private JTextField textFieldtitle; // text box texto titulo agendamente 
    private JTextField textFieldMidia; // text box filtro midia 
    private JComboBox box;

    private UserController userController;
    private MediaController mediacontroller;
    private Son currentUser; 

    public PanelHome(UserController userController, MediaController mediacontroller, Son currentUser) {
        this.userController = userController;
        this.mediacontroller = mediacontroller;
        this.currentUser = currentUser;
        iniciarComponentes();
    }

    private void iniciarComponentes()
    {
        f=new JFrame();
        btnIn = new JButton("Inserir");
        btnRe = new JButton("Remover");
        btnE = new JButton("Editar");
        btnF = new JButton("Filtrar");
        btnEM = new JButton("Editar-Mãe");
        btnEF = new JButton("Editar-Filho");
        box = new JComboBox();   
        box.addItem("");
        box.addItem("Audio");
        box.addItem("Musica");
        box.addItem("Video");
        box.addItem("Frase");
        textFieldSearch = new JTextField(18);
        textFieldMonName = new JTextField(7);
        JPanel p1=new JPanel();
        JPanel panelTable = new JPanel(new GridLayout(0,1));
        p1.add(btnIn);
        p1.add(btnRe);
        p1.add(btnE);
        p1.add(textFieldSearch);
        p1.add(new JLabel("Tipo: "));
        p1.add(box);
        p1.add(btnF);
        p1.add(new JLabel("Mãe: "));
        p1.add(textFieldMonName);
        p1.add(btnEM);
        p1.add(btnEF);
        JPanel p2=new JPanel();  
        JPanel p3=new JPanel();    
        
        //tabela
        // String data[][]={{"20.05/2019","audio","audioNovo","8","sim"},{"20.05/2019","oi","audioNovo","8","sim"}};
        //String data[][]={getMediaByParam("userEmail",currentUser.getEmail())};        
       // String column[]={"Data","Tipo","Título","Nota","Vizualizado"};
       ArrayList<ArrayList<String>> data= new ArrayList<ArrayList<String>>();

       ArrayList<Media> medias = mediacontroller.getMediaByParam("userEmail",currentUser.getEmail());
       for (Media userMedia : medias) {
                
       }
       final JTable jt= new JTable(data,column);
        final JTextField field1 = new JTextField(3);
        final JTextField field2 = new JTextField(3);
        jt.setRowSelectionAllowed(true);
        jt.setColumnSelectionAllowed(false);

        //selecionar linha na tabela
        JButton select = new JButton("Select");
        select.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                int index1 = 0;
                int index2 = 0;
                try {
                    index1 = Integer.valueOf(field1.getText());
                    index2 = Integer.valueOf(field2.getText());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }

                if (index1 < 0 || index2 < 0 ||
                    index1 >= jt.getRowCount() ||
                    index2 >= jt.getRowCount()) {
                    JOptionPane.showMessageDialog(jt, "Fora do alcance");
                } else {
                    jt.setRowSelectionInterval(index1, index2);
                }
            }
        });
        JScrollPane sp=new JScrollPane(jt);
        panelTable.add(sp);
        p1.add(sp);
        JTabbedPane abas=new JTabbedPane();  
        //
        abas.add("Filho",p1); //Tabela Pane
        abas.add("Mãe",p2);  
        abas.add("Administrador",p3);
        f.add(abas);  
        // f.add(panelTable);  
        //
        f.setLocationRelativeTo(null);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);  
        f.setVisible(true);

        //Eventos botão 
        //evento botao inserir agendanmento
        btnIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 frameAgen= new JFrame("Inserir Agendamento");
                 frameAgen.setLayout(new GridLayout(0,1));
                 
                 JPanel pIta=new JPanel(); //painel inserir titulo agendamento
                 //data picker
                 JPanel pDa=new JPanel(); //painel data agendamento
                // JDatePicker picker = new JDatePicker();
                //  picker.setTextEditable(true);
                //  picker.setShowYearButtons(true);
                //  pDa.add((JComponent) picker);
                //  JPanel DatePanel = new JPanel();
                //  DatePanel.setLayout(new BorderLayout());
                //  DatePanel.add(pDa, BorderLayout.WEST);
                //  BorderLayout fb = new BorderLayout();
                //  frameAgen.setLayout(fb);
                //  frameAgen.getContentPane().add(DatePanel, BorderLayout.WEST);
                 //
                 
                 JPanel pBa=new JPanel(); //painel botões agendamento
                 JPanel pMa= new JPanel(); //painel midia agendamento
                 JButton btnOa= new JButton("Ok"); //botao Ok do inserir agendamento
                 JButton btnCa= new JButton("Cancelar"); //botao cancelar do agendamento
                 JButton btnFa = new JButton("Filtrar"); //botao filtrar agendamento
          
                 textFieldtitle = new JTextField(7);
                 textFieldMidia = new JTextField(7);
                 pIta.add(new JLabel("Titulo: "));
                 pIta.add(textFieldtitle);
                 pDa.add(new JLabel("Data: "));
                 pDa.add(textFieldMidia);
                 pMa.add(new JLabel("Mídia: "));
                 pMa.add(btnFa);
                 pBa.add(btnOa);
                 pBa.add(btnCa);
                 frameAgen.add(pIta);
                 frameAgen.add(pDa);
                 frameAgen.add(pMa);
                  
                 frameAgen.setSize(250,180);
                 frameAgen.setLocationRelativeTo(null);  
                 frameAgen.setVisible(true);
            }
          }
        );
        //evento botao Remover agendanmento
        btnRe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                             
            }
          }
        );

        //evento botao Editar agendanmento
        btnE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
            }
          }
        );

        //evento botao Filtrar  agendanmento
        btnF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                             
            }
          }
        );

        //evento botao Editar Mãe  
        btnEM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameEMon = new JFrame("Editar Mãe");
                frameEMon.setLayout(new GridLayout(0,1));

                JPanel pN=new JPanel(); //painel nome
                JPanel pS=new JPanel(); //painel senha
                JPanel pB=new JPanel(); //painel botões
                JButton btnMok= new JButton(); //botao Ok do editar mae
                JButton btnMcancel= new JButton(); //botao cancelar do editar mae

                textFieldMonEname = new JTextField(7);
                textFieldMonEsenha = new JTextField(7);

                btnMok = new JButton("Ok");
                btnMcancel = new JButton("Cancel");
                pN.add(new JLabel("Nome: "));
                pN.add(textFieldMonEname);
                pS.add(new JLabel("Senha: "));
                pS.add(textFieldMonEsenha);
                pB.add(btnMok);
                pB.add(btnMcancel);
                frameEMon.add(pN);
                frameEMon.add(pS);
                frameEMon.add(pB);
                frameEMon.setSize(250,180);
                frameEMon.setLocationRelativeTo(null);  
                frameEMon.setVisible(true);
                
                btnMok.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                                     
                    }
                  }
                );

                btnMcancel.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frameEMon.setVisible(false);                    
                    }
                  }
                );
            }
          }
        );

        //evento botao Editar Filho  
        btnEF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameESon = new JFrame("Editar Filho");
                frameESon.setLayout(new GridLayout(0,1));

                JPanel pNf=new JPanel(); //painel nome filho
                JPanel pSf=new JPanel(); //painel senha filho
                JPanel pCsf=new JPanel(); //painel confirma senha filho
                JPanel pBf=new JPanel(); //painel botões filho

                JButton btnSonOk= new JButton(); //botao ok do editar filho
                JButton btnSonCancel= new JButton(); //botao cancelar do editar filho

                textFieldSonEname = new JTextField(7);
                textFieldSonEsenha = new JTextField(7);
                textFieldSonEconfirmasenha = new JTextField(7);

                btnSonOk = new JButton("Ok");
                btnSonCancel = new JButton("Cancel");

                pNf.add(new JLabel("Nome: "));
                pNf.add(textFieldSonEname);
                pSf.add(new JLabel("Senha: "));
                pSf.add(textFieldSonEsenha);
                pCsf.add(new JLabel("Confirmar Senha: "));
                pCsf.add(textFieldSonEconfirmasenha);
                pBf.add(btnSonOk);
                pBf.add(btnSonCancel);

                frameESon.add(pNf);
                frameESon.add(pSf);
                frameESon.add(pCsf);
                frameESon.add(pBf);
                frameESon.setSize(250,180);
                frameESon.setLocationRelativeTo(null);  
                frameESon.setVisible(true);

                btnSonCancel.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println(userController.getUsers().get(0).getName());
                        frameESon.setVisible(false);           
                    }
                  } 
                );             
                btnSonOk.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                      System.out.println(textFieldSonEname.getText());
                      System.out.println(userController.getUsers());
                      String newName = textFieldSonEname.getText();
                      
                      String newPassStr = textFieldSonEsenha.getText();
                      String confirmPassStr = textFieldSonEconfirmasenha.getText();
                      int newPass = 0;
                      int confirmPass = 0;
                      try {
                        newPass = Integer.parseInt(newPassStr);
                        confirmPass = Integer.parseInt(confirmPassStr);
                      } finally {
                        if(!newName.isEmpty()) {
                          try {
                            userController.setName(currentUser, currentUser, newName);
                          } catch(Exception E) {
                            E.printStackTrace();
                          }
                        } 
                        if(!newPassStr.isEmpty() && newPass == confirmPass) {
                          try {
                            userController.setPass(currentUser, currentUser, newPass);
                          } catch(Exception E) {
                            E.printStackTrace();
                          }
                        }
                      }
                    }
                  }
                );              
            }
          }
        );
}}  
  