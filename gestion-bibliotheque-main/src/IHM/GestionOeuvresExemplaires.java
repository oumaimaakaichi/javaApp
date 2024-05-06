package IHM;
import Utility.BibalExceptions;
import Utility.ModelTableau;
import static Utility.Utility.showMessageSucces;
import control.OeuvreControl;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import static javax.swing.JOptionPane.showConfirmDialog;
import javax.swing.table.*;
import Modele.Livre;
import Modele.Magazine;
import Modele.Oeuvre;

public class GestionOeuvresExemplaires extends javax.swing.JFrame {


    public GestionOeuvresExemplaires() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setResizable(false);
      
        tableListeOeuvre.setModel(new ModelTableau(new Object[0][0],
                new String[]{"ID", "Titre", "Auteur", "Catégorie", "Type", "Exemplaires", "Réservations"}));
        tableListeOeuvre.setRowHeight(30);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/bibliotheque_icone.png")));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ajouterBouton = new javax.swing.JButton();
        afficherButton = new javax.swing.JButton();
        modifierBouton = new javax.swing.JButton();
        supprimerButton = new javax.swing.JButton();
        exemplaireButton = new javax.swing.JButton();
        retourButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        RecherchCombo = new javax.swing.JComboBox<>();
        RecherchField = new javax.swing.JTextField();
        RecherchBouton = new javax.swing.JButton();
        panListeOeuvre = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableListeOeuvre = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 51, 0));
        jLabel1.setText("Gestion des Oeuvres et Exemplaires ");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));

        ajouterBouton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ajouterBouton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ajouter.png"))); // NOI18N
        ajouterBouton.setText("Ajouter");
        ajouterBouton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        ajouterBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterBoutonActionPerformed(evt);
            }
        });

        afficherButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        afficherButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Programming-Show-Property-icon.png"))); // NOI18N
        afficherButton.setText("Afficher");
        afficherButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        afficherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afficherButtonActionPerformed(evt);
            }
        });

        modifierBouton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        modifierBouton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/modifier.png"))); // NOI18N
        modifierBouton.setText("Modifier ");
        modifierBouton.setEnabled(false);
        modifierBouton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        modifierBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierBoutonActionPerformed(evt);
            }
        });

        supprimerButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        supprimerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/supprimer.png"))); // NOI18N
        supprimerButton.setText("Supprimer");
        supprimerButton.setEnabled(false);
        supprimerButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        supprimerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerButtonActionPerformed(evt);
            }
        });

        exemplaireButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exemplaireButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Book-icon.png"))); // NOI18N
        exemplaireButton.setText("Exemplaire");
        exemplaireButton.setEnabled(false);
        exemplaireButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        exemplaireButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exemplaireButtonActionPerformed(evt);
            }
        });

        retourButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        retourButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Go-back-icon.png"))); // NOI18N
        retourButton.setText("Retour");
        retourButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        retourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retourButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(exemplaireButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(supprimerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ajouterBouton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(afficherButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modifierBouton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(retourButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(ajouterBouton)
                .addGap(39, 39, 39)
                .addComponent(afficherButton)
                .addGap(40, 40, 40)
                .addComponent(modifierBouton)
                .addGap(39, 39, 39)
                .addComponent(supprimerButton)
                .addGap(31, 31, 31)
                .addComponent(exemplaireButton)
                .addGap(30, 30, 30)
                .addComponent(retourButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Recherche", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 102))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(108, 92, 92));
        jLabel2.setText("Rechercher par");

        RecherchCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Identifiant", "Titre", "Tout afficher" }));
        RecherchCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecherchComboActionPerformed(evt);
            }
        });

        RecherchBouton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RecherchBouton.setText("Recherche");
        RecherchBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecherchBoutonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(RecherchField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RecherchBouton))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(RecherchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(RecherchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RecherchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RecherchBouton))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        panListeOeuvre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Liste des Oeuvres", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 102))); // NOI18N

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tableListeOeuvre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Titre", "Auteur", "Catégorie", "Type", "Exemplaires ", "Réservations"
            }
        ));
        tableListeOeuvre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableListeOeuvreMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableListeOeuvre);

        javax.swing.GroupLayout panListeOeuvreLayout = new javax.swing.GroupLayout(panListeOeuvre);
        panListeOeuvre.setLayout(panListeOeuvreLayout);
        panListeOeuvreLayout.setHorizontalGroup(
            panListeOeuvreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panListeOeuvreLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panListeOeuvreLayout.setVerticalGroup(
            panListeOeuvreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panListeOeuvre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panListeOeuvre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modifierBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierBoutonActionPerformed
        // TODO add your handling code here:
        Oeuvre oeuvre = getOeuvreInfos();
        if (null != oeuvre) {
            ModificationOeuvre modificationOeuvre = new ModificationOeuvre(this, true, oeuvre);
            modificationOeuvre.setLocationRelativeTo(null);
            modificationOeuvre.setVisible(true);
        }
    }//GEN-LAST:event_modifierBoutonActionPerformed

    private void RecherchComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecherchComboActionPerformed
        // TODO add your handling code here:
         if (RecherchCombo.getSelectedItem().equals("Tout afficher")) {
            try {
                ArrayList<Oeuvre> listOeuvres = OeuvreControl.getListOeuvres();
                fillOeuvreJtable(listOeuvres);
                RecherchBouton.setEnabled(false);
                RecherchField.setEnabled(false);
            } catch (BibalExceptions e) {
                System.out.println("IHM.GestionUsager.RecherchComboActionPerformed() : Erreurs");
            }
        } else {
            RecherchBouton.setEnabled(true);
            RecherchField.setEnabled(true);
        }
    }//GEN-LAST:event_RecherchComboActionPerformed

    private void retourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retourButtonActionPerformed
