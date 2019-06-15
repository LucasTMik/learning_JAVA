package mothersday.views;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Panelhome extends javax.swing.JFrame {
        
    // Declaração de variáveis
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelFilho;
    private javax.swing.JPanel jPanelObservacao;
    private javax.swing.JPanel jPanelAdmin;
    private javax.swing.JPanel jPanelMother;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPaneContainer;
    private javax.swing.JTextArea jTextAreaObservacao;
    private javax.swing.JTextField jTextFieldCargo;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldTipoSanguineo;
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
            
      
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCargo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldTipoSanguineo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaObservacao = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
         
    
        jLabel1.setText("Nome");
        jLabel4.setText("Tipo Sangu\u00edneo");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        jLabel3.setText("Cargo");
        jTextAreaObservacao.setColumns(20);
        jTextAreaObservacao.setRows(5);
        jScrollPane1.setViewportView(jTextAreaObservacao);
      

        javax.swing.GroupLayout jPanelFilhoLayout = new javax.swing
        .GroupLayout(jPanelFilho);
        jPanelFilho.setLayout(jPanelFilhoLayout);
        jPanelFilhoLayout.setHorizontalGroup(
            jPanelFilhoLayout.createParallelGroup(javax.swing
            .GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFilhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFilhoLayout.createParallelGroup
                (javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNome, javax.swing.
                    GroupLayout.PREFERRED_SIZE, 228, javax.swing
                    .GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(137, Short.MAX_VALUE))
        );

        jPanelFilhoLayout.setVerticalGroup(
            jPanelFilhoLayout.createParallelGroup(javax.swing
            .GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFilhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle
                .ComponentPlacement.RELATED)
                .addComponent(jTextFieldNome, javax.swing
                .GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout
                .DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
         
        javax.swing.GroupLayout jPanelMotherLayout = new javax
        .swing.GroupLayout(jPanelMother);
        jPanelMother.setLayout(jPanelMotherLayout);
        jPanelMotherLayout.setHorizontalGroup(
            jPanelMotherLayout.createParallelGroup(javax.swing
            .GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMotherLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMotherLayout.createParallelGroup
                (javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCargo, javax.swing
                    .GroupLayout.PREFERRED_SIZE, 211, javax.swing
                    .GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jPanelMotherLayout.setVerticalGroup(
            jPanelMotherLayout.createParallelGroup
            (javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMotherLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.
                ComponentPlacement.RELATED)
                .addComponent(jTextFieldCargo, javax.swing.
                GroupLayout.PREFERRED_SIZE, javax.swing.
                GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.
                PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
         
        javax.swing.GroupLayout jPanelPessoalLayout = new javax.
        swing.GroupLayout(jPanelAdmin);
        jPanelAdmin.setLayout(jPanelPessoalLayout);
        jPanelPessoalLayout.setHorizontalGroup(
            jPanelPessoalLayout.createParallelGroup(javax.swing
            .GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPessoalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPessoalLayout.createParallelGroup
                (javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextFieldTipoSanguineo, javax
                    .swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout
                    .Alignment.LEADING, javax.swing.GroupLayout
                    .DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, 
                    Short.MAX_VALUE))
                .addContainerGap(255, Short.MAX_VALUE))
        ); 
        jPanelPessoalLayout.setVerticalGroup(
            jPanelPessoalLayout.createParallelGroup(javax.swing.GroupLayout
            .Alignment.LEADING)
            .addGroup(jPanelPessoalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle
                .ComponentPlacement.RELATED)
                .addComponent(jTextFieldTipoSanguineo, javax.swing
                .GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout
                .DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        //Configuração do layout da home 
        javax.swing.GroupLayout layout = new javax.swing.
        GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        //Configurar tamanho na horizontal
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout
            .Alignment.LEADING)
            .addComponent(jTabbedPaneContainer, javax.swing.GroupLayout
            .DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        //Configurar tamanho na vertical
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout
            .Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneContainer, javax.swing
                .GroupLayout.PREFERRED_SIZE,200, javax.swing
                .GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle
                .ComponentPlacement.RELATED, javax.swing.GroupLayout
                .DEFAULT_SIZE, Short.MAX_VALUE)
        ));
        pack();
    }
     

     
}