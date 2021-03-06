/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loiseau.ihm;


import java.awt.Component;
import java.util.Vector;
import static loiseau.ihm.JDialogMoteur.art;
import loiseau.stockage.Article_fabrication;
import loiseau.stockage.telecommande;

/**
 *
 * @author guillaume
 */
public class JDialogueTelecomande extends javax.swing.JDialog {

    /**
     * Creates new form JDialogueTelecomande
     */
    public JDialogueTelecomande(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public JDialogueTelecomande(java.awt.Frame parent, boolean modal, Vector<telecommande> v) {
        super(parent, modal);
        initComponents();
        lesTele = v;
    }
    Vector<telecommande> lesTele;
    static Article_fabrication art;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAjout = new javax.swing.JButton();
        cbbTelecomande = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        txtQt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnAjout.setText("Ajouter");
        btnAjout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAjoutMouseClicked(evt);
            }
        });

        cbbTelecomande.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbTelecomandeItemStateChanged(evt);
            }
        });

        jLabel1.setText("Quantité");

        txtQt.setText("1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 334, Short.MAX_VALUE)
                .addComponent(btnAjout))
            .addComponent(cbbTelecomande, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtQt, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbbTelecomande, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtQt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(btnAjout))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        for (telecommande t : lesTele) {
            cbbTelecomande.addItem(t.getNom_telecommande());
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnAjoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAjoutMouseClicked
        // TODO add your handling code here:
        art=new Article_fabrication();       
        art.setNom(lesTele.get(cbbTelecomande.getSelectedIndex()).getNom_telecommande());
        art.setRef_article(lesTele.get(cbbTelecomande.getSelectedIndex()).getRef_telecommande());
        art.setPrix(lesTele.get(cbbTelecomande.getSelectedIndex()).getPrix_telecommande());
        art.setId_article_fabrication(lesTele.get(cbbTelecomande.getSelectedIndex()).getId_telecommande());
        art.setQuantite(Integer.parseInt(txtQt.getText()));
        art.setType_article(1);
        art.setLargeur(0);
        art.setPuissance_moteur(0);
        art.setCouleur_coffre(1);
        art.setCouleur_coulisse(1);
        art.setCouleur_tablier(1);
        art.setCote_manoeuvre("0");
        art.setType_coulisse(1);
        art.setType_lame(1);
        art.setType_manoeuvre(1);
        art.setTelecommande(1);
        art.setHors_cote(1);
        art.setType_pose(1);
        art.setType_moteur("0");
        dispose();
    }//GEN-LAST:event_btnAjoutMouseClicked

    private void cbbTelecomandeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbTelecomandeItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbTelecomandeItemStateChanged
    public static Article_fabrication openForm(Component cpt, Vector<telecommande> v) {
        art = null;
        JDialogueTelecomande tel = new JDialogueTelecomande(null, true, v);
        tel.setLocationRelativeTo(cpt);
        tel.setVisible(true);
        return art;
    }

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
            java.util.logging.Logger.getLogger(JDialogueTelecomande.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogueTelecomande.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogueTelecomande.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogueTelecomande.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogueTelecomande dialog = new JDialogueTelecomande(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjout;
    private javax.swing.JComboBox cbbTelecomande;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtQt;
    // End of variables declaration//GEN-END:variables
}