//         TODO add your handling code here:
         menu m=new menu();
        this.hide();
        m.show();
    }//GEN-LAST:event_retourButtonActionPerformed

    private void RecherchBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecherchBoutonActionPerformed
        // TODO add your handling code here:
        String rechPar = RecherchCombo.getSelectedItem().toString();
        String textARechercher = RecherchField.getText().trim();
        if (textARechercher.length() > 0) {
            ArrayList<Oeuvre> listOeuvres;
            try {
                switch (rechPar) {
                    case "Identifiant":
                        int identifiant = parseInt(textARechercher);
                        Oeuvre oeuvre = OeuvreControl.findById(identifiant);
                        fillOeuvreJtable(new ArrayList<Oeuvre>() {
                            {
                                add(oeuvre);
                            }
                        });
                        break;
                    case "Titre":
                        listOeuvres = OeuvreControl.findByTitre(textARechercher);
                        fillOeuvreJtable(listOeuvres);
                        break;
                    case "Tout afficher":
                        listOeuvres = OeuvreControl.getListOeuvres();
                        fillOeuvreJtable(listOeuvres);
                        break;
                }
            } catch (BibalExceptions e) {
                System.out.println("IHM.GestionUsager.RecherchBoutonActionPerformed() : Erreurs");
            } catch (NumberFormatException e) {
                showMessageSucces("Identifiant non valide");
            }
        }
    }//GEN-LAST:event_RecherchBoutonActionPerformed

    private void ajouterBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterBoutonActionPerformed
        // TODO add your handling code here:
        AjoutOeuvre ajoutOeuvre = new AjoutOeuvre(this, true);
        ajoutOeuvre.setLocationRelativeTo(null);
        ajoutOeuvre.setVisible(true);
    }//GEN-LAST:event_ajouterBoutonActionPerformed

    private void afficherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afficherButtonActionPerformed
        // TODO add your handling code here:
         try {
            ArrayList<Oeuvre> listOeuvres = OeuvreControl.getListOeuvres();
            fillOeuvreJtable(listOeuvres);
        } catch (BibalExceptions ex) {
            System.out.println("IHM.GestionOeuvre.afficherButtonActionPerformed()");
        }
    }//GEN-LAST:event_afficherButtonActionPerformed

    private void supprimerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerButtonActionPerformed
        // TODO add your handling code here:
        try {
            Oeuvre oeuvre = getOeuvreInfos();
            String message;
            if (null != oeuvre) {
                if (oeuvre.getExamplairesOeuvre().size() > 0) {
                    message = "Vous ne pouvez pas supprimer cette oeuvre\n"
                            + " Elle a " + oeuvre.getExamplairesOeuvre().size() + " exemplaire"
                            + (oeuvre.getExamplairesOeuvre().size() > 1 ? "s" : "");
                    showMessageSucces(message);
                } else {
                    message = "Cette oeuvre a " + oeuvre.getExamplairesOeuvre().size() + " exemplaire\n"
                            + "\n Voulez-vous la supprimer ?";
                    int reponse = showConfirmDialog(null, message,
                            "Avertissement", JOptionPane.OK_CANCEL_OPTION);
                    if (reponse == JOptionPane.OK_OPTION) {
                        OeuvreControl.supprimer(oeuvre);
                        ((ModelTableau) tableListeOeuvre.getModel()).removeRow(tableListeOeuvre.getSelectedRow());
                        showMessageSucces("L'Oeuvre a bien été supprimée");

                    }
                }
            }

        } catch (BibalExceptions ex) {
            System.out.println("IHM.GestionOeuvresExemplaires.supprimerButtonActionPerformed()");
        }
    }//GEN-LAST:event_supprimerButtonActionPerformed

    private void exemplaireButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exemplaireButtonActionPerformed
        // TODO add your handling code here:
         Oeuvre oeuvre = getOeuvreInfos();
        if (null != oeuvre) {
            GestionExemplaires exemplaires = new GestionExemplaires(this, true, getOeuvreInfos());
            exemplaires.setLocationRelativeTo(null);
            exemplaires.setVisible(true);
        }
    }//GEN-LAST:event_exemplaireButtonActionPerformed

    private void tableListeOeuvreMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableListeOeuvreMouseReleased
        // TODO add your handling code here:
        int row = tableListeOeuvre.getSelectedRow();
        int nbreCol = tableListeOeuvre.getColumnCount();

        dataLigneSelected = new Object[nbreCol];
        if (row >= 0) {
            for (int i = 0; i < nbreCol; i++) {
                dataLigneSelected[i] = tableListeOeuvre.getModel().getValueAt(row, i);
            }
            modifierBouton.setEnabled(true);
            supprimerButton.setEnabled(true);
            exemplaireButton.setEnabled(true);
        } else {
            modifierBouton.setEnabled(false);
            supprimerButton.setEnabled(false);
            exemplaireButton.setEnabled(true);
        }
    }//GEN-LAST:event_tableListeOeuvreMouseReleased
