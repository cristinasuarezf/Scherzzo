/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFrames;

import clases.RellenarComboBox;
import clases.conectar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


/**
 *
 * @author bombón
 */
public class Menu_Maestros extends javax.swing.JFrame {
    /**
     * Creates new form alumno
     */
    public Menu_Maestros() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setTitle("Menú Maestros - Scherzzo");
        ImageIcon icono = new ImageIcon("C:\\Users\\Fer\\OneDrive\\Documentos\\NetBeansProjects"
                + "\\Scherzzo\\src\\imagenes\\Scherzzo.jpg"); 
        this.setIconImage(icono.getImage());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        personita = new javax.swing.JLabel();
        BTNAlta = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        BTNConsulta = new javax.swing.JButton();
        BTNBaja = new javax.swing.JButton();
        BTNModificar = new javax.swing.JButton();
        id1 = new javax.swing.JLabel();
        fondo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(172, 204, 244));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        personita.setBackground(new java.awt.Color(172, 204, 244));
        personita.setForeground(new java.awt.Color(172, 204, 244));
        personita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura_de_pantalla_2023-04-19_094429-removebg-preview.png"))); // NOI18N
        getContentPane().add(personita, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        BTNAlta.setText("Dar de alta");
        BTNAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAltaActionPerformed(evt);
            }
        });
        getContentPane().add(BTNAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 130, 40));

        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flechita.png"))); // NOI18N
        regresar.setBorderPainted(false);
        regresar.setContentAreaFilled(false);
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        getContentPane().add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 40));

        BTNConsulta.setText("Consultar Maestro");
        BTNConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNConsultaActionPerformed(evt);
            }
        });
        getContentPane().add(BTNConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 130, 40));

        BTNBaja.setText("Dar de baja");
        BTNBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBajaActionPerformed(evt);
            }
        });
        getContentPane().add(BTNBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 130, 40));

        BTNModificar.setText("Actualizar datos");
        BTNModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNModificarActionPerformed(evt);
            }
        });
        getContentPane().add(BTNModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 130, 40));

        id1.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        id1.setText("MAESTROS");
        getContentPane().add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 5, -1, 40));

        fondo.setEditable(false);
        fondo.setBackground(new java.awt.Color(172, 204, 244));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        this.dispose();//cerrar ventana actual
        PagPrincipal principal = new PagPrincipal();
        principal.setVisible(true);
    }//GEN-LAST:event_regresarActionPerformed

    private void BTNAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAltaActionPerformed
        this.dispose();
        Docente a = new Docente();
        a.setVisible(true);
    }//GEN-LAST:event_BTNAltaActionPerformed

    private void BTNConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNConsultaActionPerformed
        this.dispose();
        Maestro_Busqueda_baja mc = new Maestro_Busqueda_baja();
        mc.setVisible(true);
    }//GEN-LAST:event_BTNConsultaActionPerformed

    private void BTNModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNModificarActionPerformed
        this.dispose();
        Maestro_Busqueda mb = new Maestro_Busqueda();
        mb.setVisible(true);
    }//GEN-LAST:event_BTNModificarActionPerformed

    private void BTNBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBajaActionPerformed
        this.dispose();
        Maestro_Busqueda_baja mb = new Maestro_Busqueda_baja();
        mb.setVisible(true);
    }//GEN-LAST:event_BTNBajaActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Maestros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Maestros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Maestros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Maestros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Maestros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNAlta;
    private javax.swing.JButton BTNBaja;
    private javax.swing.JButton BTNConsulta;
    private javax.swing.JButton BTNModificar;
    private javax.swing.JTextField fondo;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel personita;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables

}
