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
public class Menu_alumno extends javax.swing.JFrame {
    /**
     * Creates new form alumno
     */
    public Menu_alumno() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setTitle("Menú de alumno - Scherzzo");
        ImageIcon icono = new ImageIcon("C:\\Users\\Fer\\OneDrive\\Documentos\\NetBeansProjects"
                + "\\Scherzzo\\src\\imagenes\\Scherzzo.jpg"); 
        this.setIconImage(icono.getImage());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        personita = new javax.swing.JLabel();
        alta = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        alta1 = new javax.swing.JButton();
        alta2 = new javax.swing.JButton();
        alta3 = new javax.swing.JButton();
        id1 = new javax.swing.JLabel();
        fondo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(172, 204, 244));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        personita.setBackground(new java.awt.Color(172, 204, 244));
        personita.setForeground(new java.awt.Color(172, 204, 244));
        personita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura_de_pantalla_2023-04-19_094429-removebg-preview.png"))); // NOI18N
        getContentPane().add(personita, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        alta.setText("Dar de alta");
        alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaActionPerformed(evt);
            }
        });
        getContentPane().add(alta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 130, 40));

        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flechita.png"))); // NOI18N
        regresar.setBorderPainted(false);
        regresar.setContentAreaFilled(false);
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        getContentPane().add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 40));

        alta1.setText("Consultar alumno");
        alta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alta1ActionPerformed(evt);
            }
        });
        getContentPane().add(alta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 130, 40));

        alta2.setText("Dar de baja");
        alta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alta2ActionPerformed(evt);
            }
        });
        getContentPane().add(alta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 130, 40));

        alta3.setText("Actualizar datos");
        alta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alta3ActionPerformed(evt);
            }
        });
        getContentPane().add(alta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 130, 40));

        id1.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        id1.setText("ALUMNOS");
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

    private void altaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaActionPerformed
        this.dispose();
        Alumno_alta altas = new Alumno_alta();
        altas.setVisible(true);
    }//GEN-LAST:event_altaActionPerformed

    private void alta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alta1ActionPerformed
        this.dispose();
        Alumno_consulta_baja consulta = new Alumno_consulta_baja();
        consulta.setVisible(true);
    }//GEN-LAST:event_alta1ActionPerformed

    private void alta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alta3ActionPerformed
        this.dispose();
        Alumno_modificar modificar = new Alumno_modificar();
        modificar.setVisible(true);
    }//GEN-LAST:event_alta3ActionPerformed

    private void alta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alta2ActionPerformed
        this.dispose();
        Alumno_consulta_baja bajas = new Alumno_consulta_baja();
        bajas.setVisible(true);
    }//GEN-LAST:event_alta2ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_alumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alta;
    private javax.swing.JButton alta1;
    private javax.swing.JButton alta2;
    private javax.swing.JButton alta3;
    private javax.swing.JTextField fondo;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel personita;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables

}
