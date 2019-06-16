package mothersday.views;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import mothersday.controllers.*;
import mothersday.models.*;

public class PanelHome {  
    private JFrame f;
    private JFrame frameEMon; // Frame editar mãe
    private JFrame frameESon; // Frame editar Filho 
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
    private JComboBox box;

    public PanelHome(Son s) {
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
        box.addItem("tudo bem?");
        textFieldSearch = new JTextField(18);
        textFieldMonName = new JTextField(7);
        JTextArea ta=new JTextArea(200,200);  
        JPanel p1=new JPanel();
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
        p1.add(ta);  
        JTabbedPane tp=new JTabbedPane();  
        tp.setSize(1350,400);  
        tp.add("Filho",p1); 
        tp.add("Mãe",p2);  
        tp.add("Administrador",p3);
        
        f.add(tp);  
        f.setLocationRelativeTo(null);
        f.setSize(1350,400);  
        f.setVisible(true);

        //Eventos botão 
        //evento botao inserir agendanmento
        btnIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                               
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
                        frameESon.setVisible(false);           
                    }
                  } 
                );             
                btnSonOk.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                                     
                    }
                  }
                );              
            }
          }
        );
}}  
  