private Oeuvre getOeuvreInfos() {
        Oeuvre oeuvre = null;
        if (tableListeOeuvre.getSelectedRow() != -1) {
            int id = parseInt(dataLigneSelected[0].toString());
            String titre = dataLigneSelected[1].toString();
            String auteur = dataLigneSelected[2].toString();
            String categorie = dataLigneSelected[3].toString();
            String typeOeuvre = dataLigneSelected[4].toString();
            int nbExemplaire = parseInt(dataLigneSelected[5].toString());
            int nbResa = parseInt(dataLigneSelected[6].toString());

            if (typeOeuvre.equals(Magazine.class.getSimpleName())) {
                oeuvre = new Magazine(id, titre, auteur, categorie, nbResa);
            } else {
                oeuvre = new Livre(id, titre, auteur, categorie, nbResa);
            }
            oeuvre.getExamplairesOeuvre().setSize(nbExemplaire);
        }
        return oeuvre;

    }
 private void fillOeuvreJtable(ArrayList<Oeuvre> listOeuvres) {
        String titre[] = new String[]{"ID", "Titre",
            "Auteur", "Catégorie", "Type", "Exemplaires", "Réservations"};
        if (listOeuvres.size() > 0) {
//            pour le findByID si l'objet ajouté est null
            int nbLigne = (null == listOeuvres.get(0)) ? 0 : listOeuvres.size();
            Object data[][] = new Object[nbLigne][titre.length];
            for (int i = 0; i < nbLigne; i++) {
                Oeuvre oeuvre = listOeuvres.get(i);
                data[i][0] = oeuvre.getId();
                data[i][1] = oeuvre.getTitre();
                data[i][2] = oeuvre.getAuteur();
                data[i][3] = oeuvre.getCategorie();
                data[i][4] = oeuvre.getClass().getSimpleName();
                data[i][5] = oeuvre.getExamplairesOeuvre().size();
                data[i][6] = oeuvre.getNbResa();
            }
            ModelTableau model = new ModelTableau(data, titre);
            tableListeOeuvre.setModel(model);
            tableListeOeuvre.setRowHeight(30);
        } else {
            //afficher tableau vide
            Object data[][] = new Object[1][titre.length];
            ModelTableau model = new ModelTableau(data, titre);
            tableListeOeuvre.setModel(model);
            tableListeOeuvre.setRowHeight(1);
        }
        modifierBouton.setEnabled(false);
        supprimerButton.setEnabled(false);
        exemplaireButton.setEnabled(false);
    }
     private Object dataLigneSelected[];

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionOeuvresExemplaires.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionOeuvresExemplaires.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionOeuvresExemplaires.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionOeuvresExemplaires.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionOeuvresExemplaires().setVisible(true);
            }
        });
    }
       //public static JTable tableListeOeuvre;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RecherchBouton;
    private javax.swing.JComboBox<String> RecherchCombo;
    private javax.swing.JTextField RecherchField;
    private javax.swing.JButton afficherButton;
    private javax.swing.JButton ajouterBouton;
    private javax.swing.JButton exemplaireButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modifierBouton;
    private javax.swing.JPanel panListeOeuvre;
    private javax.swing.JButton retourButton;
    private javax.swing.JButton supprimerButton;
    public static javax.swing.JTable tableListeOeuvre;
    // End of variables declaration//GEN-END:variables
}
