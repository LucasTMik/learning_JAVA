package mothersday.views;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Panelhome extends javax.swing.JFrame {
        
    // Declaração de variáveis
    private JLabel jLabel1;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JButton btnIn;
    private JButton btnRe;
    private JButton btnE;
    private JPanel jPanelFilho;
    private JPanel jPanelObservacao;
    private JPanel jPanelAdmin;
    private JPanel jPanelMother;
    private JScrollPane jScrollPane1;
    private JTabbedPane jTabbedPaneContainer;
    private JTextArea jTextAreaObservacao;
    private JTextField jTextFieldCargo;
    private JTextField jTextFieldNome;
    private JTextField jTextFieldTipoSanguineo;
    // Fim da declaração de variáveis
  
    public Panelhome() {
        initComponents();
    }
  
    private void initComponents() {
       
        jTabbedPaneContainer = new JTabbedPane();
        jPanelFilho = new JPanel();
        jPanelMother = new JPanel();       
        jPanelAdmin = new JPanel();
        jPanelObservacao = new JPanel();
        jTabbedPaneContainer.add("Filho", jPanelFilho);
        jTabbedPaneContainer.add("Mãe", jPanelMother);
        jTabbedPaneContainer.add("Admin", jPanelAdmin);
            
        btnIn = new JButton("Inserir");
        jLabel3 = new JLabel();
        jTextFieldCargo = new JTextField();
        jLabel4 = new JLabel();
        jTextFieldTipoSanguineo = new JTextField();
        jScrollPane1 = new JScrollPane();
        jTextAreaObservacao = new JTextArea();
        jLabel1 = new JLabel();
        jTextFieldNome = new JTextField();
         
        jLabel1.setText("Nome");
        jLabel4.setText("Tipo Sangu\u00edneo");
        jLabel3.setText("Cargo");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        jTextAreaObservacao.setColumns(20);
        jTextAreaObservacao.setRows(5);
        jScrollPane1.setViewportView(jTextAreaObservacao);
      
        GroupLayout jPanelFilhoLayout = new javax.swing
        .GroupLayout(jPanelFilho);
        jPanelFilho.setLayout(jPanelFilhoLayout);
        jPanelFilhoLayout.setHorizontalGroup(
            jPanelFilhoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFilhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFilhoLayout.createParallelGroup
                (GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNome)
                    .addComponent(jTextFieldTipoSanguineo)
                    .addComponent(jLabel1))            
                .addContainerGap(137, Short.MAX_VALUE))
                
        );

        jPanelFilhoLayout.setVerticalGroup(
            jPanelFilhoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFilhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addComponent(jTextFieldTipoSanguineo)
                .addPreferredGap(LayoutStyle
                .ComponentPlacement.RELATED)
                .addComponent(jTextFieldNome, javax.swing
                .GroupLayout.PREFERRED_SIZE, GroupLayout
                .DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
         
        GroupLayout jPanelMotherLayout = new javax
        .swing.GroupLayout(jPanelMother);
        jPanelMother.setLayout(jPanelMotherLayout);
        jPanelMotherLayout.setHorizontalGroup(
            jPanelMotherLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMotherLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMotherLayout.createParallelGroup
                (GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCargo, javax.swing
                    .GroupLayout.PREFERRED_SIZE, 211, javax.swing
                    .GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jPanelMotherLayout.setVerticalGroup(
            jPanelMotherLayout.createParallelGroup
            (GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMotherLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(LayoutStyle.
                ComponentPlacement.RELATED)
                .addComponent(jTextFieldCargo, 
                GroupLayout.PREFERRED_SIZE, 
                GroupLayout.DEFAULT_SIZE, GroupLayout.
                PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
         
        GroupLayout jPanelPessoalLayout = new javax.
        swing.GroupLayout(jPanelAdmin);
        jPanelAdmin.setLayout(jPanelPessoalLayout);
        jPanelPessoalLayout.setHorizontalGroup(
            jPanelPessoalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPessoalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPessoalLayout.createParallelGroup
                (GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextFieldTipoSanguineo, javax
                    .swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, GroupLayout
                    .Alignment.LEADING, GroupLayout
                    .DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, 
                    Short.MAX_VALUE))
                .addContainerGap(255, Short.MAX_VALUE))
        ); 
        jPanelPessoalLayout.setVerticalGroup(
            jPanelPessoalLayout.createParallelGroup(GroupLayout
            .Alignment.LEADING)
            .addGroup(jPanelPessoalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(LayoutStyle
                .ComponentPlacement.RELATED)
                .addComponent(jTextFieldTipoSanguineo, javax.swing
                .GroupLayout.PREFERRED_SIZE, GroupLayout
                .DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        //Configuração 
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        //Configurar tamanho na horizontal
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout
            .Alignment.LEADING)
            .addComponent(jTabbedPaneContainer, GroupLayout
            .DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        //Configurar tamanho na vertical
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout
            .Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneContainer, javax.swing
                .GroupLayout.PREFERRED_SIZE,200, javax.swing
                .GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle
                .ComponentPlacement.RELATED, GroupLayout
                .DEFAULT_SIZE, Short.MAX_VALUE)
        ));
        pack();
    }
     

     
}