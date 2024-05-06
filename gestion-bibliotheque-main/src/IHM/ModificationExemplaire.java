package IHM;


import Utility.BibalExceptions;
import Utility.ModelTableau;
import static Utility.Utility.showMessageSucces;
import control.ExemplaireControl;
import java.awt.Toolkit;
import java.awt.*;
import static java.lang.Integer.parseInt;
import Modele.Exemplaire;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class ModificationExemplaire extends javax.swing.JFrame {


      public ModificationExemplaire(Frame parent, boolean modal) {
      
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/bibliotheque_icone.png")));
    }

     public ModificationExemplaire(Frame parent, boolean modal, Exemplaire exemplaire) {
        this(parent, modal);
        identifiantField.setText(exemplaire.getId() + "");
        etatExemplaireCombo.setSelectedItem(exemplaire.getEtat());
    }

  



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        identifiantLabel = new javax.swing.JLabel();
        etatExemplaireLabel = new javax.swing.JLabel();
        identifiantField = new javax.swing.JTextField();
        etatExemplaireCombo = new javax.swing.JComboBox<>();
        annulerBouton = new javax.swing.JButton();
        modifierBouton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        titleLabel.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(153, 51, 0));
        titleLabel.setText("Modification");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        identifiantLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        identifiantLabel.setForeground(new java.awt.Color(108, 92, 92));
        identifiantLabel.setText("Identifiant");

        etatExemplaireLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etatExemplaireLabel.setForeground(new java.awt.Color(108, 92, 92));
        etatExemplaireLabel.setText("Etat");

        identifiantField.setEnabled(false);

        etatExemplaireCombo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etatExemplaireCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Neuf", "Bon", "Vieux" }));

        annulerBouton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        annulerBouton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Apps-Dialog-Close-icon.png"))); // NOI18N
        annulerBouton.setText("Annuler");
        annulerBouton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        annulerBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerBoutonActionPerformed(evt);
            }
        });

        modifierBouton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        modifierBouton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/modifier.png"))); // NOI18N
        modifierBouton.setText("Modifier");
        modifierBouton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        modifierBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierBoutonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(identifiantLabel)
                    .addComponent(etatExemplaireLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(identifiantField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etatExemplaireCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(122, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(annulerBouton)
                .addGap(94, 94, 94)
                .addComponent(modifierBouton)
                .addGap(73, 73, 73))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(identifiantLabel)
                    .addComponent(identifiantField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etatExemplaireLabel)
                    .addComponent(etatExemplaireCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modifierBouton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(annulerBouton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(titleLabel)
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modifierBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierBoutonActionPerformed
        // TODO add your handling code here:
        try {
            Exemplaire exemplaire = getExempalireInfos();
            if (null != exemplaire) {
                ExemplaireControl.modifier(exemplaire);
                ((ModelTableau) GestionExemplaires.tableExemplaires.getModel()).
                        updateRow(new Object[]{exemplaire.getId(), exemplaire.getEtat()},
                        GestionExemplaires.tableExemplaires.getSelectedRow());
                showMessageSucces("Modifications enregistrÃ©es avec succÃ¨s");
            }
        } catch (BibalExceptions e) {
            System.out.println("IHM.ModificationExemplaire.modifierBoutonActionPerformed()");
        }
    }//GEN-LAST:event_modifierBoutonActionPerformed

    private void annulerBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerBoutonActionPerformed
        // TODO add your handling code here
        this.dispose();
    }//GEN-LAST:event_annulerBoutonActionPerformed
 private Exemplaire getExempalireInfos() {
        int id = parseInt(identifiantField.getText());
        String etatExemplaire = etatExemplaireCombo.getSelectedItem().toString();

        return new Exemplaire(id, etatExemplaire);
    }
  
     
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton annulerBouton;
    private javax.swing.JComboBox<String> etatExemplaireCombo;
    private javax.swing.JLabel etatExemplaireLabel;
    private javax.swing.JTextField identifiantField;
    private javax.swing.JLabel identifiantLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton modifierBouton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
