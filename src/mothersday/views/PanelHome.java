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
    private JButton btnIn; //Inserir
    private JButton btnRe; //Remover
    private JButton btnE;  //Editar
    private JButton btnF;  //Filtrar
    private JButton btnEM;  //Editar mae
    private JButton btnEF;  //Editar filho
    private JTextField textFieldSearch;
    private JTextField textFieldMonName;
    private JComboBox box;

    public PanelHome() {
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
}}  
  